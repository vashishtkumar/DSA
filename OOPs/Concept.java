package OOPs;


class Book{
    int price;
static int count;
public Book(int price){
    this.price=price;
    count++;
}
}
public class Concept {
    public static void main(String[] args) {
        System.out.println(Book.count);
        Book b1=new Book(150);
        Book b2=new Book(190);
       System.out.println(Book.count);
       System.out.println(b1.count);
    }
}


// class Book{
//     int price;
// static int count;
// public Book(int price){
//     this.price=price;
//     count++;
// }
// }