package Curso1;

import java.util.Collections;
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

            Compra compra = new Compra(descricao, valor);

            cartaoCredito.comprar(compra);

            System.out.println("Saldo atual: " + cartaoCredito.getSaldo());

            System.out.println("Digite 0 ou 1 para continuar");
            comando = input.nextInt();
            input.nextLine();
        }
        Collections.sort(cartaoCredito.getCompras());
        System.out.println("COMPRAS REALIZADAS: ");
        System.out.println(cartaoCredito.getCompras());
    }
}
