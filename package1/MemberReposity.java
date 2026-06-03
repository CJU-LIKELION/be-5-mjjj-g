package package1;

import class4.role.Lllion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberReposity {
    private ArrayList<Lllion> role = new ArrayList<>();
    //이름 중복 확인
    public boolean isSame(String name){
        for(Lllion member : role){
            if(member.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    //멤버 저장
    public void saveMember(Lllion member){
        role.add(member);
    }
    //전체 조회
    public List<Lllion> findAll(){
        return role;
    }
    //이름으로 검색
    public Lllion nameSearch(String name){
        for(Lllion member:role){
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }


}
