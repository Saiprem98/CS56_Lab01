

public class Book{
	private int numOfPages;
	private int yearPublished;
	private double price;
	private String title;

	Author a1 = new Author();

	// default constructor
	public Book(){

	}
	public Book(int numOfPages,int yearPublished, double price, String title){
		this.numOfPages = numOfPages;
		this.yearPublished = yearPublished;
		this.price = price;
		this.title = title;
	}
	//copy constructor
	public Book(Book book){
		numOfPages = book.getNumofPages();
		yearPublished = book.getYearPublished();
		price = book.getPrice();
		title = book.getTitle();
		setAuthor(book.a1.getFirstName(),book.a1.getLastName(),book.a1.getBirthYear(),book.a1.getNumOfPublications());
		// a1.setFirstName(a1.getFirstName()) ;
		// a1.setLastName(a1.getLastName()) ;
		// a1.setBirthYear(a1.getBirthYear()) ;
		// a1.setNumOfPublications(a1.getNumOfPublications());
	}
	public void setAuthor(String firstName,String lastName,int birthYear,int numOfPublications){
		a1.setFirstName(firstName) ;
		a1.setLastName(lastName) ;
		a1.setBirthYear(birthYear);
		a1.setNumOfPublications(numOfPublications) ;
	} 
	public void setNumOfPages(int pages){
		numOfPages = pages;
	}
	public void setYearPublished(int year){
		yearPublished = year;
	}
	public void setPrice(double p){
		price= p;
	}
	public void setTitle(String t){
		title= t;
	}

	public int getNumofPages(){
		return numOfPages;
	}
	public int getYearPublished(){
		return yearPublished;
	}
	public double getPrice(){
		return price;
	}
	public String getTitle(){
		return title;
	}

	public String toString(){
		if(a1.getNumOfPublications() == 1){
		
		return ("Title: " +title + "\n"+
			"Published in: " + yearPublished+"\n"
		+"Number of pages: "+ numOfPages+"\n"+
		"Price: $"+ price+"\n" +
		"Written by " + a1.getFirstName() + " " +a1.getLastName() + ", who was born in " + a1.getBirthYear()+
			" and has " + a1.getNumOfPublications() + " publication");
		}
		else {
				return ("Title: " +title + "\n"+
			"Published in: " + yearPublished+"\n"
		+"Number of pages: "+ numOfPages+"\n"+
		"Price: $"+ price+"\n" +
		"Written by " + a1.getFirstName() + " " +a1.getLastName() + ", who was born in " + a1.getBirthYear()+
			" and has " + a1.getNumOfPublications() + " publications");
		}
	}

}