package package2;

import class4.role.Lion;
import class4.role.Lllion;
import class4.role.Staff;
import package2.MemberService;

import java.util.List;
import java.util.Scanner;

public class Main{
    /*기존 데이터 보관소인 리스트가 repository로 이동했으니 없어도 됨
    static ArrayList<Lllion> role = new ArrayList<>();  */

    static Scanner sc = new Scanner(System.in);
    static MemberReposity repository = new MockMemberRepository();
    static MemberService service = new MemberService(repository);

    public static void main(String[] args){
        while (true){
            System.out.println("===멤버 관리 시스템===");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 전체 멤버 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 종료");
            String num = sc.nextLine();

            if(num.equals("1")){
                registerMember();
            } else if (num.equals("2")) {
                memberSearch();
            } else if (num.equals("3")) {
                nameSearch();
            } else if (num.equals("4")) {
                break;
            }
        }
    }
    /*중복 체크, repository로 이동함
    public static boolean isSame(String name){
        for(Lllion member : role){
            if(member.getName().equals(name)){
                return  true;
            }
        }
        return false;
    }
     */
    public static void registerMember(){
        System.out.println("===아기사자 정보 입력===");
        System.out.println("역할 선택 (1: 아기사자, 2: 운영진)");
        String rolle = sc.nextLine();
        if(rolle.equals("1")){
            System.out.println("이름: ");
            String name = sc.nextLine();
            System.out.println("전공: ");
            String major = sc.nextLine();
            System.out.println("기수: ");
            String batch = sc.nextLine();
            System.out.println("파트: ");
            String part = sc.nextLine();
            System.out.println("학번: ");
            String studentId = sc.nextLine();
            Lllion lion = new Lion(rolle, name, major, batch, part, studentId);
            //service에 맞긴 부분1
            if(service.register(lion)){
                System.out.println("등록 완료: " + name);
            } else {
                System.out.println("이미 등록됨");
            }
        } else if (rolle.equals("2")) {
            System.out.println("이름: ");
            String staffName = sc.nextLine();
            System.out.println("전공: ");
            String staffMajor = sc.nextLine();
            System.out.println("기수: ");
            String staffBatch = sc.nextLine();
            System.out.println("파트: ");
            String staffPart = sc.nextLine();
            System.out.println("학번: ");
            String position = sc.nextLine();
            Lllion staffLion = new Staff(rolle, staffName, staffMajor, staffBatch, staffPart, position);
            //service에 맞긴 부분1
            if(service.register(staffLion)){
                System.out.println("등록 완료: " + staffName);
            } else {
                System.out.println("이미 등록됨");
            }
        }
    }
    public static void memberSearch(){
        //service에 맞긴 부분2
        List<Lllion> members = service.findMember();
        System.out.println("--전체 멤버 목록--");
        //리스트에 있는 명단을 하나씩 꺼냄
        for(Lllion member : members) {
            System.out.println("이름: " + member.getName() + " - " + member.getBatch() + "기");
        }
        System.out.println("총 " + members.size() + "명");
    }
    public static void nameSearch(){
        System.out.println("이름으로 검색");
        System.out.println("검색할 이름: ");
        String nameSearch = sc.nextLine();

        //service에 맞긴 부분3
        Lllion member = service.searchByName(nameSearch);
        if(member.getName().equals(nameSearch)){
            System.out.println(member.getInform());
            System.out.println("과제 제출 가능 여부: " + (member.isAvailable() ? "가능" : "불가능")); //삼항연산자(조건 ? 참일때 값 : 거짓일때 값)
        }
    }
}
