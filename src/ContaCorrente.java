public class ContaCorrente extends Conta implements NomeDaInterface {
    
    private final double taxaManutencao;

    public ContaCorrente(int numero, String titular, double taxaManutencao) {
        super(numero, titular); 
        this.taxaManutencao = taxaManutencao;
    }

    
    public void cobrarManutencao() {
       
        if (sacar(taxaManutencao)) {
            System.out.println("Manutenção de R$ " + taxaManutencao + " cobrada da conta " + getNumero() + ".");
        }
    }

    public void fecharMes() {
        cobrarManutencao();
    }
}