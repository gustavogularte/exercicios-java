public class ExerciciosArrays {
  public static int[][] exercicio1a() {
    int[][] array = new int[3][10];

    for(int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        array[l][c] = c;
        System.out.print(array[l][c] + " ");
      }
      System.out.println();
    }

    return array;
  }

  public static int[][] exercicio1b() {
    int [][] array = new int[5][10];
    for(int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        array[l][c] = c * c;
        System.out.print(array[l][c] + " ");
      }
      System.out.println();
    }
    return array;
  }

  public static int[][] exercicio1c() {
    int [][] array = new int[6][6];
    for(int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        array[l][c] = l;
        System.out.print(array[l][c] + " ");
      }
      System.out.println();
    }
    return array;
  }

  public static int[][] exercicio1d() {
    int [][] array = new int[9][6];
    for(int l = 0; l < array.length; l++) {
      for (int c = 0; c < array[l].length; c++) {
        array[l][c] = l % 2 == 0 ? -1 : 0;
        System.out.print(array[l][c] + " ");
      }
      System.out.println();
    }
    return array;
  }

  public static void main(String[] args) {
    //int[][] resultado1 = exercicio1a();
    //int[][] resultado2 = exercicio1b();
    //int[][] resultado3 = exercicio1c();
    int[][] resultado4 = exercicio1d();
  }
}
