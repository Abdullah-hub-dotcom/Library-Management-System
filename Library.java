import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;
    public Library(){
        books=new ArrayList<>();
        users = new ArrayList<>();
    }
    public void addbook(Book book){
        books.add(book);
        System.out.println("Book Added Successfully");
    }
    public void adduser(User user){
        users.add(user);
        System.out.println("User Added Successfully");
    }
    public void issuedbook(int bookid,int userid){
        Book book=findBook(bookid);
        User user=findUser(userid);
        if(book!=null && !book.isIssued() && user!=null){
            book.setIssued(true);
            user.issueBook(book);
            System.out.printf("Book Issued Successfully");
        }
        else {
            System.out.printf("Book Cant be Issued");
        }
    }
    public void returnbook(int bookid,int userid){
        Book book=findBook(bookid);
        User user=findUser(userid);
        if(book!=null && user!=null && user.getIssuedbooks().contains(book)){
            book.setIssued(false);
            user.returnBook(book);
            System.out.printf("Book Returned Successfully");
        }
        else {
            System.out.printf("Can't Return Book");
        }
    }
    public void showbook(){
        for(Book b:books){
            System.out.println(b);
        }
    }
    private User findUser(int userid) {
        for(User u:users){
            if(u.getUserid()==userid){
                return u;
            }

        }
        return null;

    }

    private Book findBook(int bookid) {
        for(Book b:books){
            if(b.getId()==bookid){
                return b;
            }

        }
        return null;
    }

}
