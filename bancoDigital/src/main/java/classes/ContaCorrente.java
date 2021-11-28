package classes;

/**
 *
 * @author jony_
 */
public class ContaCorrente extends Conta{

    public void imprimirSaldo(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirSaldoDaConta();
    }
    
}
