package link1016;

public class LinkList {
	private Myink first;
	public void insert(int value){
		Myink ink = new Myink(value);
		if(first == null){
			first = ink;
		}else{
			ink.setB(first);
			first = ink;
		}
	}
	public void displayAll(){
		Myink current = first;
		while(current !=null){
			System.out.println(current.getA());
			current = current.getB();
		}
	
	}
	public Myink find(int value){
		Myink ink = first;
		while(ink.getA()!=value){
			if(ink.getB() == null){
				return null;
			}
			ink = ink.getB();
		}
		return ink;
	}
	public void insert(int value,int pos){
		if(pos == 0){
			insert(value);
		}else{
			Myink i = first;
			for(int j = 0;j<pos-1;j++){
				i = i.getB();
			}
			Myink me = new Myink(value);
			me.setB(i.getB());
			i.setB(me);
			
		}
	}
	public void delete(int value){
		Myink current = first;
		Myink pos = first;
		while(current.getA()!=value){
			if(current.getB()!=null){
				pos = current;
				current = current.getB();
			}else{
				return;
			}
		}
		if(pos == first){
			first = first.getB();
		}else{
			pos.setB(current.getB());
		}
	}

}
