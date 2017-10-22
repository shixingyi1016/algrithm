package shujujiegou;

public class TestPerson {
  public static void main(String[] args) {
	Person p1 = new Person("1", 1, "1");
	Person p2 = new Person("2", 2, "2");
	Person p3 = new Person("3", 3, "1");
	Person p4 = new Person("4", 4, "2");
	PersonArray pa = new PersonArray();
	pa.add(p1);
	pa.add(p2);
	pa.add(p3);
	pa.add(p4);
	pa.change(p3, p1);
	pa.display();
	pa.delete("4");
	pa.display();
	pa.sort();;
	pa.display();
}
}
