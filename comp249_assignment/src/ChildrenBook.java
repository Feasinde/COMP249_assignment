package Books;

import Books.Book;

public class ChildrenBook extends Book {
	
	public int min_age;
	
	//Default Constructor//
	
	public ChildrenBook(){
		
		super();
		this.min_age= 0;
	}

	//Parametrized Constructor//
	public ChildrenBook (double price, int number_of_pages, long Isbn, int IssueYear, String Title, String AuthorName, int min_age){
		super(price,number_of_pages,Isbn,IssueYear,Title, AuthorName);
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
	//Equals Method//
	public boolean equals(ChildrenBook newChildrenBook){
		if(super.equals(newChildrenBook) && this.min_age == newChildrenBook.min_age){
			return true;
		}
		return false;
	
	}
	
}
