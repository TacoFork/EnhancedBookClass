public class Book {
    private String sku;
    private String author;
    private String title;
    private String description;
    private double price;
    private boolean is_in_stock;

    public Book(){
        this.sku = "SKU";
        this.title = "title";
        this.author = "author";
        this.description = "description";
        this.price = 0.0;
        this.is_in_stock = false;
    }

    //overloaded constructor to set attributes in parameters
    public Book(String sku, String author, String title, String description, double price, boolean is_in_stick){
        this.sku = sku;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.is_in_stock = is_in_stick;
    }

    //sets SKU of a book
    public void set_sku(String sku){
        this.sku = sku;
    }

    //gets sku of a book
    public String get_sku(){
        return this.sku;
    }


    //sets title of book
    public void set_title(String title){
        this.title = title;
    }

    //gets title of book
    public String get_title(){
        return this.title;
    }

    //sets author of book
    public void set_author(String author){
        this.author = author;
    }

    //gets author of book
    public String get_author(){
        return this.author;
    }

    //sets description of book
    public void set_description(String description){
        this.description = description;
    }

    //gets description of book
    public String get_description(){
        return this.description;
    }

    //sets price of book
    public void set_price(double price){
        this.price = price;
    }

    //gets price of book
    public double get_price(){
        return this.price;
    }

    //sets boolean value is_in_stock
    public void set_is_in_stock(boolean is_in_stock){
        this.is_in_stock = is_in_stock;
    }

    //gets boolean value of is_in_stock
    public boolean get_is_in_stock(){
        return this.is_in_stock;
    }

    //prints author, title, and description
    public String get_display_text(){
        return "Author: " + this.author + "\nTitle: " + this.title + "\nDescription: " + this.description;
    }

    //returns pricing of a book if it is in stock
    public double pricing(int num_books){
        double total_price;
        if (is_in_stock){
            total_price = num_books*this.price;
            return total_price;
        }
        else{
            System.out.printf("%s is out of stock", this.title);
        }
        return 0;
    }
}