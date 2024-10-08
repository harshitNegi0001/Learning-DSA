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
	/*
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
*/
	public void insert(int data){
		this.root=insert(this.root,data);
		size++;
	}
	
	public TreeNode insert(TreeNode root,int data){
		
		if(root==null){
			
			root=new TreeNode(data);
			
		}
		else if(data<root.data){
			root.left = insert(root.left,data);
			
		}
		else if(data>root.data){
			root.right = insert(root.right,data);
		
		}		
		return root;				
	}
	
	public void delete(int key){
		this.root=delete(this.root,key);
		size--;
	}
	
	public TreeNode delete(TreeNode root,int key){
		if(root==null){
			return null;
		}
		if(key<root.data){
			root.left=delete(root.left,key);
		}
		else if(key>root.data){
			root.right = delete(root.right,key);
		}
		else{
			//key matched with root.data or root=null
			//case 1 if node is a leaf
			if(root.left==null && root.right==null){
				root=null;
			}
			//case 2 if node has only one child
			else if (root.left==null){
				root=root.right;
			}
			else if (root.right==null){
				root=root.left;
			}			
			//case 3 if node has two child
			else{
				TreeNode IS = inorderSuccessor(root.right);
				root.data=IS.data;
				root.right=delete(root.right,IS.data);
			}
		}
		
		return root;
	}
	public TreeNode inorderSuccessor(TreeNode root){
		while(root.left!=null){
			root=root.left;
		}
		return root;
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
	public void printInRange(int start, int end){
		printInRange(this.root,start,end);
		System.out.println("");
	}
	public void printInRange(TreeNode root,int start,int end){
		if(root==null){
			return;
		}
		if(root.data>=start && root.data<=end){
			printInRange(root.left,start,end);
			System.out.print(root.data+" ");
			printInRange(root.right,start,end);
		}
		else if(root.data>end){
			printInRange(root.left,start,end);
		}
		else{
			printInRange(root.right,start,end);
		}
	}
	public void printRootToLeafPath(){
		ArrayList<Integer> arr=new ArrayList<>();
		printRootToLeafPath(this.root,arr);
	}
	public void printRootToLeafPath(TreeNode root,ArrayList<Integer> arr){
		if(root==null){
			return;
		}
				
		arr.add(root.data);
		if(root.left==null&&root.right==null){
			for(int item:arr){
				System.out.print(item+"->");
			}
			System.out.println("null");
		}	
		else{
			printRootToLeafPath(root.left,arr);			
			printRootToLeafPath(root.right,arr);			
		}
		arr.remove(arr.size()-1);
	}
	public TreeNode LCA(int p,int q){
	   return lowestCommonAncestor(this.root,p,q);
	}
    public TreeNode lowestCommonAncestor(TreeNode root,int p,int q){
        if(root==null){
            return null;
        }
        if(p<root.data && q<root.data){
            return lowestCommonAncestor(root.left,p,q);
        } 
        else if (p>root.data && q>root.data){
            return lowestCommonAncestor(root.right,p,q);
        }         
        else {
            return root;
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
        /*System.out.println("binary tree in preOrder : ");
        tree.preOrder();
        System.out.println("binary tree in postOrder : ");
        tree.postOrder();
        System.out.println("binary tree in levelOrder : ");
        tree.levelOrder();
        System.out.println("height of tree is : "+tree.height());
        System.out.println("Nodes in tree = "+tree.size);
        
        System.out.println("20 present in tree : "+tree.search(20));
        System.out.println("24 present in tree : "+tree.search(24));
        */
       // System.out.println("data present in tree between 20 to 50 :");
      //  tree.printInRange(20,50);
       /* tree.delete(40);
        System.out.println("binary tree in inOrder (after delete 40 from BST) : ");
        tree.inOrder();
        */
        System.out.println("Path : ");
        tree.printRootToLeafPath();
        
        TreeNode temp= tree.LCA(10,30);
        System.out.print("Lowest Common Ancestor of(10,30) for this tree :");
        if(temp!=null){
        	System.out.println(temp.data);
        }
	}
}