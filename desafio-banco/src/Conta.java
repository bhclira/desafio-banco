// eu posso deixar essa classe Conta abstrata "abstract class" porquê nao quero deixar ninguem criar um new Conta, apenas ContaCorrente e ContaPoupanca por que não faz sentido para minha aplicação

public abstract class Conta implements IConta{
    
    // se eu criar uma conta, será 1, se eu criar outra conta será 2 e assim por diante
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
       
    // atributos protected para que as classes filhas possam acessar
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    // construtor mudado para a classe pai
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    // métodos abstratos
    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor); // no objeto de origem
        contaDestino.depositar(valor); // no objeto de destino
        
    }

    // getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Numero: %.2f", this.saldo));
    }

}
