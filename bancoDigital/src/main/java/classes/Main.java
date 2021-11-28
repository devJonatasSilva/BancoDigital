
package classes;

/**
 *
 * @author jony_
 */
public class Main {

    
    public static void main(String[] args) {
        
        Cliente jonatas = new Cliente();
        jonatas.setNome("Jonatas Severino da Silva");
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro josé da Silva");
                
        Conta cc1 = new ContaCorrente(jonatas);
        Conta cc2 = new ContaCorrente(pedro);
        Conta cp1 = new ContaPoupanca(jonatas);
        
        cc1.imprimirSaldoDaConta();
        cc2.imprimirSaldoDaConta();
        
        //fazer um deposito de 5000 reais na conta 1
        cc1.deposito(5000);
        //imprimir novo saldo da conta 1
        cc1.imprimirSaldoDaConta();
        //realizar uma transferencia da conta 1 para conta 2, valor 2250 reais
        cc1.transferencia(cc2, 2250);
        //imprimir o novo saldo das 3 contas
        cc1.imprimirSaldoDaConta();
        cc2.imprimirSaldoDaConta();
        cp1.imprimirSaldoDaConta();        
        //conta dois faz uma transferencia para conta poupança de 500 reais
        cc2.transferencia(cp1, 500);
        // imprimir o novo saldo das 3 contas
        cc1.imprimirSaldoDaConta();
        cc2.imprimirSaldoDaConta();
        cp1.imprimirSaldoDaConta();
    }
    
}
