
public class EducationBook extends Book {
	
	
protected int editionNum;
protected String specialty_field;

//Default Constructor
public EducationBook(){
	super();
	this.editionNum = 0;
	this.specialty_field = null;
}

//Parametrized constructor
public EducationBook(double price, int number_of_pages, long Isbn, int IssueYear, String Title, String AuthorName,int editionNum, String specialty_field){
super(price, number_of_pages, Isbn, IssueYear, Title, AuthorName);
editionNum = this.editionNum;
specialty_field = this.specialty_field;
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
		EducationBook book = (EducationBook) publication; //type cast parameter into PaperClass class
		if(this.isbn == book.isbn &&
		this.issueYear == book.issueYear &&
		this.title.equalsIgnoreCase(book.title) &&
		this.authorname == book.authorname &&
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
