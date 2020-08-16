package LinkedList;

public class DataStructureApp {

	public static void main(String[] args) {
		DataStructureClass myClass = new DataStructureClass();
		
		myClass.insert(new StudentRecord(1," James ", " james@mail.com "," 0898844 "));
		myClass.insert(new StudentRecord(2," John ", " john@mail.com "," 0856633 "));
		myClass.insert(new StudentRecord(3," Jim ", " jim@mail.com "," 0824474 "));
		myClass.insert(new StudentRecord(4," Jonas ", " jonas@mail.com "," 0819484 "));
		
		
		System.out.println(myClass);
		
		StudentRecord result = myClass.search(3);
		if(result != null) {
			System.out.println("Search result: " + result);
		} else {
			System.out.println("Cannot find a result.");
		}
		

	}

}
