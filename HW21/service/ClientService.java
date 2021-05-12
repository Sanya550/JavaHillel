package HW21.service;

import HW21.database.Database;
import HW21.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private static final String SELECT_ALL_CLIENTS_QUERY = "SELECT * FROM clients";
    private static final String SAVE_CLIENTS_QUERY = "INSERT INTO clients (name, email, phone, about) VALUES (?,?,?,?)";
    private static final String UPDATE_CLIENTS_QUERY = "UPDATE clients SET name = ?, email = ?, phone = ?, about = ? WHERE id = ?";
    private static final String DELETE_CLIENTS_QUERY = "DELETE FROM clients WHERE id = ?";
    private static final String FIND_CLIENT_QUERY = "SELECT * FROM clients WHERE phone = ?";
    private static final String GET_DATA_CLIENT_QUERY = "select c.name, c.email, s.alias FROM clients c\n" +
            "INNER JOIN client_status ct ON c.id = ct.client_id\n" +
            "INNER JOIN statuses s ON ct.status_id = s.id;";

    public List<Client> read() {
        List<Client> clients = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_CLIENTS_QUERY);
            while (resultSet.next()) {
                Client clients1 = new Client();
                clients1.setId(resultSet.getLong("id"));
                clients1.setName(resultSet.getString("name"));
                clients1.setEmail(resultSet.getString("email"));
                clients1.setPhone(resultSet.getLong("phone"));
                clients1.setEmail(resultSet.getString("about"));
                clients.add(clients1);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void create(Client clients) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SAVE_CLIENTS_QUERY)) {
            preparedStatement.setString(1, clients.getName());
            preparedStatement.setString(2, clients.getEmail());
            preparedStatement.setLong(3, clients.getPhone());
            preparedStatement.setString(4, clients.getAbout());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CLIENTS_QUERY)) {
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setLong(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setLong(5, client.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void delete(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CLIENTS_QUERY)) {
            preparedStatement.setLong(1, client.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Client> findByPhone(long phone) {
        List<Client> clientsPhone = new ArrayList<>();
        try (Connection connection = Database.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_CLIENT_QUERY);
            preparedStatement.setLong(1, phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            Client client = new Client();
            while (resultSet.next()){
            client.setId(resultSet.getLong("id"));
            client.setName(resultSet.getString("name"));
            client.setEmail(resultSet.getString("email"));
            client.setPhone(resultSet.getLong("phone"));
            client.setAbout(resultSet.getString("about"));
            clientsPhone.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientsPhone;
    }

    public List<Client> getClientStatus() {
        List<Client> clients = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_DATA_CLIENT_QUERY);
            while (resultSet.next()) {
                Client client = new Client();
                client.setId(resultSet.getLong("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
}