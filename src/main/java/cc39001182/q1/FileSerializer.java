package cc39001182.q1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSerializer implements Serializer{
    private final String name;


    public FileSerializer(String name){
        this.name=name;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int size() {
        return name.length();
    }

    @Override
    public void write() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir votre texte");
        String tex = sc.nextLine();
        try {
            FileWriter f = new FileWriter("Fichier.txt", true);
            f.write(tex);
            f.close();
        }
        catch (IOException io)
        {
            io.printStackTrace();
        }
    }
}
