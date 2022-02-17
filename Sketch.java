import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial setup
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    // Green rectangle for grass
    fill(86, 125, 70);
    rect(0, 300, 400, 100);

    
    // Base square for house
    fill(255, 248, 220);
    rect(100, 100, 200, 200);

    // Triangle for Roof
    fill(170, 1, 20);
    triangle(100, 100, 300, 100, 200, 25);

    // Rectangle for door
    fill(196, 164, 132);
    rect(175, 225, 50, 75);

    // Squares for windows
    fill(22, 184, 243);
    
    rect(120, 140, 60, 60);
    rect(220, 140, 60, 60);

    // Yellow circle for sun
    fill(255, 233, 0);
    ellipse(50, 50, 50, 50);

    // Window design
    line(150, 140, 150, 200);
    line(120, 170, 180, 170);

    line(250, 140, 250, 200);
    line(220, 170, 280, 170);

    // Door design
    fill(0, 0, 0);
    ellipse(220, 260, 5, 5);
    
  }
  
  // define other methods down here.
}