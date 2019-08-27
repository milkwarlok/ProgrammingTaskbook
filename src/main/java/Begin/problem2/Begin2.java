package Begin.problem2;
/*
* Statement:
* Begin2°. Given the side a of a square, find the area S of the square: S = a^2.
* */
public class Begin2 {
    public static double squareArea(double a){
        if(a < 0.){
            throw new IllegalArgumentException("Side must be greater than 0.");
        }
        return a*a;
    }
}
