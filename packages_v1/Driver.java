import java.util.ArrayList;

import publications.PaperPublication;
import book.Book;
import book.ChildrenBook;
import book.EducationBook;
import journal.Journal;
import magazine.Magazine;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Will create an object from each"
				+ " of the 6 classes.");
		
		PaperPublication p1 = new PaperPublication(), p2 = new PaperPublication(2.0, 5), p3 = new PaperPublication(5.0, 50);
		Book p4 = new Book(), p5 = new Book(15.0, 200, 0, 1990, null, null), p6 = new Book(1.0, 100, 0, 2000, null, null);
		ChildrenBook p7 = new ChildrenBook();
		EducationBook p8 = new EducationBook();
		Journal p9 = new Journal();
		Magazine p10 = new Magazine();
		
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
		
		if(p1.equals(p2))
			System.out.println("The two PaperPublications p1 & p2 are equal");
		else
			System.out.println("The two PaperPublications p1 & p2 are not equal");
		
		if(p1.equals(p2))
			System.out.println("The two Books b1 & b2 are equal");
		else
			System.out.println("The two Books b1 & b2 are not equal");
		
		ArrayList<PaperPublication> arraylist = new ArrayList<PaperPublication>(10);
		arraylist.add(p1);
		arraylist.add(p2);
		arraylist.add(p3);
		arraylist.add(p4);
		arraylist.add(p5);
		arraylist.add(p6);
		arraylist.add(p7);
		arraylist.add(p8);
		arraylist.add(p9);
		arraylist.add(p10);
		
		PaperPublication[] array = new PaperPublication[arraylist.size()];
		arraylist.toArray(array);
		
		System.out.println();
		
		for(int i=0; i<array.length; i++)
		{
			if (array[0].getPrice()==array[i].getPrice())
				{
					System.out.println("PaperPublication at index: " + i + " is cheapest.");
					System.out.println(array[i]);
				}
		
		}

	}

}
