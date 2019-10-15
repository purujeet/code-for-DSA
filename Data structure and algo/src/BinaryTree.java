
public class BinaryTree {

	class Node {
		int data;
		Node left, right;

		Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}

	public Node insert(Node node, int k) {
		if (node == null) {
			Node temp = new Node(k);
			return temp;
		} else {
			if (k < node.data) {
				node.left = insert(node.left, k);
			} else if (k >= node.data) {
				node.right = insert(node.right, k);
			}
			return node;
		}
	}
public Node delete(Node node, int k) {
	if (node == null) {
		return null;
	}
	else {
		if (k > node.data) {
			node.left = delete(node.left, k);
		}
		else if (k< node.data) {
			node.right = delete(node.right,k);
			
		}
		else {
			if (node.left == null || node.right == null) {
				
				Node temp = null;
				temp  = node.left == null ? node.left : node.right;
				
				
				if (temp == null) {
				return null	;
				}
				else {
					return node;
				}
				
			}
			else {
				Node successor = getSuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right ,successor.data);
				return node;
			}
		}
	}
return node;
}

public static Node getSuccessor(Node node) {
	if (node == null) {
		return null;
	}
	Node temp = node.right;
	while (temp.left != null) {
		temp = temp.left;	
	}
	return temp;
}

public static void inorder(Node node) {
	if (node == null) {
		return ;
	}
	else {
		inorder(node.left);

		System.out.print(node.data+" ");
		inorder(node.right);

	}
}
public static void preorder(Node node) {
	if (node == null) {
		return ;
	}
	else {

		System.out.print(node.data+" ");
		preorder(node.left);
		
		preorder(node.right);

	}
}
public static void postorder(Node node) {
	if (node == null) {
		return ;
	}
	else {
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		Node root = null;
		root = bt.insert(root, 5);
		root = bt.insert(root, 3);
		root = bt.insert(root, 4);
		root = bt.insert(root, 10);
		root = bt.insert(root, 6);
		root = bt.insert(root, 7);
		root = bt.insert(root, 9);
	
		root = bt.delete(root, 5);
	inorder(root);
	System.out.println();
	preorder(root);
	System.out.println("");
	postorder(root);
	}

}
