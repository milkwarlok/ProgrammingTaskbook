package Begin.problem5;

/*
* Statement:
* Begin5°. Given the edge a of a cube, find the volume V = a^3 and the surface area S = 6·a^2 of the cube.
* */
public class Begin5 {
    public static double cubeVolume(double a){
        if(a < 0.){
            throw new IllegalArgumentException("Side must be greater than 0.");
        }
        return a*a*a;
    }

    public static double cubeSideArea(double a){
        if(a < 0.){
            throw new IllegalArgumentException("Side must be greater than 0.");
        }
        return 6 * (a * a);
    }

}
