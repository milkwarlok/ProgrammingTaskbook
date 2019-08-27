package Begin.problem1;
/*
    Note:
    All input and output data are real numbers in tasks of this group.
 */

/*
* Statement:
* Begin1°. Given the side a of a square, find the perimeter P of the square: P = 4·a.
* */
public class Begin1 {
    public static double squarePerimeter(double a){
        if(a < 0.){
            throw new IllegalArgumentException("Side must be greater than 0.");
        }
        return 4. * a;
    }
}
