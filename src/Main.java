import java.util.Scanner;

public class Main {
    static Book[] books = new Book[2];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            System.out.println("Secim edin");
            System.out.println("1- Butun kitablara bax \n2- Kitab elave et");
            Book book = new Book();
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    showBook();
                    break;
                case 2:
                    addBook();

            }
        }


    }

    public static void showBook() {
        for (Book book : books) {
            if(book!=null){
                System.out.println("Name: " + book.name + "Price" + book.price + "Count" + book.count);

            }
        }

    }

    public static void addBook() {
        String bookName = scanner.nextLine();
        int bookPrice = scanner.nextInt();
        int bookCount = scanner.nextInt();
        Book book = new Book("Ali ve Nino", 20, 2);
        boolean hasEmpty = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
        if (hasEmpty) {
            Book[] newBook = new Book[books.length * 2];
            for (int i = 0; i < books.length; i++) {
                newBook[i] = books[i];
            }
            newBook[books.length] = book;
            books = newBook;

        }

    }
}