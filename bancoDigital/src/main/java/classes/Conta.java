package classes;

/**
 *
 * @author jony_
 */
public abstract class Conta implements ContaInterface {
    
    private int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 001;    
    
    private int numeroDaAgencia;
    private int numeroDaConta;
    private double saldo;

    public Conta() {        
        numeroDaAgencia = AGENCIA_PADRAO;
        numeroDaConta = SEQUENCIAL++;
    }
    

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void deposito(double valor) {
        this.saldo += valor;
    }

    @Override
    public void saque(double valor) {
        this.saldo -= valor;
    }    

    @Override
    public void transferencia(ContaInterface contaDeDestino, double valor) {
        this.saque(valor);
        contaDeDestino.deposito(valor);
    }
    
    protected void imprimirSaldoDaConta() {
		//System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.numeroDaAgencia));
		System.out.println(String.format("Conta Numero: %d", this.numeroDaConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
    
}
