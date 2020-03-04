
public class Author{
	private String firstName;
	private String lastName;
	private int birthYear;
	private int numOfPublication;

	// default constructor 
	public Author(){

	}

	public Author(String firstName,String lastName,int birthYear,int numOfPublication){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.numOfPublication = numOfPublication;
	}

	public Author(Author author){
		firstName = author.firstName;
		lastName = author.lastName;
		birthYear = author.birthYear;
		numOfPublication = author.numOfPublication;
	}

	public void setFirstName(String fname){
		firstName = fname;
	}
	public void setLastName(String lname){
		lastName = lname;
	}
	public void setBirthYear(int year){
		birthYear = year;

	}
	public void setNumOfPublications(int num){
		numOfPublication = num;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getBirthYear(){
		return birthYear;
	}

	public int getNumOfPublications(){
		return numOfPublication;
	}
}
