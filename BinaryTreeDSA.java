import java.util.*;

class TreeNode<T>{
	T data;
	TreeNode left;
	TreeNode right;
	public TreeNode(T data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class MyBinaryTree<T>{
	TreeNode root;
	int hight;
	public MyBinaryTree(){
		this.root=null;
		this.hight=0;
	}
	public void insert(T data){
		TreeNode<T> temp= new TreeNode<>(data);
		if(root==null){
			root=temp;
			return;
		}
		Queue<TreeNode> queue= new LinkedList<>();
		queue.add(root);
		while(true){
			TreeNode<T> current= queue.poll();
			if(current.left==null){
				current.left=temp;
				return;
			}
			if(current.right==null){
				current.right=temp;
				return;
			}
			queue.add(current.left);
			queue.add(current.right);
		}
		
		
	}
	public void preOrder(TreeNode root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void inOrder(TreeNode root){
		if(root==null){
			return;
		}		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public void postOrder(TreeNode root){
		if(root==null){
			return;
		}		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");		
	}
}
public class BinaryTreePractice {
	public static void main(String[] args) {
		MyBinaryTree<Integer> tree = new MyBinaryTree<>();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);
        System.out.println("binary tree in preOrder : ");
        tree.preOrder(tree.root);
        System.out.println("\nbinary tree in inOrder : ");
        tree.inOrder(tree.root);
        System.out.println("\nbinary tree in postOrder : ");
        tree.postOrder(tree.root);
        
	}
}