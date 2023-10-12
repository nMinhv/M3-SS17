package ra.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class DemoSerialization {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Student1",17,true));
        students.add(new Student(2,"Student2",17,false));
        File file = new File("student.txt");
        if(file.createNewFile()){
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
        }
    }
}
