//----------------------------------------------------------------------//
//Assignment 1															//
//Part 1: Attributes are either private or package on 			//
//and each equals method checks only for same attributes		//
//Written by:															//
//Laura Elena González 27217323											//
//Victoria Avgoustis 27529198											//
//Stevie Gabbay 27490968												//
//Andrés Lou 24712374													//
//----------------------------------------------------------------------//
//1. Creates 10 objects belonging to the class PaperPublications or 	//
//any of of its subclasses (Book, Magazine, Journal) or any of their	//
//subclasses															//
//2. Tests the equals() method of some of the classes					//
//3. Creates an array of ten PaperPublication objects and finds the		//
//object with the lowest price											//

import publications.PaperPublication;
import book.Book;
import book.ChildrenBook;
import book.EducationBook;
import journal.Journal;
import magazine.Magazine;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//displays welcome message
		System.out.println("1Welcome to our program. Written By: \nAndr�s Lou, Laura Elena Gonzalez,"
				+ " Stevie Gabbay, and Victoria Avgoustis.\n");		
		
		//displaying to the user what the program is about to do
		System.out.println("Will create objects from each"
				+ " of the 6 classes.");
		
		//creating objects from the classes
		PaperPublication 
				p1 = new PaperPublication(), 
				p2 = new PaperPublication(2.0, 5), 
				p3 = new PaperPublication(5.0, 50);
		Book 
				p4 = new Book(15.0,200,0,1990,"Made up Title","Alan Smithee"), 
				p5 = new Book(15.0, 200, 0, 1990, "Made up Title", "Alan Smithee"), 
				p6 = new Book(1.0, 100, 0, 2000, "1984", "George Orwell");
		ChildrenBook 
				p7 = new ChildrenBook();
		EducationBook 
				p8 = new EducationBook(299.99,300,9499831,300,
						"How to Sell Overpriced Textbooks to Poor Students","Greedy McSlimeface",20,"Advanced Juggling");
		Journal 
				p9 = new Journal(39.99,40,42,"Hypothetical Cat Juggling");
		Magazine 
				p10 = new Magazine();
		
		//display the information of the objects using the toString() method
		System.out.println("The first PaperPublication: " + p1);
		System.out.println("The second PaperPublication: " + p2);
		System.out.println("The third PaperPublication: " + p3);
		System.out.println("The fourth PaperPublication: " + p4);
		System.out.println("The fifth PaperPublication: " + p5);
		System.out.println("The six PaperPublication: " + p6);
		System.out.println("The seventh PaperPublication: " + p7);
		System.out.println("The eight PaperPublication: " + p8);
		System.out.println("The nineth PaperPublication: " + p9);
		System.out.println("The tenth PaperPublication: " + p10);
		
		System.out.println();
		
		//testing of equality of some objects using the equals() method
		if(p1.equals(p2))
			System.out.println("The two PaperPublications p1 & p2 are equal");
		else
			System.out.println("The two PaperPublications p1 & p2 are not equal");
		
		if(p1.equals(p2))
			System.out.println("The two Books b1 & b2 are equal");
		else
			System.out.println("The two Books b1 & b2 are not equal");
		
		//creating an object array
		PaperPublication[] publicationsArray = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
		
		System.out.println();
		
		//finding the cheapest price in the array
		//Find the cheapest book and display its information
        double cheapest = publicationsArray[0].getPrice();
    	int cheapestIndex = 0;
    	for(int i = 0;i < publicationsArray.length;i++){
        		if(publicationsArray[i].getPrice() < cheapest){
            		cheapestIndex = i;
        		}
    	}
    	System.out.println("The publication at position " + cheapestIndex + " of the array is the cheapest. "
    	        + publicationsArray[cheapestIndex].toString());
    	
		//displays good bye message
		System.out.println("\nEnd of Program. \nThank you and Good Bye.");

	}

}
