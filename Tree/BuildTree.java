public class BuildTree {
    public static class Node{

        int data;
        Node left;
        Node right;
        Node(int data){
       this.data=data;
       this.left=null;
       this.right=null;
       
        }
    }


    public static class BuildBinaryTree{
        static int index=-1;

        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]==-1)
            return null;

            Node newnode=new Node(nodes[index]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);

            return newnode;
        }

      }
    public static void main(String[] args) {
        int arr[]={2,3,4,-1,-1,-1,-1};

        BuildBinaryTree tree=new BuildBinaryTree();
        Node root=tree.buildTree(arr);
        System.out.println(root.data);
    }
}
