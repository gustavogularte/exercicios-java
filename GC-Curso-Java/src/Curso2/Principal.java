package Curso2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    static void main() {
        try (FileWriter fileWriter = new FileWriter("arquivo.txt");) {
            fileWriter.write("Teste");
            System.out.println("Dados gravados com sucesso");
        }catch (IOException e) {
            e.printStackTrace();
        }
        Titulo titulo =  new Titulo("Avatar", 2003, 300);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}
