import java.util.Scanner;

public class Coding_Test01 {

//   Q1. 덧셈 연산을 수행하는 함수를 생성하고, 
//   두 정수를 입력 받아서 합의 결과값을 구현하는
//   자바 프로그램을 제작하시기 바랍니다.
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요==> ");
        int num1 = scan.nextInt();
        System.out.println("두 번째 정수를 입력하세요==> ");
        int num2 = scan.nextInt();
        
//        int result = num1 + num2;
//        System.out.println("두 정수의 합 = " + result); 
        
        int result = sum(num1, num2); //함수 만드는 법 
        System.out.println("두 정수의 합 = " + result);
}
        private static int sum(int num1, int num2) {
           int sum = 0;
           sum = num1+num2;
           return sum;
        }
}    