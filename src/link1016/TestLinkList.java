package link1016;

public class TestLinkList {
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.displayAll();
		System.out.println(list.find(1).getA());
		list.insert(11, 4);
		list.displayAll();
		System.out.println("-----");
		list.delete(2);
		list.displayAll();
		System.out.println("-----");
		list.delete(4);
		list.displayAll();
	}
	
	

}
