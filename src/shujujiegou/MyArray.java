package shujujiegou;

public class MyArray {
	private int[] arr;
	private int elem;
	public MyArray(){
		arr = new int[30];
	}
	public MyArray(int i){
		arr = new int[i];
	}
	
	//��
	public void add(int a){
		
		arr[elem] = a;
		elem++;
	}
	//��
	public void add1(int a){
		int i;
		for(i = 0;i<elem;i++){
			if(arr[i]>a){
				break;
			}
		}
		for(int j = elem;j>i;j--){
			arr[j] = arr[j-1];
		}
		arr[i] = a;
		elem++;
	}
	//��ʾ
	public void display(){
		for(int i = 0;i<elem;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}//ð������
	public void sort(){
		int temp;
		for(int i = 0;i<elem-1;i++){
			for(int j = 0;j<elem-i-1;j++){
				if(arr[j]>arr[j+1]){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
	}//ѡ������
	public void sel(){
		int min = 0;
		int temp;
		for(int i = 0;i<elem-1;i++){
			min = i;
			for(int j = i+1;j<elem;j++){
				if(arr[j]>arr[min]){
					temp = arr[j];
					arr[j] =arr[min];
					arr[min] = temp;
				}
			}
		}
		
	}
	//��������
	public void insertSort(){
		int a = 0;
		for(int i = 1;i<elem;i++){
			a = arr[i];
			int j = 0;
			for(j = i;j>0&& arr[j-1]>= a;j--){
				arr[j]= arr[j-1];
			}
			arr[j] = a;
		}
	}
	//����
	public int find(int b){
		int i;
		for(i = 0;i<elem;i++){
			if(arr[i]==b){
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
	//���ַ�����
		public int erfind(int b){
			int m = 0;
			int low = 0;
			int hig = elem;
			
			while(true){
				m = (low+hig)/2;
				if(arr[m] == b){
					return m;
				}else if(low>hig){
					return -1;
				}else{
					if(arr[m]>b){
						hig = m-1;
					}else{
						low = m+1;
					}
				}
			}
			
		}
	//��
	public void change(int c,int d){
		if(find(c)==-1){
			System.out.print("û�д����ݣ��޸�ʧ��");
		}else{
			arr[find(c)] = d;
		}
	}
	//ɾ��
	public void delete(int e){
		if(find(e)==-1){
			System.out.print("û�д����ݣ��޸�ʧ��");
		}else{
			for(int i = find(e);i<elem;i++){
				arr[i] = arr[i+1];
			}
		}
	}

}
