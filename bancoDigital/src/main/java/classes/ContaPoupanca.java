package classes;

/**
 *
 * @author jony_
 */
public class ContaPoupanca extends Conta{  
    
    public void imprimirSaldo(){
        System.out.println("=== Extrato Conta poupança ===");
        super.imprimirSaldoDaConta();
    }     
}
