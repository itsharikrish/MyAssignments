package week1.day2;

public class LibraryManagement {
	public static void main(String[] args)
	{
        Library lib = new Library();
        String returnedTitle = lib.addBook("Atomic Habits");
        System.out.println("Returned Book Title: " + returnedTitle);
        lib.issueBook();
    }
}