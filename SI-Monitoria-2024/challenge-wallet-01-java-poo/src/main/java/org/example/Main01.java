package org.example;

import org.example.entities.User;
import org.example.services.TransferService;
import org.example.services.WalletService;

public class Main01 {
    public static void main(String[] args) {
        // Exemplo de uso dos serviços
        TransferService transferService = new TransferService();
        WalletService walletService = new WalletService();

        // Simulação de transferência entre usuários
        User sender = new User(1, "João Silva", "123.456.789-00", "joao@example.com", "senha123", 100.0);
        User receiver = new User(2, "Maria Oliveira", "987.654.321-00", "maria@example.com", "senha456", 50.0);
        double amount = 30.0;

        boolean transferSuccess = transferService.transferMoney(sender, receiver, amount);

        if (transferSuccess) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Falha na transferência: saldo insuficiente.");
        }

        // Exibindo saldo após a transferência
        System.out.println("Saldo atual de " + sender.getFullName() + ": " + walletService.getBalance(sender));
        System.out.println("Saldo atual de " + receiver.getFullName() + ": " + walletService.getBalance(receiver));
    }
}
