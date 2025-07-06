package com.library.service;
import com.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService
{
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository br)
    {
        this.bookRepository = br;
    }

    public String getBookTitle()
    {
        return "Spring in Action - " + (this.bookRepository != null ? this.bookRepository.findBookByID(1) : "No Repo");
    }
}