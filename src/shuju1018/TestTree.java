package shuju1018;

import java.util.ArrayList;
import java.util.List;

public class TestTree {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10, 10);
		tree.insert(2, 2);
		tree.insert(4, 4);
		tree.insert(3, 3);
		tree.insert(6, 6);
		tree.insert(22, 22);
		tree.insert(21, 21);
//		List l = new ArrayList();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		System.out.println(l.get(0));
//		tree.find(2).display();
//		tree.change(2, 13);
//		tree.find(2).display();
		tree.preOrder(tree.getroot());
		tree.inOrder(tree.getroot());
		tree.outOrder(tree.getroot());
	}

}
