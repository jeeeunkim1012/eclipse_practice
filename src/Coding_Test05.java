import java.util.Scanner;

// 5층 건물의 엘리베이터안이라고 가정했을때, 1층 식당, 2층 치과,
// 3층 학원, 4층 회사, 5층 스터디 카페를 가기 위해, 건물의 층 번호를
// 정수값으로 입력 받아서 누르면, 그 층이 어떤 곳인지 알려주는
// 자바 프로그램을 제작하시기 바랍니다. 이때, switch-case문을 활용하고, 
// 5를 입력했을 경우, "5층 스터디 카페 입니다!" 라고 화면으로 출력이
// 되게 하시기 바랍니다.
// 다음은 button(층별 버튼)과 comment(층별 선택 안내 메시지) 변수의
// 입력 조건 예시 입니다.
// int button = 5;
// String comment;

public class Coding_Test05 {
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("층수를 입력해주세요===>");
		int button  = scan.nextInt();
		String comment = "";
		
		switch (button) {
		case 1:
			comment = "선택하신 1층은 식당입니다.";
			break;
		case 2:
			comment = "선택하신 2층은 치과입니다.";
			break;
		case 3:
			comment = "선택하신 3층은 학원입니다.";
			break;
		case 4:
			comment = "선택하신 4층은 회사입니다.";
			break;
			
		default:
			comment = "선택하신 5층은 스터디카페입니다.";
			break;
		}
		 



	}
}
