package todayis;
// static method - use the name of the class
// static method doesn't belong to the object
//
public class Cal {

    public double add(double x, double y){

        return x + y;
    }

    public double subtract(double x, double y){
        return y-x;
    }

    public double divide (double x, double y) {
        return 0.0;
    }

    public double multiply (double x, double y) {
        return x*y;
    }

    public double exponent (double x) {
        return x*x;
    }

}

// Red - when you write code, it suppose to fail
// Green
// Refactor -- modifty the code