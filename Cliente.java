public class Cliente extends Thread {
    private int id;
    private Conta conta;
    private static int count = 1;

    public Cliente(Conta conta) {
        this.conta = conta;
        this.id = count++;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (conta) {
                if (conta.getSaldo() > 0) {
                    double valorCompra = Math.random() < 0.5 ? 100 : 200;
                    if (conta.getSaldo() >= valorCompra) {
                        conta.debitar(valorCompra);
                        System.out.println("Cliente " + id + " realizou uma compra de R$ " + valorCompra);
                    } else {
                        System.out.println("Cliente " + id + " nao possui saldo suficiente para realizar a compra.");
                    }
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
