package Books;

import paperPublication.PaperPublication;

public class Book extends PaperPublication {

	private long Isbn;
	private int IssueYear;
	private String Title, AuthorName;
	
	//Default Constructor set parameters to null//
	
		public Book (){
			super();
			this.Isbn = 0;
			this.IssueYear= 0;
			this.Title = null;
			this.AuthorName = null;
			
		}
	
	// Parametrised Constructor //
		
		public Book (double price, int number_of_pages, long Isbn, int IssueYear, String Title, String AuthorName){

			super(price, number_of_pages);
			this.Isbn = Isbn;
			this.IssueYear= IssueYear;
			this.Title = Title;
			this.AuthorName = AuthorName;
		}
		
		//returns value of ISBN//
		public long getIsbn(){
			return this.Isbn;
		}
		
		//Mutator for the ISBN//
		public void setIsbn(long Isbn){
			this.Isbn = Isbn;
		}
		
		//returns value of the issue year//
		public int getIssueYear (){
			return this.IssueYear;
		}
		
		//mutator for the Issue Year//
		public void setIssueYear (int IssueYear){
			this.IssueYear = IssueYear;
		}
		
		//returns the Title//
		public String getTitle(){
			return this.Title;
		}
		
		//mutator for the Title of book//
		public void setTitle(String Title){
			this.Title = Title;			
		}
		
		//Returns the name of the author//
		public String getAuthorName (){
			return this.AuthorName;
		}
		//mutator for the name of the author//
		public void setAuthorName(String AuthorName){
			this.AuthorName = AuthorName;
		}
		//considering if a period is entered in original PaperPublication class//
		public String toString(){
			return super.toString() + " This book is titled \" " + Title + " \", by " + AuthorName + ", was issued in " +
								IssueYear + " and its ISBN is "+ Isbn+".";
		}
		
		//equals method to ensure no other book is the same//
		public boolean equals(Book newBook){
			if(super.equals(newBook)&&this.Isbn == newBook.Isbn && this.IssueYear == newBook.IssueYear && this.AuthorName == newBook.AuthorName &&
					this.Title == newBook.Title){
				return true;
			}
					return false;					
			}
}		
