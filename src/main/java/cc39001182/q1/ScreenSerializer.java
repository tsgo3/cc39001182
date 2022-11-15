package cc39001182.q1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScreenSerializer implements Serializer{

    private final String name;


    public ScreenSerializer(String name){
        this.name=name;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void write() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir votre texte");
        String tex = sc.nextLine();

        System.out.println(name + tex);
    }
}
