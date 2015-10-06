package book;
public class EducationBook extends Book {
	
	
private int editionNum;
private String specialty_field;

//Default Constructor
public EducationBook(){
	super();
	this.editionNum = 0;
	this.specialty_field = null;
}

//Parametrized constructor
public EducationBook(double price, int number_of_pages, long Isbn, int IssueYear, String Title, String AuthorName,int editionNum, String specialty_field){
super(price, number_of_pages, Isbn, IssueYear, Title, AuthorName);
this.editionNum = editionNum;
this.specialty_field = specialty_field;
}

//Accessors

public int getEditionNum(){
	return this.editionNum;
}

public String getSpecialtyField(){
	return this.specialty_field;
}

//Mutators

public void setEditionNum(int editionNum){
	editionNum = this.editionNum;
}

public void setSpecialtyField(String specialty_field){
	specialty_field = this.specialty_field;
}

//equals method returns true iff all attributes between compared objects are the same
//equals must be overridden  as it is inherited from the Object class
public boolean equals(Object publication){
	if(publication == null){ //make sure the parameter is not null
		return false;
		
	}
	else if(getClass() != publication.getClass()) //make sure the parameter is the same class as the compared object
	{
		return false;
	}
	else{
		EducationBook book = (EducationBook) publication; //type cast parameter into EducationBook class
		if(this.getPrice() == book.getPrice() &&
				this.getNumber_of_pages() == book.getNumber_of_pages() &&
				this.getisbn() == book.getisbn() &&
				this.getissueYear() == book.getissueYear() &&
				this.gettitle().equalsIgnoreCase(book.gettitle()) &&
				this.getauthorname() == book.getauthorname() &&
				this.editionNum == book.editionNum &&
				this.specialty_field == book.specialty_field){
			return true;
		}
	}
	return false;
}
//toString method

public String toString(){
	return super.toString() + "The edition number is: " + editionNum + " and the specialty field is: " + specialty_field + ".";
}
}

