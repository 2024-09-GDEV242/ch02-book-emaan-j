/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Emaan Jaffer
 * @version 09.10.2024
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public String getRefNumber(){
        return refNumber;
    }
    
    public int getBorrowed(){
        return borrowed;
    }
    
    public void setRefNumber(String ref){
        if (ref.length() == 3){
            refNumber = ref;
        }
        else{
            System.out.println("Error!");
        }
    }
    
    public void borrow(){
        borrowed += 1;
    }
    public void printAuthor(){
        System.out.println(author);
    }
    
    public void printTitle(){
        System.out.println(title);
    }
    
    public void printDetails(){
        if (refNumber.length() == 0){
           System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: ZZZ, This book has been borrowed " + borrowed + " times"); 
        }
        
        else{
           System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: " + refNumber + ", This book has been borrowed " + borrowed + " times"); 
        }
    }
}
