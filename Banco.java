import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {
    private Lock lock = new ReentrantLock();

    public void transferir(Conta origem, Conta destino, double valor) {
        lock.lock();
        try {
            origem.debitar(valor);
            destino.creditar(valor);
            System.out.println("Transferencia de R$" + valor + " de " + origem.getTitular() + " para " + destino.getTitular());
        } finally {
            lock.unlock();
        }
    }
}
