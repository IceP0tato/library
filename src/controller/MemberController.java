package controller;

import model.dao.MemberDao;

public class MemberController {
    private MemberDao mDao = MemberDao.getInstance();
    public static int staticMno = 0;

    private MemberController() {}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance() {
        return instance;
    }
}
