package Begin.problem3;
/*
* Statement:
* Begin3°. The sides a and b of a rectangle are given. Find the area S = a·b and the perimeter P = 2·(a + b) of the rectangle.
* */
public class Begin3 {
    public static double rectArea(double a, double b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException(String.format("Sides must be greater than 0. [a = %f, b = %f].", a, b));
        }
        return a * b;
    }


    public static double rectPerimeter(double a, double b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException(String.format("Sides must be greater than 0. [a = %f, b = %f].", a, b));
        }
        return 2 * (a + b);
    }


}
