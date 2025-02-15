public class Main {
    public static void main(String[] args) {
        Cliente breno = new Cliente();
        breno.setNome("Breno");
        
        ContaCorrente cc = new ContaCorrente(breno);
        Conta poupanca = new ContaPoupanca(breno);
        cc.transferir(100, poupanca); // chama o sacar de quem chamou o transferir e o depositar de quem recebeu

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
