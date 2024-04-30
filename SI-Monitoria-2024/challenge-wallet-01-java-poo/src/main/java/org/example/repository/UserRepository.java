package org.example.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.example.entities.User;
import org.example.DatabaseConnection;

public class UserRepository {

    // Método para inserir um novo usuário no banco de dados
    public void createUser(User user) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO users (id, full_name, cpf, email, password, balance) VALUES (?, ?, ?, ?, ?)")) {
            statement.setInt(1, user.getId());
            statement.setString(2, user.getFullName());
            statement.setString(3, user.getCpf());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getPassword());
            statement.setDouble(6, user.getBalance());
            statement.executeUpdate();
        }
    }

    // Método para buscar um usuário pelo ID
    public User getUserById(int userId) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "SELECT * FROM users WHERE id = ?")) {
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return extractUserFromResultSet(resultSet);
            }
            return null; // Usuário não encontrado
        }
    }

    // Método para atualizar os dados de um usuário
    public void updateUser(User user) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "UPDATE users SET full_name = ?, cpf = ?, email = ?, password = ?, balance = ? WHERE id = ?")) {
            statement.setString(1, user.getFullName());
            statement.setString(2, user.getCpf());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.setDouble(5, user.getBalance());
            statement.setInt(6, user.getId());
            statement.executeUpdate();
        }
    }

    // Método para excluir um usuário pelo ID
    public void deleteUser(int userId) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "DELETE FROM users WHERE id = ?")) {
            statement.setInt(1, userId);
            statement.executeUpdate();
        }
    }

    // Método para listar todos os usuários
    public List<User> getAllUsers() throws SQLException {
        List<User> userList = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM users")) {
            while (resultSet.next()) {
                User user = extractUserFromResultSet(resultSet);
                userList.add(user);
            }
        }
        return userList;
    }

    // Método utilitário para extrair um objeto User a partir do ResultSet
    private User extractUserFromResultSet(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String fullName = resultSet.getString("full_name");
        String cpf = resultSet.getString("cpf");
        String email = resultSet.getString("email");
        String password = resultSet.getString("password");
        double balance = resultSet.getDouble("balance");
        return new User(id, fullName, cpf, email, password, balance);
    }
}
