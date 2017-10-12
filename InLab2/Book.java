
public class Book
{
    String title;
    int numBook;
    double price;
   
    public Book(String inTitle, int inNumBook, double inPrice){
        title=inTitle;
        numBook=inNumBook;
        price=inPrice;
    }
    public String getTitle(){
        return title;
    }
    public int getNumBook(){
        return numBook;
    }
    public double getPrice(){
        return price;
    }
    public double CalculateValue(){
        return numBook * price;
    }
}    
    