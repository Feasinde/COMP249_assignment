import paperPublication.PaperPublication;
import Books.Book;
import Books.ChildrenBook;

public class DRIVERTEST {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaperPublication tomsawyer = new Book(10,300,365,2001,"Lemony Snicket","Tom Sawyer");
		
	System.out.println(tomsawyer);
		
	ChildrenBook Pudding = new ChildrenBook(10,300,365,2001,"Lemony Snicket","Tom Sawyer",4);
	
		System.out.println(Pudding);
		
		System.out.print(tomsawyer.equals(Pudding));

	}

}
