package com.library.repository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository
{
    public String findBookByID(int id)
    {
        return "Book ID: "+id;
    }
}