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

    //InorderOrder traversal tc=O(n) sc=O(1)

    static  void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);
    }

    //postOrder traversal tc=O(n)  sc=o(1)

    static void postorder(Node root){
        if(root==null){
            return;
        }
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data);
    }

    //levelOrder traversal tc=O(n)  sc=O(n)
    static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
           Node currNode=queue.poll();
           System.out.print(currNode.data);
           if(currNode.left!=null){
            queue.add(currNode.left);
           }
           if(currNode.right !=null){
            queue.add(currNode.right);
           }
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,-1,5,-1,4};
        BinaryTree tree1=new BinaryTree();
        Node root=tree1.treeformation(arr);
        System.out.println("this is head of the data =" + root.data);
        System.out.println("preorder trevaersal");
        preorder(root);
        System.out.println();
        System.out.println("Inorder traversal");
        Inorder(root);
        System.out.println();
        System.out.println("postorder traversal");
        postorder(root);
        System.out.println();
        System.out.println("LevelOrder traversal");
        levelorder(root);
    }

}
