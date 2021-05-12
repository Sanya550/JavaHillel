package HW21.service;

import HW21.database.Database;
import HW21.entity.Account;
import HW21.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountService {
    private static final String SELECT_ALL_ACCOUNT_QUERY = "SELECT * FROM accounts";
    private static final String SAVE_ACCOUNT_QUERY = "INSERT INTO accounts (client_id, number, value) VALUES (?,?,?)";
    private static final String UPDATE_Account_QUERY = "UPDATE accounts SET client_id = ?,number = ?,value = ? WHERE id = ?";
    private static final String DELETE_Account_QUERY = "DELETE FROM accounts WHERE id = ? ";
    private static final String GET_NUMBER_BY_VALUE_ACCOUNT_QUERY = "SELECT number FROM accounts WHERE value > ?";
    private static final String SELECT_BY_ID_CLIENT_QUERY = "SELECT * FROM clients c INNER JOIN accounts a ON c.id = a.client_id";

    public List<Account> read() {
        List<Account> account = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_ACCOUNT_QUERY);
            while (resultSet.next()) {
                Account account1 = new Account();
                account1.setId(resultSet.getLong("id"));
                account1.setClient_id(resultSet.getLong("client_id"));
                account1.setNumber(resultSet.getString("number"));
                account1.setValue(resultSet.getDouble("value"));
                account.add(account1);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    public void create(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SAVE_ACCOUNT_QUERY)) {
            preparedStatement.setLong(1, account.getClient_id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_Account_QUERY)) {
            preparedStatement.setLong(1, account.getClient_id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.setLong(4, account.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_Account_QUERY)) {
            preparedStatement.setLong(1, account.getId());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Account> getPhoneByValue(double value) {
        List<Account> accountsPhone = new ArrayList<>();
        try (Connection connection = Database.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_NUMBER_BY_VALUE_ACCOUNT_QUERY);
            preparedStatement.setDouble(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Account account = new Account();
                account.setNumber(resultSet.getString("number"));
                accountsPhone.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountsPhone;
    }

    public Map<Account, Client> getByClientId() {
        HashMap<Account, Client> accountClientHashMap = new HashMap<>();
        List<Account> accounts = new ArrayList<>();
        ArrayList<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection()) {
            PreparedStatement preparedStatement = connection.
                    prepareStatement(SELECT_BY_ID_CLIENT_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Account account = new Account();
                Client client = new Client();
                account.setId(resultSet.getLong("id"));
                account.setClient_id(resultSet.getLong("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                client.setId(resultSet.getLong("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAbout(resultSet.getString("about"));
                accounts.add(account);
                clients.add(client);
                accountClientHashMap.put(account, client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountClientHashMap;
    }
}