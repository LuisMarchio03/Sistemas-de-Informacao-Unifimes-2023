public class Main {
    public static void main(String[] args) {
        // Creating objects of ContaBancaria class
        ContaBancaria account1 = new ContaBancaria("Alice", "123456", 1000.0);
        ContaBancaria account2 = new ContaBancaria("Bob", "987654", 500.0);

        // Simulating bank operations
        account1.depositar(500);
        account2.sacar(200);

        // Display account information
        System.out.println("Account 1:");
        System.out.println("Holder: " + account1.getTitular());
        System.out.println("Account Number: " + account1.getNumeroConta());
        System.out.println("Balance: " + account1.getSaldo());

        System.out.println();

        System.out.println("Account 2:");
        System.out.println("Holder: " + account2.getTitular());
        System.out.println("Account Number: " + account2.getNumeroConta());
        System.out.println("Balance: " + account2.getSaldo());
    }
}
