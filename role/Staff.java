package class4.role;

import class4.policy.Policy;
import class4.policy.StaffPolicy;

public class Staff extends Lllion{
    private String position;

    public Staff(String rolle, String name, String major, String batch, String part, String position) {
        super(rolle, name, major, Integer.parseInt(batch), part); // 부모 생성자 호출
        this.position = position;
    }

    public Policy getPolicy(){
        return new StaffPolicy();//2번. 자신에게 맞는 정책 반환 운영자->운영자정책
    }

    public String getInform(){
        return "이름: " + getName()
                + "\n" + "전공: " + getMajor()
                + "\n" + "기수: " + getBatch()
                + "\n" + "파트: " + getPart()
                + "\n" + "직책: " + position;
    }
}
