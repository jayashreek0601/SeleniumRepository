package week2.assignments;

public class LibraryManagement {
	public static void main(String[] args)
	{
		Library bookOptions = new Library();
		String book2 = bookOptions.addBook("Big Magic");
		System.out.println(book2 + " " + "book added Successfully");
		bookOptions.issueBook();
	}
}
