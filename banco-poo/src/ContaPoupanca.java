public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void imprimirHistorico(){
        System.out.println("=== Histórico de transações Conta Poupança ===");
        historicoInfo();
    }
}