package book;

import publications.PaperPublication;

public class Book extends PaperPublication {

	private long isbn;
	private int issueYear;
	private String title;
	private String authorname;
	
	//Default Constructor set parameters to null//
	
		public Book (){
			super();
			this.isbn = 0;
			this.issueYear= 0;
			this.title = null;
			this.authorname = null;
			
		}
	
	// Parametrised Constructor //
		
		public Book (double price, int number_of_pages, long isbn, int issueYear, String title, String authorname){

			super(price, number_of_pages);
			this.isbn = isbn;
			this.issueYear= issueYear;
			this.title = title;
			this.authorname = authorname;
		}
		
		//returns value of isbn//
		public long getisbn(){
			return this.isbn;
		}
		
		//Mutator for the isbn//
		public void setisbn(long isbn){
			this.isbn = isbn;
		}
		
		//returns value of the issue year//
		public int getissueYear (){
			return this.issueYear;
		}
		
		//mutator for the Issue Year//
		public void setissueYear (int issueYear){
			this.issueYear = issueYear;
		}
		
		//returns the title//
		public String gettitle(){
			return this.title;
		}
		
		//mutator for the title of book//
		public void settitle(String title){
			this.title = title;			
		}
		
		//Returns the name of the author//
		public String getauthorname (){
			return this.authorname;
		}
		//mutator for the name of the author//
		public void setauthorname(String authorname){
			this.authorname = authorname;
		}
		//considering if a period is entered in original PaperPublication class//
		public String toString(){
			return super.toString() + " This book is titled \"" + title + "\", by " + authorname + ", was issued in " +
								issueYear + " and its isbn is "+ isbn+".";
		}
		
		//equals method returns true if all attributes between compared objects are the same
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
				Book book = (Book) publication; //type cast parameter into Book class
				if(this.getPrice() == book.getPrice() &&
						this.getNumber_of_pages() == book.getNumber_of_pages() &&
						this.isbn == book.isbn &&
						this.issueYear == book.issueYear &&
						this.title.equalsIgnoreCase(book.title) &&
						this.authorname == book.authorname){
					return true;
				}
			}
			return false;
		}
}		


