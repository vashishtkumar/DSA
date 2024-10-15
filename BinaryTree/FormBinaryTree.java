package BinaryTree;
import java.util.*;
class FormBinaryTree {

    static class Node{

        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }

    static class BinaryTree{
        Node root;
        public Node treeformation(int arr[]){
          if(arr.length==0 || arr[0]==-1){
            return null;
          }
        Queue <Node> queue =new LinkedList<>();
        root=new Node(arr[0]);
        queue.add(root);
        int i=1;
        while(i < arr.length){
            Node currNode=queue.remove();// queuw.poll();
            if(i<arr.length && arr[i]!=-1){
                currNode.left=new Node(arr[i]);
                queue.add(currNode.left);
            }
            i++;
            if(i<arr.length && arr[i]!=-1){
                currNode.right=new Node(arr[i]);
                queue.add(currNode.right);
            }
            i++;
        }
          return root;
        }
    }


    // tree traversal

    //preOrder  tc=O(n) sc=O(1);

    static void preorder(Node root){
        if(root==null){
            return;
        }
       
        System.out.print(root.data);
         preorder(root.left);
         preorder(root.right);
    }

    


    public static void main(String[] args) {
        int arr[]={1,2,3,-1,5,-1,4};
        BinaryTree tree1=new BinaryTree();
        Node root=tree1.treeformation(arr);
        System.out.println("this is head of the data =" + root.data);
        preorder(root);
        
    }

}
