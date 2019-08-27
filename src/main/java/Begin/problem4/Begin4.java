package Begin.problem4;

public class Begin4 {
    public static double circleCircumference(double d){
        if(d < 0) {
            throw new IllegalArgumentException("Diameter must be greater than 0.");
        }
        return Math.PI * d;
    }
}
