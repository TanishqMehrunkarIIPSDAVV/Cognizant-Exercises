package com.example;
import com.library.service.BookService;
import com.library.repository.BookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String args[])
    {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml"))
        {
            BookService bookService = (BookService) context.getBean("bookService");
            BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");

            System.out.println("--------------------My Output Starting--------------------");
            System.out.println();
            System.out.println(bookService.getBookTitle());
            System.out.println(bookRepository.findBookByID(1));
            System.out.println();
            System.out.println("--------------------My Output Ending--------------------");
        }
    }
}