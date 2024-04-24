package calcLv2Package;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Calculator {
    public ArrayList<Integer> resultList = new ArrayList<>();

    public Integer calculate(Scanner sc) {
        int result = 0;
        String command = "";
        do {
            System.out.println("첫 번째 양의 정수를 입력하세요.");
            int a = sc.nextInt();
            System.out.println("두 번째 양의 정수를 입력하세요.");
            int b = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요.");
            char op = sc.next().charAt(0);

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
                        return 0;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Error");
                    return 0;
            }

            System.out.println("결과: " + result);
            resultList.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? ( remove 입력 )");
            sc.nextLine();
            command = sc.nextLine();

            if (command.equals("remove")) resultList.remove(0);

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            command = sc.nextLine();

            if (command.equals("inquiry")) System.out.println("연산 결과: " + resultList);

            System.out.println("더 계산을 하겠습니까? (exit 입력 시 종료)");
            command = sc.nextLine();
        } while (!command.equals("exit"));

        return result;
    }
}
