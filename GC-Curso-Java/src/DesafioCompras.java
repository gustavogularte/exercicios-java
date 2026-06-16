import java.util.Scanner;

public class DesafioCompras {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limite = input.nextDouble();
        input.nextLine();
        CartaoCredito cartaoCredito = new CartaoCredito(limite);

        int comando = 1;
        while (comando != 0) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = input.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valor = input.nextDouble();

            cartaoCredito.comprar(descricao, valor);

            System.out.println("Digite 0 ou 1 para continuar");
            comando = input.nextInt();
        }
        System.out.println("COMPRAS REALIZADAS: ");
        System.out.println(cartaoCredito);
    }
}
