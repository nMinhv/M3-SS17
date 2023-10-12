package ra.bt.btTrenlop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserSerializable {
    public static void main(String[] args) throws IOException {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "user1", "user1pass", true));
        userList.add(new User(2, "user2", "user2pass", true));
        File file = new File("src/ra/bt/btTrenlop/user.dat");

        if (file.createNewFile()) {
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            for (User u : userList
            ) {
                objectOutputStream.writeObject(u);

            }

            System.out.println("Đã ghi thành công");
        } else {
            System.out.println("Đã có lỗi xảy ra!");
        }
    }
}
