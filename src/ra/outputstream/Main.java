
package ra.outputstream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File output = new File("data.txt");
        if (output.exists()){
            output.delete();
        }
        if (output.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(output);
            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);
            outputStream.writeInt(1000);
            outputStream.writeBytes("This is writeBytes");
            outputStream.writeBoolean(true);
            outputStream.writeUTF("this is writeUTF");
            outputStream.close();

        }else {
            System.out.println("Có lỗi xảy ra khi thêm mới file");
        }
    }
}
