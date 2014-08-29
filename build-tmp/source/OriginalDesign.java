import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int ySun = 80;
int skyBlue = 211;
int night = -50;

public void setup() {
 	size(400,400);
}
public void draw() {
	background(97, skyBlue, 242);
	sun();
	mountains();
	snowcaps();
	grass();
	shadows();
}
public void sun() {
	stroke(232, 221, 97);
    fill(255, 221, 0);
    ellipse(108, ySun-20, 75, 75);
}
public void mountains() {
	stroke(0, 0, 0);
    fill(84, 69, 46);
    triangle(200,250,290,60,370,250);
    triangle(160,250,230,110,300,250);
    triangle(270,250,350,130,430,250);
}
public void snowcaps() {
	fill(255, 255, 255);
    
    beginShape();
        vertex(259.5f,125);
        vertex(290,60);
        vertex(323.5f,140);
        vertex(315,160);
        vertex(300,140);
        vertex(280,170);
        vertex(262,135);
        vertex(256,155);
        vertex(252,140.5f);
        vertex(259.5f,125);
    endShape();
        
    beginShape();
        vertex(230,110);
        vertex(250,150);
        vertex(240,170);
        vertex(230,160);
        vertex(220,180);
        vertex(205.5f,160);
        vertex(230,110);
    endShape();
    
    beginShape();
        vertex(350,130);
        vertex(383,180);
        vertex(370,200);
        vertex(358,180);
        vertex(345,210);
        vertex(330,182);
        vertex(320,200);
        vertex(314,185);
        vertex(350,130);
    endShape();
}
public void grass() {
	noStroke();
    fill(34, 133, 19);
    rect(-5,250,500,200);
}
public void shadows() {
	fill(0, 0, 0, 200);
    stroke(0, 0, 0);
    
    beginShape();
        vertex(270,250);
        vertex(ySun+315,ySun+240);
        vertex(430,250);
    endShape();
    
    beginShape();
        vertex(200,250);
        vertex(ySun+305,ySun+310);
        vertex(350,250);
    endShape();
    
    beginShape();
        vertex(160,250);
        vertex(ySun+195,ySun+260);
        vertex(300,250);
    endShape();
    
    noStroke();
    fill(0, 0, 0, night);
    rect(0,0,400,400);
    
    ySun += 2;
    skyBlue -= 2;
    night += 2;
    
    if (ySun > 325) {
        ySun = 80;
        skyBlue = 211;
        night = -50;
    }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
