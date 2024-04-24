package calcLv2Package;

import java.util.ArrayList;

public class Calculator {
    private final ArrayList<Integer> resultList = new ArrayList<>();

    public ArrayList<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(int result) {
        resultList.add(result);
    }

    public void removeResult(){
        System.out.println("정상적으로 삭제했습니다.");
        this.resultList.remove(0);
    }

    public Integer calculate(int a, int b, char op) {
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
                        return 0;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Error");
                    return 0;
            }

        return result;
    }
}
