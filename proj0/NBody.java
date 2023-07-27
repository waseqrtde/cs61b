import java.util.ArrayList;

public class NBody{

    public static double readRadius(String filename){
        In in = new In(filename);
        int num_of_planets = in.readInt();
		double radius = in.readDouble();
        return radius;
    } 

    public static Planet[] readPlanets(String filename){
        In in = new In(filename);
        int num_of_planets = in.readInt();
		double radius = in.readDouble();

        Planet[] arrayPlanets = new Planet[num_of_planets];
        
        for(int i = 0; i < num_of_planets; i ++ ){    
            Planet planet_i = new Planet(in.readDouble(), in.readDouble(),in.readDouble(),
                                        in.readDouble(),in.readDouble(), in.readString()); 
            arrayPlanets[i] = planet_i;
        }

        return arrayPlanets;
    } 

    public static void main(String[] args){
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        double radius = NBody.readRadius(filename);
        Planet[] arrayPlanets = NBody.readPlanets(filename);

        StdDraw.picture(0, 0, "images/starfield.jpg");

        for(int i = 0, j = arrayPlanets.length; i < j; i++){
            arrayPlanets[i].draw();
        }
        
    }

}