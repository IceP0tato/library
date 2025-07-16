package controller; // 패키지명

import model.dao.BookDao;
import model.dto.BookDto;

public class BookController { // class start
    // dao가져오기
    private BookDao bDao = BookDao.getInstance();
    // 싱글톤
    private BookController() {}
    private static final BookController instance = new BookController();
    public static BookController getInstance() {
        return instance;
    }

    // 북 등록 함수
    public boolean addBook(String btitle , String bwriter ){
        boolean result = false;
        result =  bDao.addBook(btitle,bwriter);
        return result;
    }// func  end

    // 유효성 검사
    public BookDto getbook(int bno){
        for (int i = 0; i < bDao.bDtoReturn().size(); i++){
            BookDto bookDto = bDao.bDtoReturn().get(i);
            if (bookDto.getBno() == bno){
                return bDao.bDtoReturn().get(i);
            }// if end
        }// for end
        return null;
    }// func end
}// class end
