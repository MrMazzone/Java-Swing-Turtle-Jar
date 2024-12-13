import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }

  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   * @param speed the milliseconds it takes for the turtle to move
   */
  public Turtle (int x, int y, Picture picture, int speed) 
  {
    // let the parent constructor handle it
    super(x,y,picture,speed);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }

  /** Constructor that takes the x and y, a model
   * display to draw it on, and the speed
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   * @param speed the milliseconds it takes for the turtle to move
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer, int speed) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer, speed);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }

  /** Constructor that takes the model display and speed
   * @param modelDisplay the thing that displays the model
   * @param speed the milliseconds it takes for the turtle to move
   */
  public Turtle (ModelDisplay modelDisplay, int speed) 
  {
    // let the parent constructor handle it
    super(modelDisplay, speed);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////


  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth,500);
    t1.forward();
    t1.turnLeft();
    t1.forward();
  }

} // this } is the end of class Turtle, put all new methods before this