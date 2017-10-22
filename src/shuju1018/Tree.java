package shuju1018;

public class Tree {
	private Node root;
	public void insert(int keyData,int otherData){
		Node newNode = new Node(keyData, otherData);
		if(root == null){
			root = newNode;
		}else{
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(keyData<current.getData()){
					current = current.getNode1();
					if(current == null){
						parent.setNode1(newNode);
						return;
					}
				}else{
					current = current.getNode2();
					if(current == null){
						parent.setNode2(newNode);
						return;
					}
				}
			}
		}
	}
	public Node find(int keyData){
		Node current = root;
		while(current.getData() !=keyData){
			if(current.getData()>keyData){
				current = current.getNode1();
			}else{
				current = current.getNode2();
			}
			if(current == null){
				return null;
			}
		}
		return current;
	}
	public void change(int keyData,int newData){
		Node n = find(keyData);
		n.setOtherdata(newData);
	}
	public void preOrder(Node node){
		if(node != null){
			node.display();
			preOrder(node.getNode1());
			preOrder(node.getNode2());
		}
	}
	public void inOrder(Node node){
		if(node != null){
			
			inOrder(node.getNode1());
			node.display();
			inOrder(node.getNode2());
		}
	}
	public void outOrder(Node node){
		if(node != null){
			
			outOrder(node.getNode1());
			
			outOrder(node.getNode2());
			node.display();
		}
	}
	public Node getroot(){
		return root;
	}

}
