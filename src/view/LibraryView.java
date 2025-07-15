package view;

import controller.BookController;
import controller.LogController;
import controller.MemberController;

import java.util.Scanner;

public class LibraryView {
    private Scanner scan = new Scanner(System.in);
    private BookController bController = BookController.getInstance();
    private LogController lController = LogController.getInstance();
    private MemberController mController = MemberController.getInstance();

    private LibraryView() {}
    private static final LibraryView instance = new LibraryView();
    public static LibraryView getInstance() {
        return instance;
    }

    public void index() {
        for (;;) {
            System.out.println("=========== 도서관리 시스템 ===========");
            System.out.println("  1.회원가입 | 2.로그인");
            System.out.println("==========================================");
            System.out.print("선택 > ");
            int num = scan.nextInt();

            if (num == 1) signUp();
            else if (num == 2) signIn();
        }
    }

    public void signUp() {

    }

    public void signIn() {

    }

    public void userMenu() {

    }
}
