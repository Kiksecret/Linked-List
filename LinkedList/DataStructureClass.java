package LinkedList;

public class DataStructureClass {
	private int size;
	private int count;
	private StudentRecord listOfStudents;
	
	public DataStructureClass() {
		listOfStudents = null;
		count = 0;
	}
	
	public DataStructureClass(int size) {		
		if(size <= 0) {
			size = 10;
		}
		this.size = size;
		this.count = 0;
	}
	
	public void insert(StudentRecord newStudentRecord) {
			newStudentRecord.next = listOfStudents;
			listOfStudents = newStudentRecord;
			count++;
		
	}
	
	//R => Retrieve
	public String toString() {
		String s = "";
		StudentRecord current = listOfStudents;
		while(current != null) {
			s += current + "\n";
			current = current.next;
		}
		
		return s;
	}
	
	
	public StudentRecord search(int key) {
		StudentRecord current = listOfStudents;
		while(current.getId() != key) {
			if(current.next == null) 
				return null; 
			else
				current = current.next;
		}
		
		return current;
	}
	
	public int length() {
		return count;
	}
	
	public boolean isFull() {
		return count == size;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public void toyMethod() {
		for(int i = 0; i < count; i++) {

		}
	
		for(int j=0; j < count; j++) {
			String x = this.listOfStudents.getEmail();
			System.out.println(x);
		}
	}


}
