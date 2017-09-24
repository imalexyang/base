package cn.bishiti.base.test.DesignPattern.composite;

public class Tree {

	TreeNode root=null;
	
	public Tree(String name){
		root=new TreeNode(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree=new Tree("A");
		TreeNode nodeB=new TreeNode("B");
		TreeNode nodeC=new TreeNode("C");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished.");
	}

}
