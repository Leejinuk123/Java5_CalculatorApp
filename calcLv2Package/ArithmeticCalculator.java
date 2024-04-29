package calcLv2Package;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{

    public ArithmeticCalculator() {
        super(new ArrayList<Double>());
    }

    @Override
    public Double calculate(double a,double b,char op) throws ArithmeticException{
        Operator operator;
        double result = 0;
        for(Operation operation : Operation.values()){
            if(operation.getOp() == op && '/' != op){
                return operation.operate(a,b);
            } else if(operation.getOp() == op && '/' == op){
                if (b == 0) {
                    throw new ArithmeticException("분모에 0이 입력될 수 없습니다.");
                } else if (b != 0){
                    return operation.operate(a,b);
                }
            }
        }
        throw new ArithmeticException("연산자를 잘못 입력 했습니다.");
    }
}

