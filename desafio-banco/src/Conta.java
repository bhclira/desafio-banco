// eu posso deixar essa classe Conta abstrata "abstract class" porquê nao quero deixar ninguem criar um new Conta, apenas ContaCorrente e ContaPoupanca por que não faz sentido para minha aplicação

public abstract class Conta implements IConta{
       
    // atributos
       private int agencia;
       private int numero;
       private double saldo;
    
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
