package Begin.problem6;
/*
* Statement:
* Begin6°. The edges a, b, c of a right parallelepiped are given. Find the volume V = a·b·c and the surface area S = 2·(a·b + b·c + a·c) of the right parallelepiped.
* */
public class Begin6 {
    public static double parallelepipedVolume(double a, double b, double c){
        if(a < 0 || b < 0 || c < 0){
            throw new IllegalArgumentException(String.format("Sides must be greater than 0. [a = %f, b = %f, c = %f].", a, b, c));
        }
        return a * b * c;
    }

    public static double parallelepipedSurfaceArea(double a, double b, double c){
        if(a < 0 || b < 0 || c < 0){
            throw new IllegalArgumentException(String.format("Sides must be greater than 0. [a = %f, b = %f, c = %f].", a, b, c));
        }
        return 2 * ( a * b + b * c + c * a);
    }
}
