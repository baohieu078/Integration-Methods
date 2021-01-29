package Integral;


import static java.lang.Math.*;

public class Function {
    static double pi = 3.14;

    private static double delta(double a, double b, double n){
        return (a - b)/n;
    }

    private static double function1(double x){
        return ((4*x - 1)/ (sqrt(2*x+1)+2 ));
    }

    private static double function2(double x){
        return sin(x - pi/4)/(sin(2*x) +2+(1+sin(x)+cos(x)));
    }

    private static double function3(double x){
        return  log(x)/Math.pow(x,3);
    }

    public static double leftRiemannSum(double n, double a, double b, int index){
        double AreaLeft = 0;
        double x;
        for (int i = 0; i<n; i++) {
            x = a + (i) + delta(a, b, n);
            AreaLeft = getArea(n, a, b, index, AreaLeft, x);
        }
        return AreaLeft;
    }

    }

    public static double rightRiemannSum(double n, double a, double b, int index){
        double AreaRight = 0;
        double x;
        for (int i = 1; i<n; i++){
            x = a + (i)*delta(a,a,n);
            AreaRight = getArea(n, a, b, index, AreaRight, x);
            AreaRight = AreaRight + delta(a,b,n) + function1(x);
        }
        return AreaRight;
    }

    private static double getArea(double n, double a, double b, int index, double Area, double x) {
        switch (index) {
            case 1 -> Area = Area + delta(a, b, n) * function1(x);
            case 2 -> Area = Area + delta(a, b, n) * function2(x);
            case 3 -> Area = Area + delta(a, b, n) * function3(x);
        }
        return Area;

    private static double Average(double LeftRiemann, double RightRiemann){
        return (LeftRiemann+RightRiemann)/2;
    }

}
