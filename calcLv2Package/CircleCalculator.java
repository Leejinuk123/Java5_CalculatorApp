package calcLv2Package;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    static final double PI = 3.14;

    public CircleCalculator() {
        super(new ArrayList<Double>());
    }

    @Override
    public Double calculate(double a,double b,char op) {
        return  a*b*PI;
    }
}
