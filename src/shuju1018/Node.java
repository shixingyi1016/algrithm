package shuju1018;

public class Node {
	private int data;
	private int otherdata;
	private Node node1;
	private Node node2;
	/**
	 * @param data
	 * @param otherdata
	 */
	public Node(int data, int otherdata) {
		super();
		this.data = data;
		this.otherdata = otherdata;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getOtherdata() {
		return otherdata;
	}
	public void setOtherdata(int otherdata) {
		this.otherdata = otherdata;
	}
	public Node getNode1() {
		return node1;
	}
	public void setNode1(Node node1) {
		this.node1 = node1;
	}
	public Node getNode2() {
		return node2;
	}
	public void setNode2(Node node2) {
		this.node2 = node2;
	}
	public void display(){
		System.out.println(data+","+otherdata);
	}

}
