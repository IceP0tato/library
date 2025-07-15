package controller;

import model.dao.BookDao;

public class BookController {
    private BookDao bDao = BookDao.getInstance();

    private BookController() {}
    private static final BookController instance = new BookController();
    public static BookController getInstance() {
        return instance;
    }
}
