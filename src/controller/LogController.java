package controller;

import model.dao.LogDao;
import model.dto.LogDto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogController { // class start
    // dao 가져오기
    private LogDao lDao = LogDao.getInstance();
    // 싱글톤
    private LogController() {}
    private static final LogController instance = new LogController();
    public static LogController getInstance() {
        return instance;
    }

    // 날짜 함수
    public static String nowDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String now = formatter.format( LocalDateTime.now() ) ;
        return now;
    }// 날짜등록 메소드 end

    // 로그 유효성검사 함수
    public LogDto logDtoReturn(int bno){
        for (int i = 0; i < lDao.logDtos().size(); i++){
            if (lDao.logDtos().get(i).getBno() == bno){
                return lDao.logDtos().get(i);
            }// if end
        }// for end
        return null;
    }// func end

    // 도서 대출 함수
    public int borrowBook(int bno){
        LogDto logDto = logDtoReturn(bno);
        if (bno유효성검사().bno == bno){
            return 0;
        } else if (logDto.getBno() == bno) {
            return 1;
        }// if end
        return 2;
    }// func end

    // 도서 반납 함수
    public boolean returnBook(int bno){
        LogDto logDto = logDtoReturn(bno);
        if (logDto.getBno() == bno){
            return LogDao.getInstance().returnBook(logDto);
        }// if end
        return false;
    }// func end
}// class end
