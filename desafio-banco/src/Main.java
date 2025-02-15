public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca();
        cc.transferir(100, poupanca); // chama o sacar de quem chamou o transferir e o depositar de quem recebeu

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
