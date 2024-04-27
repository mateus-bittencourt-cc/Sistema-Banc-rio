public class Funcionario extends Thread {
    private Conta contaSalario;
    private Conta contaInvestimentos;

    public Funcionario(Conta contaSalario, Conta contaInvestimentos) {
        this.contaSalario = contaSalario;
        this.contaInvestimentos = contaInvestimentos;
    }

    @Override
    public void run() {
        double salario = 1400;
        synchronized (contaSalario) {
            contaSalario.creditar(salario);
            double valorInvestido = salario * 0.2;
            contaInvestimentos.creditar(valorInvestido);
            System.out.println("Funcionario recebeu o salario de R$ " + salario + " e investiu R$ " + valorInvestido);
        }
    }
}
