public class Loja {
    private Conta conta;

    public Loja(Conta conta) {
        this.conta = conta;
    }

    public void pagarFuncionarios() {
        double salarioTotal = 1400 * 2;
        if (conta.getSaldo() >= salarioTotal) {
            conta.debitar(salarioTotal);
            System.out.println("Pagamento de salario para funcionarios realizado.");
        } else {
            System.out.println("Nao ha saldo suficiente para pagar os funcionarios.");
        }
    }
    
}
