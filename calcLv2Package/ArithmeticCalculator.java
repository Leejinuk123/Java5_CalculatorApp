package calcLv2Package;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{
    public double a;
    public double b;
    public char op;
    AddOperator addOp = new AddOperator();
    SubtractOperator subOp = new SubtractOperator();
    MultiplyOperator mulOp = new MultiplyOperator();
    ModOperator new ModOperator()

    public ArithmeticCalculator() {
        super(new ArrayList<Double>());
    }

    @Override
    public Double calculate() {
        Operator operator;
        double result = 0;
        switch (op) {
            case '+':
                operator = addOp;
                break;
            case '-':
                operator = subOp;
                break;
            case '*':
                operator = ;
                break;
            case '%':
                operator = ;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("분모에 0이 입력될 수 없습니다.");
                    return (double) 0;
                }
                operator = new DivideOperator();
                break;
            default:
                System.out.println("Error");
                return (double) 0;
        }
        return operator.operate(a,b);
    }
}

class AddOperator implements Operator {
    @Override
    public double operate(double a, double b){
        return a+b;
    }
}
class SubtractOperator implements Operator {
    @Override
    public double operate(double a, double b){
        return a-b;
    }
}

class MultiplyOperator implements Operator {
    @Override
    public double operate(double a, double b){
        return a*b;
    }
}

class DivideOperator implements Operator {
    @Override
    public double operate(double a, double b){
        return a/b;
    }
}

class ModOperator implements Operator{
    @Override
    public double operate(double a, double b) {
        return a%b;
    }

}