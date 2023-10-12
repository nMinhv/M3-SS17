package ra.bt.btTrenlop;

import java.io.*;

public class UserDeSerializable {
    public static void main(String[] args) throws IOException {
        FileInputStream userFile = new FileInputStream("src/ra/bt/btTrenlop/user.dat");
        ObjectInputStream inputStream = new ObjectInputStream(userFile);
        File fileTxt = new File("src/ra/bt/btTrenlop/user.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileTxt));
        try {
            User user = (User) inputStream.readObject();
            while (user != null) {
                System.out.println(user);
                writer.write(user.toString());
                writer.newLine();
                user = (User) inputStream.readObject();

            }
            inputStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (EOFException e) {
            System.out.println("kết thúc quá trình đọc");
        } finally {
            writer.close();
        }

    }
}
