

package magazine;

import paperPublication.PaperPublication;

public class Magazine extends PaperPublication {

	public enum PaperQuality {
	    LOW,
	    MEDIUM,
	    HIGH;
	   
	}
   
    public enum IssuingFrequency {
    	WEEKLY, 
    	MONTHLY, 
    	YEARLY;  	
    }

        
    PaperQuality paperQuality;
    IssuingFrequency issuingFrequency;

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
    	return super.toString() + "The paper quality of this magazine is " + paperQuality + "." +
    			"It is issued " + issuingFrequency + ".";
    }

    //equals method to recognize the same Magazine
	public boolean equals(Magazine newMagazine){
		if(super.equals(newMagazine)&&this.paperQuality == newMagazine.paperQuality && this.issuingFrequency == newMagazine.issuingFrequency 
				){
			return true;
		}
				return false;					
		}
    

}


