public class BookApp {
    public static void main(String[] args){
        BookDB book_database = new BookDB();
        Book book1 = new Book("Java1001", "Kathy Sierra and Bert Bates", "Heading First Java",
                "Easy to read Java Workbook", 47.50, true);
        Book book2 = new Book("Java1002", "Bruce Eckel", "Thinkig in Java",
                "Details about Java under the hood", 20.00, true);
        Book book3 = new Book("Orcl1003", "Jeanne Boyarsky", "OCP: Oracle Certified Professional Java SE",
                "Everything you need to know in one place", 45.00, true);
        Book book4 = new Book("Python1004", "Al Sweigart", "Automate the Boring Stuff with Python",
                "Fun with Python", 10.50, true);
        Book book5 = new Book("Zombie1005", "Simon Monk", "The Maker's Guide to the Zombie Apocalypse",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, true);
        Book book6 = new Book("Rasp1006", "Donald Norris", "Raspberry Pi Projects for the Evil Genius",
                "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true);

        book_database.add_book(book1);
        book_database.add_book(book2);
        book_database.add_book(book3);
        book_database.add_book(book4);
        book_database.add_book(book5);
        book_database.add_book(book6);

        System.out.println(book_database.get_book("Java1001").get_display_text() + "\n");
        System.out.println(book_database.get_book("Java1002").get_display_text() + "\n");
        System.out.println(book_database.get_book("Orcl1003").get_display_text() + "\n");
        System.out.println(book_database.get_book("Python1004").get_display_text() + "\n");
        System.out.println(book_database.get_book("Zombie1005").get_display_text() + "\n");
        System.out.println(book_database.get_book("Rasp1006").get_display_text() + "\n");
    }
}