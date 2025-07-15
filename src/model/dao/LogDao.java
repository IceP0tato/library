package model.dao;

import controller.BookController;
import controller.LogController;
import model.dto.LogDto;

import java.util.ArrayList;

public class LogDao {// class start
    // 리스트 선언
    private ArrayList<LogDto> logList = new ArrayList<>();
    // 싱글톤
    private LogDao() {}
    private static final LogDao instance = new LogDao();
    public static LogDao getInstance() {
        return instance;
    }

    // 리스트 반환함수
    public ArrayList<LogDto> logDtos(){
        return logList;
    }// func end

    // 도서 대출 함수
    public boolean borrowBook(int bno){
        boolean result = false;
        if (LogController.getInstance().borrowBook(bno) == 0){
            LogDto logDto = new LogDto(mno ,bno ,LogController.nowDate());
            result = true;
        }// if end
        return result;
    }// func end

    // 도서 반납함수
    public boolean returnBook(LogDto dto){
        boolean result = false;
        dto.setReturnDate(LogController.nowDate());
        result = true;

        return result;
    }// func end
}// class end
