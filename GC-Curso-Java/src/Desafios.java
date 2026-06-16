import java.util.Scanner;

public class Desafios {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        if (numero < 0) System.out.println("numero negativo");
        if (numero >= 0) System.out.println("numero positivo");

        System.out.println("Digite 2 numeros inteiros: ");
        System.out.println("Primeiro numero: ");
        int numero1 = input.nextInt();
        System.out.println("Segundo numero: ");
        int numero2 = input.nextInt();
        if (numero1 == numero2) System.out.println("O numero igual");
        else if (numero1 > numero2) System.out.println("O primeiro numero é maior");
        else System.out.println("Segundo numero é maior");

        System.out.println("""
                [1] calcular area do circulo
                [2] calcular area do quadrado""");
        int numero3 = input.nextInt();
        if (numero3 == 1) {
            System.out.println("Digite o valor do raio: ");
            int raio = input.nextInt();
            double areaCirculo = 3.14 * raio * raio;
            System.out.println("Area do Circulo: " + areaCirculo);
        } else if (numero3 == 2) {
            System.out.println("Digite o valor do lado: ");
            int lado = input.nextInt();
            double areaQuadrado = lado * lado;
            System.out.println("Area do Quadrado: " + areaQuadrado);
        }

        System.out.println("Digite um número: ");
        int fatorial = input.nextInt();
        System.out.println("Fatorial de " + fatorial);
        for (int i = fatorial - 1; i > 1; i--) {
            fatorial *= i;
        }
        System.out.println(fatorial);

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(2);
    }
}
