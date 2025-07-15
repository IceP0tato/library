package model.dao;

import model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {
    private ArrayList<MemberDto> memberList = new ArrayList<>();

    private MemberDao() {}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance() {
        return instance;
    }
}
