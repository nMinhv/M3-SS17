package ra.serializable;

import java.io.*;
import java.util.List;

public class DemoDeserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("student.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Student> students = (List<Student>) objectInputStream.readObject();
            for (Student s: students) {
                System.out.println(s);
            }
        } catch (EOFException e) {
            System.out.println("ket thuc qua trinh lap file");
        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            System.out.println("da co loi xay ra trong qua trinh doc file");
        } catch (ClassNotFoundException e) {
            System.out.println("du lieu khong hop le");
        }
    }
}
