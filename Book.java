/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Emaan Jaffer
 * @version 09.10.2024
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isBookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = isBookCourseText;
    }
    
    /**
     * Returns the author of the book.
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Returns the number of pages in the book.
     */
    public int getPages(){
        return pages;
    }
    
    /**
     * Returns the reference number of the book.
     */
    public String getRefNumber(){
        return refNumber;
    }
    
    /**
     * Returns the amount of times a book is borrowed.
     */
    public int getBorrowed(){
        return borrowed;
    }
    
    /**
     * Returns whether the book is a course text or not.
     */
    public boolean isCourseText(){
        return courseText;
    }
    
    /**
     * Sets the reference number of the book.
     */
    public void setRefNumber(String ref){
        if (ref.length() == 3){
            refNumber = ref;
        }
        else{
            System.out.println("Error!");
        }
    }
    
    /**
     * Increases the number of times the book is borrowed by 1.
     */
    public void borrow(){
        borrowed += 1;
    }
    
    /**
     * Prints the author.
     */
    public void printAuthor(){
        System.out.println(author);
    }
    
    /**
     * Prints the title.
     */
    public void printTitle(){
        System.out.println(title);
    }
    
    /**
     * Prints all the details of the book.
     */
    public void printDetails(){
        if (refNumber.length() == 0){
           System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: ZZZ, This book has been borrowed " + borrowed + " times"); 
        }
        
        else{
           System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: " + refNumber + ", This book has been borrowed " + borrowed + " times"); 
        }
    }
}
