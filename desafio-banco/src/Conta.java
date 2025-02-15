// eu posso deixar essa classe Conta abstrata "abstract class" porquê nao quero deixar ninguem criar um new Conta, apenas ContaCorrente e ContaPoupanca por que não faz sentido para minha aplicação

public abstract class Conta implements IConta{
    
     // se eu criar uma conta, será 1, se eu criar outra conta será 2 e assim por diante
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
       
    // atributos protected para que as classes filhas possam acessar
    protected int agencia;
    protected int numero;
    protected double saldo;
    
    // construtor mudado para a classe pai
    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void depositar(double valor) {
        
        
    }

    @Override
    public void sacar(double valor) {
        
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        
        
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


}
