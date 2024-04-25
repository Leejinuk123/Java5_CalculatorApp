package calcLv2Package;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calc1 = new ArithmeticCalculator();
        CircleCalculator calc2 = new CircleCalculator();

        Scanner sc = new Scanner(System.in);

        String command = "";
        double result = 0;

        do {
            System.out.println("원의 너비 계산기: circle 입력");
            System.out.println("사칙 연산 계산기: arith 입력");
            command = sc.next();

            if (command.equals("circle")) {
                System.out.println("반지름 길이를 입력해주세요.");
                calc2.radius = sc.nextInt();
                result = calc2.calculate();
                System.out.println("원의 너비: " + result);
                calc2.setResultList(result);
                calc2.inquiryResults();
            } else if (command.equals("arith")) {
                System.out.println("첫 번째 양의 정수를 입력하세요.");
                calc1.a = sc.nextDouble();
                System.out.println("두 번째 양의 정수를 입력하세요.");
                calc1.b = sc.nextDouble();
                System.out.println("사칙연산 기호를 입력하세요.");
                calc1.op = sc.next().charAt(0);

                result = calc1.calculate();
                System.out.println("결과: " + result);
                calc1.setResultList(result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? ( remove 입력 )");
                command = sc.next();
                if (command.equals("remove")) calc1.removeResult();

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                command = sc.next();
                if (command.equals("inquiry")) calc1.inquiryResults();

            }

            System.out.println("더 계산을 하겠습니까? (exit 입력 시 종료)");
            command = sc.next();

        } while (!command.equals("exit"));

    }
}
