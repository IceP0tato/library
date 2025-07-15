package model.dao;

import model.dto.LogDto;

import java.util.ArrayList;

public class LogDao {
    private ArrayList<LogDto> logList = new ArrayList<>();

    private LogDao() {}
    private static final LogDao instance = new LogDao();
    public static LogDao getInstance() {
        return instance;
    }
}
