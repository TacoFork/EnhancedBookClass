The BookDB class already contains private member variables and a default constructor. It also contains public getters and setters for each private member variable.

While it is possible to create public member variables and avoid the getters/setters please don't do this. A small puppy will run away from home every time you do this.

Next, you'll add an overloaded constructor and a method.

An overloaded constructor is a constructor that takes one or more parameters. You can create multiple constructors as long as the parameter types and counts are unique. Create a constructor  in the BookDB  class that takes an SKU and populates the private member variables. The constructor by default will return the appropriate BookDB object when it is called. You do not need to include a return statement.

Next, create a method in your Book class called getDisplayText(). It takes no parameters. When called it returns a string containing the author, title and description. Do not use System.out.print() in your class. Simply return the string and let the calling class handle the print statements. You can use this method to print your book information to the console or a file or a web page. This method should return all information following the following structure:



"Title: Harry Potter
Author: JK Rowling

Description: A boy learns that he is a wizard. "

 

In your main method, use this method to display at least 3 different books. 