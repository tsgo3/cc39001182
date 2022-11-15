package cc39001182.q1;

import java.io.IOException;

public abstract interface Serializer {
    String name();
    int size();
    void write(String tex) throws IOException;
}
