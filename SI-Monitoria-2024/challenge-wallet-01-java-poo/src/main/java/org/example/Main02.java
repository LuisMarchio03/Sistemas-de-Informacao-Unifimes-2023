package org.example;

import org.example.entities.User;
import org.example.repository.UserRepository;

import java.sql.SQLException;

public class Main02 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // Criar novo usuário
        User newUser = new User(1, "João Silva", "123.456.789-00", "joao@example.com", "senha123", 100.0);
        try {
            userRepository.createUser(newUser);
            System.out.println("Novo usuário criado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao criar usuário: " + e.getMessage());
        }

        // Buscar usuário pelo ID
        try {
            User foundUser = userRepository.getUserById(1);
            if (foundUser != null) {
                System.out.println("Usuário encontrado: " + foundUser.getFullName());
            } else {
                System.out.println("Usuário não encontrado.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar usuário: " + e.getMessage());
        }

        // Atualizar dados do usuário
        User existingUser = new User(1, "Maria Oliveira", "987.654.321-00", "maria@example.com", "novaSenha", 150.0);
        try {
            userRepository.updateUser(existingUser);
            System.out.println("Dados do usuário atualizados com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar usuário: " + e.getMessage());
        }

        // Excluir usuário pelo ID
        int userIdToDelete = 2;
        try {
            userRepository.deleteUser(userIdToDelete);
            System.out.println("Usuário excluído com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao excluir usuário: " + e.getMessage());
        }

        // Listar todos os usuários
        try {
            System.out.println("Lista de usuários:");
            for (User user : userRepository.getAllUsers()) {
                System.out.println(user.getFullName() + " - " + user.getEmail());
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar usuários: " + e.getMessage());
        }
    }
}