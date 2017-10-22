package link1016;

public class Testlink {
	public static void main(String[] args) {
		Myink m1 = new Myink(1);
		Myink m2 = new Myink(12);
		Myink m3 = new Myink(13);
		Myink m4 = new Myink(14);
		Myink m5 = new Myink(15);
		m1.setB(m2);
		m2.setB(m3);
		m3.setB(m4);
		m4.setB(m5);
		System.out.println(m1.getB().getA());
	}
	
	

}
