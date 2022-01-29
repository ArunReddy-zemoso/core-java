public class BookDemo {
    public static void main(String[] args) {
        Book GOT=new Book("George","GameofThrones","Fantasy",864);
        Book mathBook=new Book("James","Calculas","Math",1234);
        GOT.printBookDetails();
        System.out.println();
        mathBook.printBookDetails();
    }
}
