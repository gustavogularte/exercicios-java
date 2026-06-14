import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    static void main() {
        Scanner input = new Scanner(System.in);
        int numeroCorreto = new Random().nextInt(100);
        int tentativas = 1;

        System.out.println("Adivinhe o número entre 0 e 100");

        for (int i = 0; i <= 5; i++) {
            System.out.println(tentativas + "° tentativa, digite um numero: ");
            int chute = input.nextInt();
            tentativas++;

            if (chute < numeroCorreto) {
                System.out.println("Número muito baixo, tente novamente");
            } else if (chute > numeroCorreto) {
                System.out.println("Número muito alto, tente novamente");
            } else {
                System.out.println("Você acertou em " + tentativas + " tentativas");
                break;
            }
        }
        System.out.println("O número correto era " + numeroCorreto);
        input.close();
    }
}
