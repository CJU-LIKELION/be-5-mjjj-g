package class4.role;

import class4.policy.Policy; // public abstract Policy isAvailable(); Policy를 그냥 가져오면 에러가 뜸
import jdk.internal.dynalink.linker.LinkerServices;

import java.util.List;


public abstract class Lllion {
    private String name;
    private String major;
    private int batch;
    private String part;
    private String rolle;


    //추상 클래스 생성자
    public Lllion(String rolle, String name, String major, int batch, String part) {
        this.name = name;
        this.major = major;
        this.batch = batch;
        this.part = part;
        this.rolle = rolle;
    }

    public abstract Policy getPolicy(); //정책 객체를 반환하는 추상 메서드
    public boolean isAvailable(){
        return getPolicy().isAvailable();  //3번. 판단을 정책 객체에 위임
    }
    public abstract String getInform(); //4-1. 상세 정보를 반환하는 추상 메서드



    //공통 속성 가져가기
    public String getName(){
        return name;
    }
    public String getMajor(){
        return major;
    }
    public int getBatch(){
        return batch;
    }
    public String getPart(){
        return part;
    }






}
