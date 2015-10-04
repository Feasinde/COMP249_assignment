package journal;

import publications.PaperPublication;

public class Journal extends PaperPublication{
	private int issue_number;
	private String specialty_field;
	
	//Default constructor
	public Journal(){
		super();
		issue_number = 0;
		specialty_field = "None";
	}

	//Overloaded constructor takes issue_number as parameter
	public Journal(double price, int number_of_pages, int issue_number){
		super(price, number_of_pages);
		this.issue_number = issue_number;
	}

	//Overloaded constructor takes issue_number and specialty_field as parameters
	public Journal(double price, int number_of_pages, int issue_number, String specialty_field){
		super(price, number_of_pages);
		this.issue_number = issue_number;
		this.specialty_field = specialty_field;
	}
	
	//toString method returns values of attributes
	public String toString(){
		return "This is issue No. " + issue_number + " of the Journal of " + specialty_field + ". " +
				"It has a price of $" + this.getPrice() + " and " +
				"the total number of pages is " + this.getNumber_of_pages() +".";
	}
	
	//equals method returns true iff all attributes between compared objects are the same
	//equals must be overridden  as it is inherited from the Object class
	public boolean equals(Object publication){
		Journal journalPublication = (Journal) publication; //type cast parameter into Journal class
			if(this.getPrice() == journalPublication.getPrice() && 
					this.getNumber_of_pages() == journalPublication.getNumber_of_pages() && 
					this.issue_number == journalPublication.issue_number && 
					specialty_field.equalsIgnoreCase(journalPublication.specialty_field)){
				return true;
			}
		
		return false;
	}

	//accessors and mutators return or set new values for attributes
	public int getIssue(){
		return this.issue_number;
	}
	
	public void setIssue(int issue_number){
		this.issue_number = issue_number;
	}
	
	public String getSpecialty(){
		return this.specialty_field;
	}
	
	public void setSpecialty(String specialty_field){
		this.specialty_field = specialty_field;
	}
}
