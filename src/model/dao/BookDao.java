package model.dao;

import model.dto.BookDto;

import java.util.ArrayList;

public class BookDao {
    private ArrayList<BookDto> bookList = new ArrayList<>();
    
    private BookDao() {}
    private static final BookDao instance = new BookDao();
    public static BookDao getInstance() {
        return instance;
    }
}
