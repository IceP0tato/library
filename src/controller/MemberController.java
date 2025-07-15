package controller;

public class MemberController {
    public static int staticMno;

    private MemberController() {}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance() {
        return instance;
    }
}
