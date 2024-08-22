import java.util.*;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class MyBinarySearchTree{
	TreeNode root;
	int size;
	public MyBinarySearchTree(){
		root=null;
		size=0;
	}
	public void insert(int data){
		TreeNode newNode = new TreeNode(data);
		if(root==null){
			root=newNode;
			size++;
			return;
		}
		TreeNode current= root;
		while(current!=null){
			if(data<current.data){
				if(current.left==null){
					current.left=newNode;
					size++;
					return;
				}
				current=current.left;
			}
			else if(data>current.data){
				if(current.right==null){
					current.right=newNode;
					size++;
					return;
				}
				current=current.right;
			}
			else{
				return;
			}		
		}
	}
	
	public void inOrder(){
		inOrder(this.root);
		System.out.print("\n");
	}
	public void inOrder(TreeNode root){
		if(root==null){
			return;
		}		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public void preOrder(){
		preOrder(this.root);
		System.out.print("\n");
	}
	public void preOrder(TreeNode root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void postOrder(){
		postOrder(this.root);
		System.out.print("\n");
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
			TreeNode current= queue.poll();
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
	public int height(){
		return height(this.root);
	}
	public int height(TreeNode root){
		if(root==null){
			return 0;
		}
		int hLeft= height(root.left);
		int hRight= height(root.right);
		return Math.max(hRight,hLeft)+ 1;
	}
	public boolean search(int key){
		return (search(this.root,key)!=null)? true : false;
	}
	public TreeNode search(TreeNode root, int key){	
		if(root==null||root.data==key){
			return root;
		}			
		else if(root.data<key){
			return search(root.right,key);
		}
		else{
			return search(root.left,key);
		}
		
	}
	
}

public class BinaryTreeImplementation {
	public static void main(String[] args) {
		MyBinarySearchTree tree = new MyBinarySearchTree();
		tree.insert(40);
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(60);
        tree.insert(50);
        tree.insert(70);
        
        System.out.println("binary tree in inOrder : ");
        tree.inOrder();
        System.out.println("binary tree in preOrder : ");
        tree.preOrder();
        System.out.println("binary tree in postOrder : ");
        tree.postOrder();
        System.out.println("binary tree in levelOrder : ");
        tree.levelOrder();
        System.out.println("height of tree is : "+tree.height());
        System.out.println("Nodes in tree = "+tree.size);
        
        System.out.println("20 present in tree : "+tree.search(20));
        System.out.println("24 present in tree : "+tree.search(24));
	}
}