package package1;

import class4.role.Lllion;

import java.util.ArrayList;
import java.util.List;

public class MemberService {
    //내부에서 repository 직접 생성
    private MemberReposity repository = new MemberReposity();

    //중복 확인 후 멤버 등록
    public boolean register(Lllion member){
        if(repository.isSame(member.getName())){
            return false;
        }
        repository.saveMember(member);
        return true;
    }

    //이름으로 검색
    public Lllion searchByName(String name){
        return repository.nameSearch(name);
    }

    //전체 멤버 조회
    public List<Lllion> findMember(){
        return repository.findAll();
    }
}
