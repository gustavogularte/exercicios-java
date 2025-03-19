public class ExerciciosExecoes {
  double temperatura;

  public void aumentaTemperatura(double tempMais) throws IllegalArgumentException {
    this.temperatura += tempMais;

    if (this.temperatura > 30) throw new IllegalArgumentException();

    System.out.println("Temperatura mudada para " + this.temperatura);
  }

  public void diminuiTemperatura(double tempMenos) throws IllegalArgumentException {

    this.temperatura -= tempMenos;

    if (this.temperatura < 16) throw new IllegalArgumentException();

    System.out.println("Temperatura mudada para " + this.temperatura);

  }

  public static void main(String[] args) {
    ExerciciosExecoes exerciciosExecoes = new ExerciciosExecoes();

    exerciciosExecoes.aumentaTemperatura(20);
    exerciciosExecoes.aumentaTemperatura(20);

  }
}

