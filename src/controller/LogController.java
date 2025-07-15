package controller;

public class LogController {

    private LogController() {}
    private static final LogController instance = new LogController();
    public static LogController getInstance() {
        return instance;
    }
}
