import java.lang.Math;
import java.math.BigDecimal; 


public class Planet {
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	public Planet(double xP, double yP, double xV,
              double yV, double m, String img){
		this.xxPos = xP;
		this.yyPos = yP;
		this.xxVel = xV;
		this.yyVel = yV;
		this.mass = m;
		this.imgFileName = img;
	}

	public Planet(Planet p){
		this.xxPos = p.xxPos;
		this.yyPos = p.xxPos;
		this.xxVel = p.xxVel;
		this.yyVel = p.yyVel;
		this.mass = p.mass;
		this.imgFileName = p.imgFileName;
	}

	public double calcDistance(Planet p){
		double dx = this.xxPos - p.xxPos;
		double dy = this.yyPos - p.yyPos;
		double r_squre = (dx * dx) + (dy * dy);
		double r = Math.sqrt(r_squre);
		return r;
	}

	public double calcForceExertedBy(Planet p){
		double r = this.calcDistance(p);
	  	double G = 6.67E-11;
		double F = (G * this.mass * p.mass)/(r*r);
		return F;
	}

	public double calcForceExertedByX(Planet p){
		double F = this.calcForceExertedBy(p);
		double Fx = (F * (p.xxPos - this.xxPos))/this.calcDistance(p);
		return Fx;
	}

	public double calcForceExertedByY(Planet p){
		double F = this.calcForceExertedBy(p);
		double Fy = (F * (p.yyPos - this.yyPos))/this.calcDistance(p);
		return Fy;
	}

	public double calcNetForceExertedByX(Planet[] allPlanets){
		double Fx = 0;
		for( int i = 0; i < allPlanets.length; i++){
			Fx += this.calcForceExertedByX(allPlanets[i]);
		}
		return Fx;
	}

	public double calcNetForceExertedByY(Planet[] allPlanets){
		double Fy = 0;
		for( int i = 0; i < allPlanets.length; i++){
			Fy += this.calcForceExertedByY(allPlanets[i]);
		}
		return Fy;
	}

	public void update(double dt, double fX, double fY){
		double aNetX = fX / mass;
		double aNetY = fY / mass;
		xxVel = xxVel + dt * aNetX;
		yyVel = yyVel + dt * aNetY;
		xxPos = xxPos + dt * xxVel;
		yyPos = yyPos + dt * yyVel;
	}

	public void draw(){
		StdDraw.picture(xxPos, yyPos, "./images/" + imgFileName);

	}
	
}
