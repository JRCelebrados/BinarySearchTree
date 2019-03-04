
public class UseBST {
	
	public static void main(String[] args) {
		
		BST bst = new BST();
		
		int[] A = {50, 18, 22, 420, 1024, 1738, 21, 121, 1021, 99, 69, 1, 55, 66};
		
		for(int i = 0; i < A.length; i++) {
			
			bst.insert(A[i]);
			
		}
		
//		bst.insert(100);
//		bst.insert(32);
//		bst.insert(120);
//		bst.insert(54);
//		bst.insert(12);
//		bst.insert(38);
		
		System.out.println("Height = " + bst.height());
		System.out.println("Count = " + bst.count());
		
		bst.printInOrder();
		
		
		bst.balance();
		
		System.out.println("Height = " + bst.height());
		System.out.println("Count = " + bst.count());
		
		bst.printInOrder();
		
	}

}
