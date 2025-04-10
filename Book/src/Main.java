class Book{
    private String author;
    private String[] chapNames;

    public Book(){
        this.author = "";
        this.chapNames = new String[100];
    }
    public Book(String a,String[] c){
        this.author = a;
        this.chapNames = c.clone();
    }
    public void setAuthor(String n){
        this.author = n;
    }
    public String getAuthor(){
        return author;
    }
    public void setChapNames(String[] chaps){
        this.chapNames = chaps.clone();
    }
    public String[] getChapnames(){
        return chapNames;
    }
    public boolean compareBooks(Book b){
        return this.author.equalsIgnoreCase(b.author);
    }
    public int countchaps(String[] chaps){
        int count = 0;
        for(String ch : chaps){
            count++;
        }
        return count;
    }
    public Book comparechaps(Book b){
    int thischaps = countchaps(this.chapNames);
    int otherchaps = countchaps(b.chapNames);

    return (thischaps > otherchaps)? this : b;
    }
}

public class Main {
    public static void main(String[] args){
        Book b1 = new Book();
        b1.setAuthor("Martin");
        b1.setChapNames(new String[]{"AL chemist,clean code"});

        String[] chap = {"clean code"};
        Book b2 = new Book("martin",chap);

        if (b1.compareBooks(b2)) {
            System.out.println("Both books have the same author: " + b1.getAuthor());
        } else {
            System.out.println("Books have different authors.");
        }
        Book largerBook = b1.comparechaps(b2);
        System.out.println("The book with more or equal chapters is written by: " + largerBook.getAuthor());
    }
}