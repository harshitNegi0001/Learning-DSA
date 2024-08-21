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
	int size;
	public MyBinaryTree(){
		this.root=null;
		this.size=0;
	}
	public void insert(T data){
		TreeNode<T> temp= new TreeNode<>(data);
		if(root==null){
			root=temp;
			size++;
			return;
		}
		Queue<TreeNode> queue= new LinkedList<>();
		queue.add(root);
		while(true){
			TreeNode<T> current= queue.poll();
			if(current.left==null){
				current.left=temp;
				size++;
				return;
			}
			if(current.right==null){
				current.right=temp;
				size++;
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
	public void levelOrder(){
		
		if(this.root==null){
			return;
		}
		Queue<TreeNode> queue= new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode<T> current= queue.poll();
			System.out.print(current.data+" ");
			if(current.left!=null){
				queue.add(current.left);
			}
			if(current.right!=null){
				queue.add(current.right);
			}			
		}
		System.out.print("\n");
	}
	
	public int hight(TreeNode root){
		if(root==null){
			return 0;
		}
		int hLeft= hight(root.left);
		int hRight= hight(root.right);
		return(hLeft<hRight)?hRight+1:hLeft+1;
	}
	public boolean isLeaf(TreeNode root){
		if(root==null){
			throw new NullPointerException("root value is null");
		}
		return (root.left==null&&root.right==null);
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
        System.out.println("\nbinary tree in levelOrder : ");
        tree.levelOrder();
        System.out.println("hight of tree is : "+tree.hight(tree.root));
        System.out.println("is tree root is  a leaf ? = "+tree.isLeaf(tree.root));
        System.out.println("Nodes in tree = "+tree.size);
	}
}