public class ContaPoupanca extends Conta implements FechamentoMensal {
    
    
    private final double taxaJuros;

    public ContaPoupanca(int numero, String titular, double taxaJuros) {
        super(numero, titular); 
        this.taxaJuros = taxaJuros;
    }
    public void aplicarJuros() {

        double juros = getSaldo() * taxaJuros;
       
        depositar(juros);
       
        System.out.println("Juros de R$ " + juros + " aplicados na conta " + getNumero() + ".");
    }

   
    @Override
    public void fecharMes() {
        aplicarJuros();
    }
}