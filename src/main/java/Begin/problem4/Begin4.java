package Begin.problem4;

/*
* Statement:
* Begin4°. Given the diameter d of a circle, find the length L of the circle: L = π·d. Use 3.14 for a value of π
* */
public class Begin4 {
    public static double circleCircumference(double d){
        if(d < 0) {
            throw new IllegalArgumentException("Diameter must be greater than 0.");
        }
        return Math.PI * d;
    }
}
