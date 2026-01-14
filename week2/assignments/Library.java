package week2.assignments;

public class Library {
	
	public String addBook(String bookTitle) 
	{
		return bookTitle;
	}

	public void issueBook() 
	{
		System.out.println("Book issued successfully");

	}

	public static void main(String[] args)
	{
		Library bookStatus = new Library();
		String book = bookStatus.addBook("Mindset");
		System.out.println(book + " " + "book added Successfully");
		bookStatus.issueBook();

	}

}
