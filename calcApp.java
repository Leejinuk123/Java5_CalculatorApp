import java.util.*;

public class calcApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;
        int[] resultArr = new int[10];
        int cnt = 0;
        do{
            System.out.println("첫 번째 양의 정수를 입력하세요.");
            int a = sc.nextInt();
            System.out.println("두 번째 양의 정수를 입력하세요.");
            int b = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요.");
            char op = sc.next().charAt(0);
            int result = 0;

            switch (op){
                case '+':
                    result = a + b;
                    System.out.println("결과" + result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println("결과" + result);
                    break;
                case '*':
                    result = a * b;
                    System.out.println("결과" + result);
                    break;
                case '/':
                    if(b == 0) {
                        System.out.println("분모에 0이 입력될 수 없습니다.");
                        break;
                    } else{
                        result = a / b;
                        System.out.println("결과" + result);
                        break;
                    }
                default:
                    System.out.println("Error");
                    break;
            }

            System.out.println("더 계산을 하겠습니까? (exit 입력 시 종료)");
            sc.nextLine();
            str = sc.nextLine();
        } while(!str.equals("exit"));
    }
}
