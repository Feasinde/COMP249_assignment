package paperPublication;


public class PaperPublication {

	private double price;
	private int number_of_pages;
	
	//Default constructor with not parameters initializes attributes to 0
	public PaperPublication(){
		this(0,0);
	}
	
	//Overloaded constructor takes price as argument
	public PaperPublication(double price){
		this(price, 0);
	}
	
	//Overloaded constructor takes price and number_of_pages
	public PaperPublication(double price, int number_of_pages){
		this.price = price;
		this.number_of_pages = number_of_pages;
	}
	
	//toString method returns values of attributes
	public String toString(){
		return "This paper publication has a price of $" + price + " and the total number of pages is " + number_of_pages;
	}
	
	//equals method returns true iff all attributes between compared objects are the same
	public boolean equals(PaperPublication publication){
		if(this.price == publication.price && this.number_of_pages == publication.number_of_pages){
			return true;
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