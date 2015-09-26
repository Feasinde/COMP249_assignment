
/**Still brainstorming ------------ UNDER CONSTRUCTION
This is here just to show that I actually *am* working on it :P
Completely aware that it needs to be fixed up
I will continue it Monday and see what other contributions I can make...
feel free to edit it.
Keep calm and join the dark side...
Hail Sithis!
These unnecessary comments will be deleted when this file is  completed **/


public class Magazine extends PaperPublication {
	
    public enum PaperQuality {
    	LOW, 
    	NORMAL, 
    	HIGH
    }
    
    public enum IssuingFrequency {
    	WEEKLY, 
    	MONTHLY, 
    	YEARLY  	
    }

        
    PaperQuality paperQuality;
    IssuingFrequency issuingFrequency;

    //Default Constructor
    public Magazine() {
        paperQuality = null; 
        issuingFrequency = null; 
    	};
    	
    //Parametrized Constructor
    	public Magazine(PaperQuality paperQuality, IssuingFrequency issuingFrequency){
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
    	return "The paper quality of this magazine is " + paperQuality + "." +
    			"It is issued " + issuingFrequency + ".";
    }

    //equals method to recognize the same Magazine
	public boolean equals(Magazine publication){
		if(this.price == publication.price && 
			this.number_of_pages == publication.number_of_pages &&
			this.paperQuality == publication.paperQuality &&
			this.issuingFrequency == publication.issuingFrequency){
			return true;
		}
		return false;
	}   
    

}

