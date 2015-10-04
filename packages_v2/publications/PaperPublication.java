package publications;

public class PaperPublication {

	private double price;
	private int number_of_pages;
	
	//Default constructor with not parameters initialises attributes to 0
	public PaperPublication(){
		this(0,0);
	}
	
	//Parametrised constructor takes price as argument
	public PaperPublication(double price){
		this(price, 0);
	}
	
	//Parametrised constructor takes price and number_of_pages
	public PaperPublication(double price, int number_of_pages){
		this.price = price;
		this.number_of_pages = number_of_pages;
	}
	
	//toString method returns values of attributes
	public String toString(){
		return "This paper publication has " + number_of_pages + " pages and costs $" + price;
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
			PaperPublication castPublication = (PaperPublication) publication; //type cast parameter into PaperClass class
			if(this.price == castPublication.price && this.number_of_pages == castPublication.number_of_pages){
				return true;
			}
		}
		return false;
	}
	
	//getPrice returns price of object
	public double getPrice(){
		return this.price;
	}
	
	//setPrice sets new price
	public void setPrice(double price){
		this.price = price;
	}
	
	//getNumber_of_pages returns number_of_pages
	public int getNumber_of_pages(){
		return this.number_of_pages;
	}
	
	//setNumber_of_pages sets new number_of_pages
	public void setNumber_of_pages(int number_of_pages){
		this.number_of_pages = number_of_pages;
	}
}

