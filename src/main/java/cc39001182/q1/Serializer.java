package cc39001182.q1;

import java.io.IOException;

public interface Serializer {
    String name();
    int size();
    void write() throws IOException;
}
