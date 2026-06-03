package package2;

import class4.role.Lion;
import class4.role.Lllion;
import class4.role.Staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockMemberRepository implements MemberReposity{
    ArrayList<Lllion> role = new ArrayList<>();


    //이름 중복 확인
    public boolean isSame(String name){
        return false;
    }
    //멤버 저장
    public void saveMember(Lllion member){
        role.add(member);
    }
    //전체 조회
    public List<Lllion> findAll(){
        ArrayList<Lllion> mockRole = new ArrayList<>();
        Lllion lion1 = new Lion("1", "전민준","인지소","3","백엔드","32322");
        Lllion staff1 = new Staff("2","홍길동", "인지소","2","프론트","운영자");
        mockRole.add(lion1);
        mockRole.add(staff1);
        return mockRole;
    }
    //이름으로 검색
    public Lllion nameSearch(String name){

        return null;
    }
}
