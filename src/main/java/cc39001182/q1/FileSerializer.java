package cc39001182.q1;

import java.io.FileWriter;
import java.io.IOException;

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
    public void write(String tex) throws IOException {
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
