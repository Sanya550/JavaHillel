package HW21.service;

import HW21.database.Database;
import HW21.entity.Account;
import HW21.entity.Status;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatusService {
    private static final String SELECT_ALL_STATUSES_QUERY = "SELECT * FROM statuses";
    private static final String SAVE_STATUSES_QUERY = "INSERT INTO statuses (alias, deskription) VALUES (?,?)";
    private static final String UPDATE_STATUSES_QUERY = "UPDATE statuses SET alias = ?, deskription = ? WHERE id = ?";
    private static final String DELETE_STATUSES_QUERY = "DELETE FROM statuses WHERE id = ?";


    public List<Status> read() {
        List<Status> statuses = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_STATUSES_QUERY);
            while (resultSet.next()) {
                Status status1 = new Status();
                status1.setId(resultSet.getLong("id"));
                status1.setAlias(resultSet.getString("alias"));
                status1.setDescription(resultSet.getString("deskription"));
                statuses.add(status1);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statuses;
    }

    public void create(Status statuses) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SAVE_STATUSES_QUERY)) {
            preparedStatement.setString(1, statuses.getAlias());
            preparedStatement.setString(2, statuses.getDescription());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Status statuses) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STATUSES_QUERY)) {
            preparedStatement.setString(1, statuses.getAlias());
            preparedStatement.setString(2, statuses.getDescription());
            preparedStatement.setLong(3, statuses.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Status statuses) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STATUSES_QUERY)) {
            preparedStatement.setLong(1, statuses.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
