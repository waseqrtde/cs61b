public class Planet{
    /*declare variable type: all instance variables */
    double xxPos;
    double yyPos;
    double xxVel;
    double yyVel;
    double mass;
    String imgFileName;

    public static final double gravityConstant = 6.67e-11;

    /* first class constructor: passing attributes directly */
    public Planet(double xP, double yP, double xV,
        double yV, double m, String img){
        this.xxPos = xP;
        this.yyPos = yP;
        this.xxVel = xV;
        this.yyVel = yV;
        this.mass = m;
        this.imgFileName = img;
                }
    /* second constructor: initialize an identical planet that is taken in  */             
    public Planet(Planet p){
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }

    /* Define the calcDistance method which returns the distance between the planet passed in and this */
    public double calcDistance(Planet rocinante){
        double dx = this.xxPos - rocinante.xxPos;
        double dy = this.yyPos - rocinante.yyPos;
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist;
    }

    public double calcForceExertedBy(Planet rocinante){
        double force = gravityConstant * this.mass * rocinante.mass / (this.calcDistance(rocinante) * this.calcDistance(rocinante));
        return force;
    }

    public double calcForceExertedByX(Planet rocinante){
        double dx = - this.xxPos + rocinante.xxPos;
        double cosine = dx / this.calcDistance(rocinante);
        double forceX = this.calcForceExertedBy(rocinante) * cosine;
        return forceX;
    }

    public double calcForceExertedByY(Planet rocinante){
        double dy = - this.yyPos + rocinante.yyPos;
        double sine = dy / this.calcDistance(rocinante);
        double forceY = this.calcForceExertedBy(rocinante) * sine;
        return forceY;
    }

    public double calcNetForceExertedByX(Planet[] allPlanets){
        double sumX = 0;
        for (int i = 0; i < allPlanets.length; i+=1){
            if (!this.equals(allPlanets[i])){
                sumX = sumX + this.calcForceExertedByX(allPlanets[i]);
            }
        }
        return sumX;
    }

    public double calcNetForceExertedByY(Planet[] allPlanets){
        double sumY = 0;
        for (int i = 0; i < allPlanets.length; i+=1){
            if (!this.equals(allPlanets[i])){
                sumY = sumY + this.calcForceExertedByY(allPlanets[i]);
            }
        }
        return sumY;
    }

    public void update(double dt, double fX, double fY){
        double a_x = fX / this.mass;
        double a_y = fY / this.mass;
        this.xxVel = this.xxVel + dt * a_x;
        this.yyVel = this.yyVel + dt * a_y;
        this.xxPos = this.xxPos + this.xxVel * dt;
        this.yyPos = this.yyPos + this.yyVel * dt;
    }

    public void draw(){
        StdDraw.picture(xxPos, yyPos, "images/" + imgFileName);
    }
}