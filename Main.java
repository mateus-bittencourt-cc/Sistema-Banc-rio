public class Main {
    public static void main(String[] args) {
        Conta contaBanco = new Conta("Banco", 0);
        Conta contaLoja1 = new Conta("Loja 1", 0);
        Conta contaLoja2 = new Conta("Loja 2", 0);
        Conta contaFuncionario1Salario = new Conta("Funcionario 1 Salario", 0);
        Conta contaFuncionario1Investimentos = new Conta("Funcionario 1 Investimentos", 0);
        Conta contaFuncionario2Salario = new Conta("Funcionario 2 Salario", 0);
        Conta contaFuncionario2Investimentos = new Conta("Funcionario 2 Investimentos", 0);
        Conta contaFuncionario3Salario = new Conta("Funcionario 3 Salario", 0);
        Conta contaFuncionario3Investimentos = new Conta("Funcionario 3 Investimentos", 0);
        Conta contaFuncionario4Salario = new Conta("Funcionario 4 Salario", 0);
        Conta contaFuncionario4Investimentos = new Conta("Funcionario 4 Investimentos", 0);
        Conta contaCliente1 = new Conta("Cliente 1", 1000);
        Conta contaCliente2 = new Conta("Cliente 2", 1000);
        Conta contaCliente3 = new Conta("Cliente 3", 1000);
        Conta contaCliente4 = new Conta("Cliente 4", 1000);
        Conta contaCliente5 = new Conta("Cliente 5", 1000);

        Banco banco = new Banco();
        Loja loja1 = new Loja(contaLoja1);
        Loja loja2 = new Loja(contaLoja2);
        Funcionario funcionario1 = new Funcionario(contaFuncionario1Salario, contaFuncionario1Investimentos);
        Funcionario funcionario2 = new Funcionario(contaFuncionario2Salario, contaFuncionario2Investimentos);
        Funcionario funcionario3 = new Funcionario(contaFuncionario3Salario, contaFuncionario3Investimentos);
        Funcionario funcionario4 = new Funcionario(contaFuncionario4Salario, contaFuncionario4Investimentos);
        Cliente cliente1 = new Cliente(contaCliente1);
        Cliente cliente2 = new Cliente(contaCliente2);
        Cliente cliente3 = new Cliente(contaCliente3);
        Cliente cliente4 = new Cliente(contaCliente4);
        Cliente cliente5 = new Cliente(contaCliente5);

        funcionario1.start();
        funcionario2.start();
        funcionario3.start();
        funcionario4.start();
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();

        try {
            funcionario1.join();
            funcionario2.join();
            funcionario3.join();
            funcionario4.join();
            cliente1.join();
            cliente2.join();
            cliente3.join();
            cliente4.join();
            cliente5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loja1.pagarFuncionarios();
        loja2.pagarFuncionarios();

        System.out.println("Saldos finais:");
        System.out.println("Conta Banco: R$ " + contaBanco.getSaldo());
        System.out.println("Conta Loja 1: R$ " + contaLoja1.getSaldo());
        System.out.println("Conta Loja 2: R$ " + contaLoja2.getSaldo());
        System.out.println("Conta Funcionario 1 Salario: R$ " + contaFuncionario1Salario.getSaldo());
        System.out.println("Conta Funcionario 1 Investimentos: R$ " + contaFuncionario1Investimentos.getSaldo());
        System.out.println("Conta Funcionario 2 Salario: R$ " + contaFuncionario2Salario.getSaldo());
        System.out.println("Conta Funcionario 2 Investimentos: R$ " + contaFuncionario2Investimentos.getSaldo());
        System.out.println("Conta Funcionario 3 Salario: R$ " + contaFuncionario3Salario.getSaldo());
        System.out.println("Conta Funcionario 3 Investimentos: R$ " + contaFuncionario3Investimentos.getSaldo());
        System.out.println("Conta Funcionario 4 Salario: R$ " + contaFuncionario4Salario.getSaldo());
        System.out.println("Conta Funcionario 4 Investimentos: R$ " + contaFuncionario4Investimentos.getSaldo());
        System.out.println("Conta Cliente 1: R$ " + contaCliente1.getSaldo());
        System.out.println("Conta Cliente 2: R$ " + contaCliente2.getSaldo());
        System.out.println("Conta Cliente 3: R$ " + contaCliente3.getSaldo());
        System.out.println("Conta Cliente 4: R$ " + contaCliente4.getSaldo());
        System.out.println("Conta Cliente 5: R$ " + contaCliente5.getSaldo());
    }
 
}
