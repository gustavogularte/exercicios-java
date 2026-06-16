import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Desafio2 {
    static void main() {
        ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();
        numerosInteiros.add(1);
        numerosInteiros.add(3);
        numerosInteiros.add(2);
        Collections.sort(numerosInteiros);
        for (int numero : numerosInteiros) {
            System.out.println(numero);
        }

        Titulo titulo1 = new Titulo("Cachorros");
        Titulo titulo2 = new Titulo("Avatar");
        Titulo titulo3 = new Titulo("Gatos");
        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        Collections.sort(titulos);
        for (Titulo titulo : titulos) {
            System.out.println(titulo.getNome());
        }

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
