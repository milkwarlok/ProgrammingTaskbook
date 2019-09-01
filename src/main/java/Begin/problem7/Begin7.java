package Begin.problem7;

/*
* Statement:
* Begin7°. Given the radius R of a circle, find the length L of the circumference and the area S of the circle: L = 2·π·R, S = π·R2.
* */
public class Begin7 {
    public static double circleArea(double r){
        if(r < 0.){
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }
        return Math.PI * (r*r);
    }

    public static double circleCircumference(double r){
        if(r < 0.){
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }
        return 2 * r * Math.PI;
    }
}

