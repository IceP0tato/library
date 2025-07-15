package controller;

import model.dao.LogDao;

public class LogController {
    private LogDao lDao = LogDao.getInstance();

    private LogController() {}
    private static final LogController instance = new LogController();
    public static LogController getInstance() {
        return instance;
    }
}
