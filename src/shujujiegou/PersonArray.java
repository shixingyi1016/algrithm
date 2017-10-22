package shujujiegou;

public class PersonArray {
	private Person[] arr;
	private int elem;
	public PersonArray(){
		arr = new Person[30];
	}
	public PersonArray(int i){
		arr = new Person[i];
	}
	//��
		public void add(Person a){
			arr[elem] = a;
			elem++;
		}
		//��ʾ
		public void display(){
			for(int i = 0;i<elem;i++){
				arr[i].display();
			}
			System.out.println();
		}
		public void sort(){
			Person temp;
			for(int i = 0;i<elem-1;i++){
				for(int j = 0;j<elem-i-1;j++){
					if(arr[j].getAge()>arr[j+1].getAge()){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
				}
			}
		}
		//����
		public int find(String name){
			int i;
			for(i = 0;i<elem;i++){
				if(arr[i].getName()==name){
					break;
				}
			}
			if(i==arr.length){
				System.out.print("û�д����ݣ�����ʧ��");
				return -1;
			}else{
				
				return i;
			}
		}
		//��
		public void change(Person c,Person d){
			if(find(c.getName())==-1){
				System.out.print("û�д����ݣ��޸�ʧ��");
			}else{
				arr[find(c.getName())] = d;
			}
		}
		//ɾ��
		public void delete(String e){
			if(find(e)==-1){
				System.out.print("û�д����ݣ��޸�ʧ��");
			}else{
				for(int i = find(e);i<elem;i++){
					arr[i] = arr[i+1];
				}
				elem--;
			}
		}
	

}
