package class4.role;

import class4.policy.LionPolicy;
import class4.policy.Policy;

public class Lion extends Lllion{
    private String studentId;

    public Lion(String rolle, String name, String major, String batch, String part, String studentId) {
        super(rolle, name, major, Integer.parseInt(batch), part); // 부모 생성자 호출
        this.studentId = studentId;
    }

    public Policy getPolicy(){
        return new LionPolicy(); //2번. 자신에게 맞는 정책 반환 라이언->라이언정책
    }

    public String getInform(){
        return "이름: " + getName()
                + "\n" + "전공: " + getMajor()
                + "\n" + "기수: " + getBatch()
                + "\n" + "파트: " + getPart()
                + "\n" + "학번: " + studentId;
    }
}
