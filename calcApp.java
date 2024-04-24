import java.util.*;


public class calcApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        ArrayList<Integer> resultArr = new ArrayList<>();
        int cnt = 0;
        do {
            int result = calculate(sc);
            resultArr.add(result);
            System.out.println(resultArr);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? ( remove 입력 )");
            sc.nextLine();
            str = sc.nextLine();

            if(str.equals("remove")) resultArr.remove(0);

            System.out.println("더 계산을 하겠습니까? (exit 입력 시 종료)");
            str = sc.nextLine();
        } while (!str.equals("exit"));
    }

    public static int calculate(Scanner sc) {
        System.out.println("첫 번째 양의 정수를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("두 번째 양의 정수를 입력하세요.");
        int b = sc.nextInt();
        System.out.println("사칙연산 기호를 입력하세요.");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("분모에 0이 입력될 수 없습니다.");
                    break;
                }
                result = a / b;
                break;
            default:
                System.out.println("Error");
                return 0;
        }

        System.out.println("결과: " + result);
        return result;
    }
}
