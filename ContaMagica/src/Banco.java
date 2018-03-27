import java.util.*;


public class Banco {

    public static Queue<Cliente> fila = new LinkedList<Cliente>();
    public static Queue<Cliente> fila2 = new LinkedList<Cliente>();
    public static Scanner in = new Scanner(System.in);
    private static Cliente cliente;


    public static Caixa c1 = new Caixa(1);
    public static Caixa c2 = new Caixa(2);
    public static Caixa c3 = new Caixa(3);
    public static Caixa c4 = new Caixa(4);
    public static Caixa c5 = new Caixa(5);
    public static Caixa c6 = new Caixa(6);

    public static void main(String[] args) {

        int o = 1;
        while (o == 1) {
            System.out.println("1 para cadastrar cliente, 2 para solcitar cliente:");
            int op = in.nextInt();

            if (op == 1) {
                registroCliente();
                System.out.println("1 para continuar, 0 para sair");
                o = in.nextInt();
            } else {
                escolhaCaixa();
            }


        }

    }


    public static void registroCliente() {

        System.out.println("Informe o nome do cliente:");
        String nome = in.next();
        System.out.println("Informe a idade:");
        int idade = in.nextInt();
        fila.add(cliente = new Cliente(nome, idade));
        if (cliente.getIdade() >= 65) {
            fila2.add(cliente);
        }

        System.out.println("Fila não prioritária: " + fila);
        System.out.println("Fila prioritária" + fila2);
    }

    public static void escolhaCaixa() {
        System.out.println("Informe o número do caixa:");
        int n = in.nextInt();

        switch (n) {
            case (1):
                System.out.println("Caixa 1 solicitando: " + c1.solicitarClientePrioridade());
                break;
            case (2):
                System.out.println("Caixa 2 solicitando: " + c2.solicitarClientePrioridade());
                break;
            case (3):
                System.out.println("Caixa 3 solicitando: " + c3.solicitarClientePrioridade());
                break;
            case (4):
                System.out.println("Caixa 4 solicitando: " + c4.solicitarClientePrioridade());
                break;
            case (5):
                System.out.println("Caixa 5 solicitando: " + c5.solicitarClientePrioridade());
                break;
            case (6):
                System.out.println("Caixa 6 solicitando: " + c6.solicitarCliente());
                break;
        }

        System.out.println("Fila não prioritária: " + fila);
        System.out.println("Fila prioritária" + fila2);
    }

    public static void solicitarCliente() {

        //registroCliente();

        //  Collections.sort(fila, new Ordenacao());
        for (Cliente cliente : fila) {
            //if (cliente.getIdade() >= 65) {

            System.out.println(cliente);
        }
    }
}

