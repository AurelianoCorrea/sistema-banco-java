public class SistemaBanco {
    public static void main(String[] args) {
        
        
        ContaCorrente cc = new ContaCorrente(1, "Ana", 15.00);
        ContaPoupanca cp = new ContaPoupanca(2, "Bruno", 0.01);

        
        cc.depositar(100.00);
        cp.depositar(100.00);

        
        System.out.println("SALDOS APÓS DEPÓSITO INICIAL ");
        System.out.println("Conta Corrente (1):  " + cc.getSaldo());
        System.out.println(cp.getSaldo() + "Conta Poupança (2): ");
        System.out.println();

        
        System.out.println(" EXECUTANDO OPERAÇÕES DE TESTE  ");
        cc.sacar(500.00);
        cc.depositar(-10.00);
        System.out.println();

       
        System.out.println("FECHAMENTO DO MÊS");
        cc.fecharMes();
        cp.fecharMes();
        System.out.println();

        
        System.out.println(" SALDOS FINAIS (Passo 6) ");
        System.out.println("Conta Corrente (1): R$ " + cc.getSaldo());
        System.out.println("Conta Poupança (2): R$ " + cp.getSaldo());
    }
}