package ass1;

public class MyCoolGameObject extends GameObject{
	public MyCoolGameObject(GameObject parent) {
	    super(parent);
	    drawMyCoolGameObject();
	  }
	  
	  public MyCoolGameObject() {
	    super(GameObject.ROOT);
	    drawMyCoolGameObject();
	  }
	  
	  private void drawMyCoolGameObject() {
		    double[] black = {0,0,0,1};
		    double[] white = {1,1,1,1};
		    double[] grey = {0.7,0.7,0.7,1};
		    double[] blue = {0, 0.6, 0.8, 1};
		    
		    // Create main frame of the helicoptor
		    //PolygonalGameObject body = new PolygonalGameObject()
		    PolygonalGameObject mainFrame = new PolygonalGameObject(this,
		    	      new double[]{-7,50, -15,40, -15,-35, -10,-45, 0,-50, 10,-45, 15,-35, 15,40, 7,50},
		    	      blue,
		    	      blue);
		    
		    // Draw roter and blade
		    GameObject roter = new GameObject(mainFrame);
		    PolygonalGameObject blade1 = new PolygonalGameObject(roter, new double[]{0,0, 95,0, 95,5, 5,5},
		    		grey, white);
		    PolygonalGameObject bladeTip1 = new PolygonalGameObject(blade1, new double[]{95,0, 100,3, 100,8, 95,5},
		    		grey, white);
		    blade1.setRotation(0);
		    
		    PolygonalGameObject blade2 = new PolygonalGameObject(roter, new double[]{0,0, 95,0, 95,5, 5,5},
		    		grey, white);
		    PolygonalGameObject bladeTip2 = new PolygonalGameObject(blade2, new double[]{95,0, 100,3, 100,8, 95,5},
		    		grey, white);
		    blade2.setRotation(90);
		    
		    PolygonalGameObject blade3 = new PolygonalGameObject(roter, new double[]{0,0, 95,0, 95,5, 5,5},
		    		grey, white);
		    PolygonalGameObject bladeTip3 = new PolygonalGameObject(blade3, new double[]{95,0, 100,3, 100,8, 95,5},
		    		grey, white);
		    blade3.setRotation(180);	
		    
		    PolygonalGameObject blade4 = new PolygonalGameObject(roter, new double[]{0,0, 95,0, 95,5, 5,5},
		    		grey, white);
		    PolygonalGameObject bladeTip4 = new PolygonalGameObject(blade4, new double[]{95,0, 100,3, 100,8, 95,5},
		    		grey, white);
		    blade4.setRotation(270);
		    
		    roter.rotate(45);
		    
		    // Draw tail
		    PolygonalGameObject tail = new PolygonalGameObject(mainFrame,
		    	      new double[]{-2,135, -7,50,  7,50, 2,135},
		    	      blue,
		    	      blue);
		    
		    // Draw tail wing
		    GameObject tailWing = new GameObject(tail);
		    PolygonalGameObject leftWing = new PolygonalGameObject(tailWing, new double[]{0,0, 24,0, 24,8, 0,12},
		    		  black, white);
		    leftWing.setPosition(0, 116);
		    PolygonalGameObject rightWing = new PolygonalGameObject(tailWing, new double[]{0,0, -24,0, -24,8, 0,12},
		    		  black, white);
		    rightWing.setPosition(0, 116);
		    
		    

		    
		    // Set scale to fit
		    this.setScale(0.005);
		    this.setPosition(0, 0.2);

	  }
}
