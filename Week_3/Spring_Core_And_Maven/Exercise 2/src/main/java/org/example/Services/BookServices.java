package org.example.Services;

import org.example.Repository.BookRepository;

public class BookServices {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public void addBook(String bookName){
        bookRepository.saveBook(bookName);
    }
}
