/*
4. Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library.
The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor.
The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.
*/

import java.util.Scanner;

class Book {
    private String title, author, publisher;
    private int isbn;

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getPublisher() {
        return publisher;
    }

    int getisbn() {
        return isbn;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    void setISBN(int isbn) {
        this.isbn = isbn;
    }
}

class Author {
    Scanner sc=new Scanner(System.in);
    String name, email;
    Book book[] = new Book[5];
    Author author[] = new Author[5];
    int totalBooks=0;

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    void addBook() {
        Book book = new Book();
        System.out.println("Enter book title :");
        book.setTitle(sc.nextLine());
        System.out.println("Enter book Author :");
        String name=sc.nextLine();
        book.setAuthor(name);
        System.out.println("Enter book punlisher :");
        book.setPublisher(sc.nextLine());
        System.out.println("Enter book ISBN :");
        book.setISBN(sc.nextInt());
        this.book[totalBooks]=book;

        // for(int i=0;i<author.length;i++){
        //     if(author[i].getName()==name){
                
        //     }
        // }
    }

    public static void main(String[] args) {
        Author author=new Author();
    }
}