package ass1;

import com.jogamp.opengl.GL2;

public class MyCoolGameObject extends GameObject{
	private double theta = 45;
	
	  public MyCoolGameObject(GameObject parent) {
	    super(parent);
	  }
	  
	  public MyCoolGameObject() {
	    super(GameObject.ROOT);
	  }
	  
	  public void drawSelf(GL2 gl) {
		    double[] black = {0,0,0,1};
		    double[] white = {1,1,1,1};
		    double[] grey90 = {0.9,0.9,0.9,1};
		    double[] grey80 = {0.8,0.8,0.8,1};
		    double[] grey70 = {0.7,0.7,0.7,1};
		    double[] grey60 = {0.6,0.6,0.6,1};
		    double[] grey50 = {0.5,0.5,0.5,1};
		    double[] grey40 = {0.4,0.4,0.4,1};
		    double[] grey30 = {0.3,0.3,0.3,1};
		    double[] grey20 = {0.2,0.2,0.2,1};
		    double[] grey10 = {0.1,0.1,0.1,1};
		    double[] blue = {0, 0.6, 0.8, 1};
		    
		    // Draw black background for animation
		    CircularGameObject backGround = new CircularGameObject(this, 102, black, black);
		    // Create main frame of the helicoptor
		    //PolygonalGameObject body = new PolygonalGameObject()
		    PolygonalGameObject mainFrame = new PolygonalGameObject(this,
		    	      new double[]{-7,50, -15,40, -15,-35, -12,-42, -10,-45, -5,-49, 0,-50, 5,-49, 10,-45, 12,-42, 15,-35, 15,40, 7,50},
		    	      grey70,
		    	      black);
		    
		    // Draw Engine
		    GameObject engine = new GameObject(mainFrame);
		    PolygonalGameObject hood = new PolygonalGameObject(engine,
		    	      new double[]{-10,50, -10,10, -5,2, -3.5,1, 0,0, 3.5,1, 5,2, 10,10, 10,50, 0,70},
		    	      grey60,
		    	      black);
		    PolygonalGameObject leftEngine = new PolygonalGameObject(engine, new double[]{10,12, 15,12, 16,20, 16,35, 15,40, 10,50, 9,35, 9,20},
		    		  grey50, black);
		    PolygonalGameObject rightEngine = new PolygonalGameObject(engine, new double[]{-10,12, -15,12, -16,20, -16,35, -15,40, -10,50, -9,35, -9,20},
		    		  grey50, black);
		    
		    engine.setPosition(0, -16);
		    
		    
		    // Draw window
		    GameObject window = new GameObject(mainFrame);
		    PolygonalGameObject midWindow = new PolygonalGameObject(window, new double[]{-3,0, 3,0, 3,9, -3,9},
		    		  blue, white);
		    PolygonalGameObject leftWindow = new PolygonalGameObject(window, new double[]{4,0, 12,2, 15,5, 14,12, 12,10, 4,9},
		    		  blue, white);
		    PolygonalGameObject rightWindow = new PolygonalGameObject(window, new double[]{-4,0, -12,2, -15,5, -14,12, -12,10, -4,9},
		    		  blue, white);
		    PolygonalGameObject leftUpperWindow = new PolygonalGameObject(window, new double[]{4,10, 12,11, 14,13, 15,16, 4,16},
		    		  blue, white);
		    PolygonalGameObject rightUpperWindow = new PolygonalGameObject(window, new double[]{-4,10, -12,11, -14,13, -15,16, -4,16},
		    		  blue, white);
		    window.setPosition(0,-35);
		    
		    
		    // Draw tail
		    PolygonalGameObject tail = new PolygonalGameObject(mainFrame,
		    	      new double[]{-2,135, -7,50,  7,50, 2,135},
		    	      grey70,
		    	      black);
		    // Draw tail wing
		    GameObject tailWing = new GameObject(tail);
		    PolygonalGameObject leftWing = new PolygonalGameObject(tailWing, new double[]{0,0, 24,0, 24,8, 0,12},
		    		  grey70, black);
		    PolygonalGameObject rightWing = new PolygonalGameObject(tailWing, new double[]{0,0, -24,0, -24,8, 0,12},
		    		  grey70, black);
		    PolygonalGameObject verticalWing = new PolygonalGameObject(tailWing, new double[]{0,0, 2,10, 0,30, -2,10},
		    		  grey60, black);
		    tailWing.setPosition(0, 116);
		    // Draw tail top
		    PolygonalGameObject tailTop = new PolygonalGameObject(tail, new double[]{2,50, 1,116, -1,116, -2,50},
		    		  grey60, black);
		    
		    
		    // Draw roter and blade
		    GameObject roter = new GameObject(mainFrame);
		    PolygonalGameObject bladeRoot1 = new PolygonalGameObject(roter, new double[]{0,0, 20,0, 20,2, 0,2},
		    		grey40, black);
		    PolygonalGameObject bladeFrame1 = new PolygonalGameObject(bladeRoot1, new double[]{10,0, 95,0, 95,5, 15,5, 10,2},
		    		grey40, black);
		    PolygonalGameObject bladeTip1 = new PolygonalGameObject(bladeFrame1, new double[]{95,0, 100,-3, 100,2, 95,5},
		    		grey40, black);
		    bladeRoot1.setRotation(0);
		    
		    PolygonalGameObject bladeRoot2 = new PolygonalGameObject(roter, new double[]{0,0, 20,0, 20,2, 0,2},
		    		grey40, black);
		    PolygonalGameObject bladeFrame2 = new PolygonalGameObject(bladeRoot2, new double[]{10,0, 95,0, 95,5, 15,5, 10,2},
		    		grey40, black);
		    PolygonalGameObject bladeTip2 = new PolygonalGameObject(bladeFrame2, new double[]{95,0, 100,-3, 100,2, 95,5},
		    		grey40, black);
		    bladeRoot2.setRotation(90);
		    
		    PolygonalGameObject bladeRoot3 = new PolygonalGameObject(roter, new double[]{0,0, 20,0, 20,2, 0,2},
		    		grey40, black);
		    PolygonalGameObject bladeFrame3 = new PolygonalGameObject(bladeRoot3, new double[]{10,0, 95,0, 95,5, 15,5, 10,2},
		    		grey40, black);
		    PolygonalGameObject bladeTip3 = new PolygonalGameObject(bladeFrame3, new double[]{95,0, 100,-3, 100,2, 95,5},
		    		grey40, black);
		    bladeRoot3.setRotation(180);
		    
		    PolygonalGameObject bladeRoot4 = new PolygonalGameObject(roter, new double[]{0,0, 20,0, 20,2, 0,2},
		    		grey40, black);
		    PolygonalGameObject bladeFrame4 = new PolygonalGameObject(bladeRoot4, new double[]{10,0, 95,0, 95,5, 15,5, 10,2},
		    		grey40, black);
		    PolygonalGameObject bladeTip4 = new PolygonalGameObject(bladeFrame4, new double[]{95,0, 100,-3, 100,2, 95,5},
		    		grey40, black);
		    bladeRoot4.setRotation(270);
		    CircularGameObject roterDisc = new CircularGameObject(roter, 5, grey70, black);
		   
		    roter.rotate(theta);
		    
		    
		    // Set scale to fit
		    this.setScale(0.005);
		    this.setPosition(0, 0);
	  }
	  
	  public void update(double dt) {
		  theta += 10;
		  theta = ((theta + 180.0) % 360.0 + 360.0) % 360.0 - 180.0;
	  }
}
