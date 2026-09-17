package ktra;

class Book{
    
	private String bookCode;
    private String title;
    private double price;

    public static int bookCount = 0;

    public Book(String bookCode, String title, double price)
    {
    		this.bookCode = bookCode;
        this.title = title;
        
        //giá (price)
        if (price> 0){
            this.price = price;
        }
        bookCount++;
    }

    
    public String getBookCode() {
        return this.bookCode;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void displayInfo() {
        System.out.println(this.bookCode + "," + this.title + "," + this.price);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String bookCode, String title, double price, double fileSize) {
        super(bookCode, title, price);
        this.fileSize = fileSize;
    }
    public double getFileSize(){
        return this.fileSize;
    }
    public void setFileSize(double fileSize){
        this.fileSize = fileSize;
    }

    public void displayInfo(){
        System.out.println(getBookCode()+ "," + getTitle() +"," + getPrice() +"," + this.fileSize +"MB");
    }
}

public class ktr2{
    public static void main(String[] args){
    	
        Book b1 = new Book("B01","Java", 50000);
        Book b2 = new Book("B02","Python",60000);
        EBook b3 = new EBook("EB01", "Web", 40000,10.5);

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();

        System.out.println("Tong so sach: " + Book.bookCount);
    }
}