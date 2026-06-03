package package2;

import class4.role.Lllion;

import java.util.ArrayList;
import java.util.List;

public interface MemberReposity {
    //이름 중복 확인
    boolean isSame(String name);
    //멤버 저장
    void saveMember(Lllion member);
    //전체 조회
    List<Lllion> findAll();
    //이름으로 검색
    Lllion nameSearch(String name);

}
