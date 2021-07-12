import java.util.ArrayList;
public class BookDB {
    private ArrayList<Book> book_list = new ArrayList<>();

    public BookDB(){
        book_list = new ArrayList<>();
    }

    //adds Book object into a array list acting as a database
    public void add_book(Book book_object){
        book_list.add(book_object);
    }

    //Searches through an array list to look for an Book object with a matching SKU
    public Book get_book(String sku){
        for (int index =0; index < book_list.size(); index++){
            if (book_list.get(index).get_sku() == sku){
                return book_list.get(index);
            }
        }
        return null;
    }
}
