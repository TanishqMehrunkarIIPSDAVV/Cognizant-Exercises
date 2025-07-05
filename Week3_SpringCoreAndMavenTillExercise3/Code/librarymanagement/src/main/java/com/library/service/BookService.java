package com.library.service;

import com.library.repository.*;

public class BookService
{
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository br)
    {
        this.bookRepository = br;
    }

    public String getBookTitle()
    {
        return "Spring in Action - " + (this.bookRepository != null ? this.bookRepository.findBookById(1) : "No Repo");
    }
}