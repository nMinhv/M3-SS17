package ra.bt.btTrenlop;

import java.io.Serializable;

public class User implements Serializable {
/*T?o 1 class User c� th? Serializable c� c�c tr??ng sau
int id
String username
String password
boolean status
Th?c hi?n ghi object n�y v�o 1 file l� 'user.dat'
Th?c hi?n ??c d? li?u t? file n�y v� in ra m�n h�nh
Th?c hi?n ??c d? li?u file n�y nh?ng m� ghi n?i dung text v�o file user.txt
* */
    private static final long serialVersionUID = 4031154857355254164L;
    private int id;
    private String userName,passWord;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User(int id, String userName, String passWord, boolean status) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.status = status;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", status=" + status +
                '}';
    }
}
