package calcLv2Package;

import java.util.ArrayList;

public abstract class Calculator {
    private final ArrayList<Double> resultList;

    public Calculator(ArrayList<Double> resultList){
        this.resultList = resultList;
    }

    public ArrayList<Double> getResultList() {
        return this.resultList;
    }

    public void setResultList(double result) {
        this.resultList.add(result);
    }

    public void removeResult() {
        this.resultList.remove(0);
    }

    public void inquiryResults(){
        System.out.println("연산결과: " + getResultList());
    }

    public abstract Double calculate(double a,double b,char op);
}
