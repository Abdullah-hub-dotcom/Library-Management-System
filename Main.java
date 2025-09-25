import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    static Library library=new Library();
    public static void main(String[] args) {

        int choice;
        do{
            System.out.printf("--Mini Library Management System--");
            System.out.println("1-AddBook");
            System.out.println("2-AddUser");
            System.out.println("3-View Books");
            System.out.println("4-Issued Books");
            System.out.println("5-Return Books");
            System.out.println("6-Exit");
            System.out.println("Enter Your Choice:");
            choice = scan.nextInt();
            switch (choice){
                case 1->addbook();
                case 2->adduser();
                case 3->viewbooks();
                case 4->issuedbooks();
                case 5->returnbook();
                case 6 -> {
                    System.out.println("Thank You!Visit Again");
                }
                default -> System.out.println("Invalid Choice !Try Again..");
            }
        }while(choice!=6);
    }

    private static void returnbook() {
        System.out.println("Enter Your BookId:");
        int bookid= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Your UserId:");
        int userid= scan.nextInt();
        library.returnbook(bookid,userid);
    }

    private static void issuedbooks() {
        System .out.println("Enter Your BookId");
        int bookid=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Your UserId:");
        int userid= scan.nextInt();
        library.issuedbook(bookid,userid);
    }

    private static void viewbooks() {
        System.out.println("Books Available in the Library are");
        library.showbook();
    }

    private static void adduser() {
        System.out.println("Enter Your UserId:");
        int userid=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Your UserName:");
        String username=scan.nextLine();
        library.adduser(new User(username,userid));
    }

    private static void addbook() {
        System.out.println("Enter Your BookId:");
        int bookid=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Your BookAuthor:");
        String bookauthor=scan.nextLine();
        System.out.println("Enter Your BookTitle:");
        String booktitle=scan.nextLine();
        library.addbook(new Book(bookid,booktitle,bookauthor));
    }
}
