package calcLv2Package;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Scanner sc = new Scanner(System.in);
        String command = "";
        int a,b;
        char op;
        int result = 0;

        do {
            System.out.println("첫 번째 양의 정수를 입력하세요.");
            a = sc.nextInt();
            System.out.println("두 번째 양의 정수를 입력하세요.");
            b = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요.");
            op = sc.next().charAt(0);

            result = calc1.calculate(a,b,op);

            System.out.println("결과: " + result);
            calc1.setResultList(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? ( remove 입력 )");
            sc.nextLine();
            command = sc.nextLine();

            if (command.equals("remove")) calc1.removeResult();

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            command = sc.nextLine();

            if (command.equals("inquiry")) {
                System.out.println("연산 결과: " + calc1.getResultList());
            }

            System.out.println("더 계산을 하겠습니까? (exit 입력 시 종료)");
            command = sc.nextLine();
        } while (!command.equals("exit"));

    }
}
