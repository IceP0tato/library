package controller;

public class BookController {

    private BookController() {}
    private static final BookController instance = new BookController();
    public static BookController getInstance() {
        return instance;
    }
}
