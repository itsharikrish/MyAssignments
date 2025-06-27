package week1.day2;

public class Library {

    public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }

    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {
        Library lib = new Library();
        String returnedTitle = lib.addBook("The Breaking Bad");
        System.out.println("Returned Book Title: " + returnedTitle);
        lib.issueBook();
    }
}

