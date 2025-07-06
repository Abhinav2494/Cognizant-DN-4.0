package org.example;
import org.example.Services.BookServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServices bookService = (BookServices) context.getBean("bookSer");
        bookService.addBook("springboot book");
    }
}