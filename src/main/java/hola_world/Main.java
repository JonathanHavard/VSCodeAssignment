package hola_world;

import processing.core.*;

public class Main extends PApplet{
    public static void main(String[] args) {
        PApplet.main("hola_world.Main");
        //Prints a statement
        System.out.println("I FREAKING LOVE FROGS MAN! THEYR'E SO FREAKING COOOOOOL!!!!!:D");
    }

    public void settings(){
        //Changes the size of the screen
        size(1000, 1000);
    }
    public void setup(){
        //changes the Background color to a dark green
        background(0, 50, 25);
    }

    public void draw(){
        //Drawing function
        ellipse (width/2, height/2, width/2, height/2);
        triangle(130, 400, 270, 1000, 544, 500);
        square(100, 200, 300);
        quad(200, 30, 300, 700, 700, 800, 700, 0);
        line(0, 0, 1000, 1000);
    }
}