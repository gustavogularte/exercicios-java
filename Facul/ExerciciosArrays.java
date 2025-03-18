import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExerciciosArrays {
  public static int[][] exercicio1a() {
    int[][] array = new int[3][10];

    for (int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        array[l][c] = c;
        System.out.print(array[l][c] + " ");
      }
      System.out.println();
    }

    return array;
  }

  public static int[][] exercicio1b() {
    int[][] array = new int[5][10];
    for (int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        array[l][c] = c * c;
        System.out.print(array[l][c] + " ");
      }
      System.out.println();
    }
    return array;
  }

  public static int[][] exercicio1c() {
    int[][] array = new int[6][6];
    for (int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        array[l][c] = l;
        System.out.print(array[l][c] + " ");
      }
      System.out.println();
    }
    return array;
  }

  public static int[][] exercicio1d() {
    int[][] array = new int[9][6];
    for (int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        array[l][c] = l % 2 == 0 ? -1 : 0;
        System.out.print(array[l][c] + " ");
      }
      System.out.println();
    }
    return array;
  }

  public static int[][] exercicio2() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Linhas: ");
    int linhas = scanner.nextInt();

    System.out.println("Colunas");
    int colunas = scanner.nextInt();

    int[][] array = new int[linhas][colunas];

    for (int l = 0; l < linhas; l++) {
      for (int c = 0; c < colunas; c++) {
        array[l][c] = random.nextInt(100);
        System.out.print(array[l][c] + " ");
      }
      System.out.println();
    }

    scanner.close();
    return array;
  }

  public static double[][] exercicio3() {
    Scanner scanner = new Scanner(System.in);
    double[][] array = new double[2][5];

    for (int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        System.out.print("Digite um valor: ");
        double numero = scanner.nextDouble();
        array[l][c] = numero;
      }

    }

    for (int l = 0; l < 2; l++) {
      for (int c = 0; c < 5; c++) {
        //System.out.print(array[l][c] + " ");
      }
      //System.out.println();
    }

    return array;
  }

  public static int exercicios4(double[][] array) {
    int elementos = array.length * array[0].length;
    return elementos;
  }

  public static String exercicios6(double[][] array) {
    String matriz = "";
    for (int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        if (c < array[l].length - 1) matriz += array[l][c] + " - ";
        else matriz += array[l][c] + "";
      }
      matriz += "\n";
    }
    return matriz;
  }

  public static double exercicio7(double[][] array) {
    double maiorNumero = 0;

    for (int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        if (l == 0 && c == 0) maiorNumero = array[l][c];
        if (array[l][c] >= maiorNumero) maiorNumero = array[l][c];
      }
    }

    return maiorNumero;
  }

  public static int exercicio8(int[][] array) {
    int total = 0;

    for (int[] linhas : array) {
      for (int numero : linhas) {
        total += numero;
      }
    }

    return total;
  }

  public static double exercicio9(double[][] array) {
    double total = 0;
    int elementos = array.length * array[0].length;

    for (double[] doubles : array) {
      for (double aDouble : doubles) {
        total += aDouble;
      }
    }

    double media = total / elementos;
    return media;
  }

  public static char[][] exercicio10() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int linhas = random.nextInt(5) + 1;
    int colunas = random.nextInt(3) + 1;
    char[][] array = new char[linhas][colunas];

    for (int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        System.out.print("Digite um caracter: ");
        char caracter = scanner.next().charAt(0);
        array[l][c] = caracter;
      }
    }

    for (char[] chars : array) {
      for (char aChar : chars) {
        System.out.print(aChar + " ");
      }
      System.out.println();
    }

    System.out.println("Linhas:" + linhas + " Colunas: " + colunas);
    return array;
  }

  public static ArrayList<Integer> exercicio11(int[][] array) {
    int elementos = array.length * array[0].length;
    ArrayList<Integer> arrayUni = new ArrayList<>();

    for (int[] ints : array) {
      for (int anInt : ints) {
        if (anInt >= 0) arrayUni.add(anInt);
      }
    }

    return arrayUni;
  }

  public static void main(String[] args) {
    //nt[][] resultado1 = exercicio1a();
    //int[][] resultado2 = exercicio1b();
    //int[][] resultado3 = exercicio1c();
    //int[][] resultado4 = exercicio1d();
    //double[][] resultado5 = exercicio3();
    //int resultado6 = exercicios4(resultado5);
    //System.out.println("Quantidade de elementos: " + resultado6);
    //String resultado7 = exercicios6(resultado5);
    //double resultado8 = exercicio7(resultado5);
    //int resultado9 = exercicio8(resultado1);
    //double resultado10 = exercicio9(resultado5);
    //char[][] resultado11 = exercicio10();
    //ArrayList<Integer> resultado12 = exercicio11(matriz);
    //System.out.println(resultado12);
  }
}
