package calcLv2Package;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    public double radius;
    static final double PI = 3.14;

    public CircleCalculator() {
        super(new ArrayList<Double>());
    }

    @Override
    public Double calculate() {
        return  radius*radius*PI;
    }
}
