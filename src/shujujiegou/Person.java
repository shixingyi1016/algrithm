package shujujiegou;

public class Person {
	private String name;
	private int age;
	private String sex;
	/**
	 * @param name
	 * @param age
	 * @param sex
	 */
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void display(){
		System.out.println("姓名:"+this.name+" 年龄："+this.age+" 性别： "+this.sex);
	}

}
