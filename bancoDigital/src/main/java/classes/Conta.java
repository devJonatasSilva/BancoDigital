package classes;

/**
 *
 * @author jony_
 */
public class Conta {
    
    private int numeroDaAgencia;
    private int numeroDaConta;
    private double saldo;

    public Conta() {
    }

    public int getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }  
    
    public void saque(double valor) {
        this.saldo -= valor;
    }  
    
    public void transferencia(double valor){
    
    }   
    
}
