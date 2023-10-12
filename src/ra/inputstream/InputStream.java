package ra.inputstream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("data.txt");
        DataInputStream inputStream = new DataInputStream(fileInputStream);
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readByte());
        System.out.println(inputStream.readBoolean());
        System.out.println(inputStream.readUTF());
        inputStream.close();

    }
}
