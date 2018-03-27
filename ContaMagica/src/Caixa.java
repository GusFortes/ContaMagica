import java.util.Collections;

public class Caixa {
    private int numero;

    public Caixa(int numero) {
        this.numero = numero;

    }

    public int getNumero() {
        return numero;
    }

    public Cliente solicitarClientePrioridade() {
        if (Banco.fila2.size() == 0) {
            return Banco.fila.poll();
        } else {
            if (Banco.fila.contains(Banco.fila2.peek())) {
                Banco.fila.remove(Banco.fila2.peek());
            }

            return Banco.fila2.poll();
        }
    }

    public Cliente solicitarCliente() {
        if (Banco.fila2.contains(Banco.fila.peek())) {
            Banco.fila2.remove(Banco.fila.peek());
        }

        return Banco.fila.poll();
    }

}
