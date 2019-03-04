
public class BST {
	
	BSTNode root = null;
	
	private int[] A;
	
	private int i;
	
	public class BSTNode {

		int x;
		BSTNode left = null;
		BSTNode right = null;

		public BSTNode(int value) {
			
			x = value;
			
		}
		
		public void insert(int value) {
			
			if(value <= x) {
				
				if(left != null)	left.insert(value);
				else				left = new BSTNode(value);
				
			}
			
			if(value >= x) {
				
				if(right != null)	right.insert(value);
				else				right = new BSTNode(value);
				
			}
			
		}
		
		public BSTNode search(int value) {
			
			if(value == x)	return this;
			
			if((value <= x) && (left != null))
				return left.search(value);
			
			if((value >= x) && (right != null))
				return right.search(value);
			
			return null;
			
		}
		
		public void inorder() {
			
			if(left != null)	left.inorder();
			A[i] = x;
			i++;
			if(right != null)	right.inorder();
			
		}
		
		public void printInOrder() {
			
			if(left != null)	left.printInOrder();
			System.out.println(x);
			
			if(right != null)	right.printInOrder();
			
			
		}
		
		public int min() {
			
			if(left != null)	return left.min();
			else				return x;
			
		}
		
		public int max() {
			
			if(right != null)	return right.max();
			else				return x;
			
		}
		
		public int height() {
			
			int x = 1;		int l = 0;
			int r = 0;
			
			if(left != null)	l = left.height();
			if(right != null)	r = right.height();
			
			return max(l, r) + 1;
			
		}
		
		public int max(int a, int b) {
			
			if(a >= b)	return a;
			else		return b;
			
		}
		
		public int count() {
			
			int c = 1; 
			
			if (left != null)	c += left.count();
			
			if (right != null)	c += right.count();
			
			return c;
			
		}
	}

	
	public void balance() {
		
		inorder();
		root = null;
		
		bisectionInsert(0, A.length-1);
		
	}
	
	public void bisectionInsert(int first, int last) {
		
		if(first <= last) {
			
			int middle = (first + last / 2);
			insert(A[middle]);
			bisectionInsert(first, middle-1);
			bisectionInsert(middle + 1, last);
			
		}
		
	}
	
	public void inorder() {
		
		if(!isEmpty()) {
			
			A = new int[count()];
			i = 0;
			
			root.inorder();
			
		}
	}
	
	public void insert(int value) {
		
		if(isEmpty())	root = new BSTNode(value);
		
		else			root.insert(value);
		
	}
	
	public BSTNode search(int value) {
		
		if(isEmpty())	return null;
		
		else			return root.search(value);
		
	}
	
	public void printInOrder() {
		
		if(isEmpty())	;
		
		else			root.printInOrder();
		
	}
	
	public int count() {
		
		if(isEmpty())	return 0;
		
		else			return root.count();
		
	}
	
	public int height() {
		
		if(isEmpty())	return 0;
		
		else			return root.height();
		
	}
	
	public int min() {
		
		if(isEmpty())	return Integer.MIN_VALUE;
		
		else			return root.min();
		
	}
	
	public int max() {
		
		if(isEmpty())	return Integer.MAX_VALUE;
		
		else			return root.count();
		
	}
	
	public boolean isEmpty() {
		
		return root == null;
		
	}
	
}



