
public class Driver
{
    public static void main(String[] args){
      Book book1 = new Book("Dracula", 22, 7.55); 
      System.out.println(book1.getTitle() +" $"+ book1.getPrice());
      System.out.println("Total price of all books $" + book1.CalculateValue());
      //prints total cost of all book1's and prints single book price 
      
      System.out.println();
      
      Book book2 = new Book("Harry Potter", 264, 19.99);
      System.out.println(book2.getTitle() +" $"+ book2.getPrice());
      System.out.println("Total price of all books $" + book2.CalculateValue());
      //prints total cost of all book2's and prints single book price 
}
}
