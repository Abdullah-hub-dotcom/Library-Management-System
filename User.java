import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private int userid;
    private List<Book> issuedbooks;

    public User(String username, int userid) {
        this.username = username;
        this.userid = userid;
        this.issuedbooks = new ArrayList<>();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public List<Book> getIssuedbooks() {
        return issuedbooks;
    }

    public void setIssuedbooks(List<Book> issuedbooks) {
        this.issuedbooks = issuedbooks;
    }
    public void issueBook(Book book) {
        issuedbooks.add(book);
    }

    public void returnBook(Book book) {
        issuedbooks.remove(book);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userid=" + userid +
                ", issuedbooks=" + issuedbooks +
                '}';
    }


}
