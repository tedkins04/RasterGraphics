package bg.tu_varna.sit.a2.f23621612;
import java.io.*;
import java.util.*;

abstract class Image {
    protected String filename;

    public Image(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public abstract void save(String outputFilename) throws IOException;
    
}
