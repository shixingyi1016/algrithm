package shujujiegou;

public class TestMyArray {
	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		myArray.add(1);
		myArray.add(7);
		myArray.add(4);
		myArray.add(11);
		myArray.add(3);
		myArray.add(54);
		myArray.add(22);
		myArray.add(2);
		
		myArray.display();
		myArray.sort();
		myArray.display();
		myArray.sel();
		myArray.display();
		myArray.insertSort();
		myArray.display();
	
		
	
	}

}
