
public class Book {
	public String bookID;
    public String bookName;
    public String bookColor;
    public double bookPrice;

    public void setBookID(String id) {
        this.bookID = id;
    }
    public void setBookName(String name) {
        this.bookName = name;
    }
    public void setBookColor(String color) {
        this.bookColor = color;
    }
    public void setBookPrice(double price) {
        this.bookPrice = price;
    }

    public String getBookID() {
        return this.bookID;
    }
    public String getBookName() {
        return this.bookName;
    }
    public String getBookColor() {
        return this.bookColor;
    }
    public double getBookPrice() {
        return this.bookPrice;
    }
}
