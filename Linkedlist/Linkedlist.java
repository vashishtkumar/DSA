package Linkedlist;

public class Linkedlist {

    
    class Node{
        int data;
        Node next;
        public Node(int data){
          this.data=data;
          next=null;
        } 
    }

    public static Node head;
     public Linkedlist(){
        head=null;
     }


    // add elemement  tc=O(1);
    public void addFirst(int data){
        Node newNode=new Node(data);
     if(head == null){
        head=newNode;
        return;
     }
     newNode.next=head;
     head=newNode;
    }

    //add element art the end tc=O(n);
    public void addLast(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
              temp=temp.next;
        }
        temp.next=newNode;
    }
    

   // add in the middle
    public void addMiddle(int index,int data){
        Node newNode=new Node(data);
      if(head==null){
      head=newNode;
      return;
      }
       if(index==0){
        addFirst(data);
        return;
       }
     // to check the size of linkedlist;
     Node temp=head;
     int size=0;
     while(temp!=null){
        size++;
        temp=temp.next;
     }
     if(index ==size){
        addLast(data);
        return;
     }
    if(index >= size){
        System.out.println("the index you have provided does not exists so i am adding at last");
        index=size;
        addLast(data);
        return;
    }

    // if all those case is not then it have to insert in the middle

    temp=head;
   int i=0;
    while(i<index-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    }

    // remove linkedlist from front

    public void removeFirst(){
        if(head==null){
            System.out.println("Cant remove as the linkedlist is empty");
            return;
        }
        head=head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("cant remove as the linkedlist is empty");
            return;
        }

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }


    public void removeMiddle(int index){
        if(head==null){
            System.out.println("cant remove as the linkedlist is empty");
            return;
        }
        if(index==0){
            removeFirst();
        }
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
        }
        if(index==size-1){
            removeLast();
        }
        if(index >= size){
            System.out.println("cant delete as the index excedds so i am deleting the last one");
            index=size-1;
            removeLast();
        }
    
        temp=head;
        int i=0;
        while(i > index-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;


    }
    //print the linkedlist  o(n);
    void print(){
     Node temp=head;
     while(temp!=null){
        System.out.print(temp.data +" ");
        temp=temp.next;
     }
    }

    public static void main(String[] args) {
        
        Linkedlist ll=new Linkedlist();
        ll.addFirst(15);
        ll.addFirst(19);
        ll.addLast(20);
        ll.addLast(30);
        ll.addFirst(78);
        ll.addMiddle(2, 100);
        ll.addMiddle(0, 101);
        ll.addMiddle(6, 102);
        ll.addMiddle(8, 103);
        ll.addMiddle(90, 908);
        ll.removeFirst();
        ll.removeLast();
        ll.removeMiddle(2);
       
        ll.print();
    }
}
