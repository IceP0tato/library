package controller; // 패키지명

import model.dao.BookDao;
import model.dto.BookDto;

import java.util.ArrayList;

public class BookController { // class start
    // dao가져오기
    private BookDao bDao = BookDao.getInstance();
    // 싱글톤
    private BookController() {}
    private static final BookController instance = new BookController();
    public static BookController getInstance() {
        return instance;
    }

    public boolean addBook(String btitle , String bwriter ){
        boolean result = false;
        result =  bDao.addBook(btitle,bwriter);
        return result;
    }// func  end
}// class end
