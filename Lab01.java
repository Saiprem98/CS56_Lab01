
public class Lab01{

	public static void main(String[] args){

		// Create a new book with default values for all attributes
		 Book book = new Book();

		// Set the appropriate fields for the book’s objects
		book.setTitle("Harry Potter and the Goblet of Fire");
		book.setPrice(12.99);
		book.setYearPublished(2000);
		book.setNumOfPages(734);
		book.setAuthor("J.K.", "Rowling", 1965, 7);

		// Prints out the state of the book.
		//System.out.println(book.toString());

		Book b1 = new Book(book);
		// System.out.println(book.getNumofPages());
		// System.out.println(b1.getNumofPages());
		//System.out.println(b1.toString());

		// int num = b1.getNumofPages();
		// b1.setNumOfPages(++num);
		// //System.out.println(b1.toString());
		// //System.out.println(book.toString());

		int x = b1.a1.getNumOfPublications();
		b1.a1.setNumOfPublications(++x);

		System.out.println(b1.toString());
		System.out.println(book.toString());

		Author author = new Author("Sai", "Kathika",1998,3);
		System.out.println(author.getFirstName());

		Author a2 = new Author(author);
		System.out.println(a2.getFirstName());
		int y = a2.getBirthYear();
		a2.setBirthYear(++y);
		System.out.println(a2.getBirthYear());
		System.out.println(author.getBirthYear());



	}
}