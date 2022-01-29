public class Book {
    private String author,title,genre;
    private int numPages;
    public Book(String author,String title,String genre,int numPages){
        this.author=author;
        this.title=title;
        this.genre=genre;
        this.numPages=numPages;
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getNumPages(){
        return numPages;
    }
    public void printBookDetails(){
        System.out.println(this.getAuthor());
        System.out.println(this.getTitle());
        System.out.println(this.getGenre());
        System.out.println(this.getNumPages());
    }
}
