## Question 2: You are working for a company that develops a library management system. As part of the system, you need to model the concept of a library and its books. (25 Marks)
- Create two packages:
    - library and management
        - In the library package, create two classes:
            - Class: Book
                - Properties:
                    - String title (instance variable)
                    - String author (instance variable)
                    - static int totalBooks (static variable to keep track of the total number of books created)
                - Constructors:
                    - Default constructor: Initializes title as "Unknown" and author as "Unknown".
                    - Parameterized constructor: Takes title and author as parameters and increments totalBooks by 1 every time a new book object is created.
                - Methods:
                    - Getter and Setter methods for title and author.
                    - static int getTotalBooks(): This method should return the value of totalBooks.
                    - void displayBookInfo(): This method should print the title and author of the book.
            - Class: Library
                - Properties:
                    - String libraryName (instance variable)
                    - int numberOfBooks (instance variable to keep track of the number of books in the library)
                - Constructors:
                    - Default constructor: Initializes libraryName to "Unnamed Library" and numberOfBooks to 0.
                    - Parameterized constructor: Takes libraryName and numberOfBooks as parameters.
                - Methods:
                    - Getter and Setter methods for libraryName and numberOfBooks.
                    - void displayLibraryInfo(): This method should print the library's name and the number of books.
        - In the management package, create a Main class:
            - Inside the main method:
                - Create three Book objects using both the default and parameterized constructors.
                - Set the title and author for each book using setter methods (if using default constructor).
                - Display information for each book using the displayBookInfo() method.
                - Display the total number of books created using the static method getTotalBooks().
                - Create a Library object using the parameterized constructor and set the number of books it holds.
                - Display information about the library using the displayLibraryInfo() method.
