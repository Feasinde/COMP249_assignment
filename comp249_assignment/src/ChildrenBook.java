public class ChildrenBook extends Book {
	
	public int min_age;
	
	//Default Constructor//
	
	public ChildrenBook(){
		
		super();
		this.min_age= 0;
	}

	//Parametrized Constructor//
	public ChildrenBook (double price, int number_of_pages, long isbn, int issueYear, String title, String authorName, int min_age){
		super(price,number_of_pages,isbn,issueYear,title, authorName);
		this.min_age=min_age;
	}
	
	//Accessor Method
	public int getMin_age(){
		return min_age;
	}
	//Mutator Method//
	public void setMin_Age(int min_age){
		this.min_age=min_age;
	}
	//ToString Method
	public String toString(){
		return super.toString() + " It is suitable for ages "+min_age+" and up.";
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
			ChildrenBook book = (ChildrenBook) publication; //type cast parameter into PaperClass class
			if(this.isbn == book.isbn &&
			this.issueYear == book.issueYear &&
			this.title.equalsIgnoreCase(book.title) &&
			this.authorname == book.authorname){
				return true;
			}
		}
		return false;
	}
	
}
