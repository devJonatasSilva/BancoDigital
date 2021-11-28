package classes;

/**
 *
 * @author jony_
 */
public interface ContaInterface {    
  
    double getSaldo();
    
    void deposito(double valor); 
    
    public void saque(double valor); 
    
    public void transferencia(ContaInterface contaDeDestino, double valor);
    
}
