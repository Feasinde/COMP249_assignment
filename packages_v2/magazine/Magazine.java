package magazine;

import publications.PaperPublication;

public class Magazine extends PaperPublication {

	private enum PaperQuality {
	    LOW,
	    MEDIUM,
	    HIGH;
	   
	}
   
    private enum IssuingFrequency {
    	WEEKLY, 
    	MONTHLY, 
    	YEARLY;  	
    }

        
    private PaperQuality paperQuality;
    private IssuingFrequency issuingFrequency;

    //Default Constructor
    public Magazine() {
    	super();
        this.paperQuality = null; 
        this.issuingFrequency = null; 
        
    	};  
    		
    //Parametrized Constructor that will take Paper Quality and Issuing Frequency as a parameter
    	public Magazine(double price,int number_of_pages,PaperQuality paperQuality, IssuingFrequency issuingFrequency){
    	super(price,number_of_pages); 
    	this.paperQuality=paperQuality;
    	this.issuingFrequency = issuingFrequency;
    	 
    	};
    	
    //Accessors
    public String getPaperQuality(){
    	return this.paperQuality.toString();
    };

    public String getIssueFrequency(){
		return this.issuingFrequency.toString();
    };
        
    //Mutators
        
    public void setPaperQuality(PaperQuality paperQuality){
	   paperQuality=this.paperQuality;
   };
   
   public void setIssuingFrequency(IssuingFrequency issuingFrequency){
	   issuingFrequency=this.issuingFrequency;
  };   

    
    //toString method returns values of Magazine attributes
    public String toString(){
    	return super.toString() + " The paper quality of this magazine is " + paperQuality + ". " +
    			"It is issued " + issuingFrequency + ".";
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
  			Magazine magazine = (Magazine) publication; //type cast parameter into Magazine class
  			if(this.getPrice() == magazine.getPrice() && 
  					this.getNumber_of_pages() == magazine.getNumber_of_pages() && 
  					this.paperQuality == magazine.paperQuality && 
  					this.issuingFrequency == magazine.issuingFrequency){
  				return true;
  			}
  		}
  		return false;
  	}
    

}





