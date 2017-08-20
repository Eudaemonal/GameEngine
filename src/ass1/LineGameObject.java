package ass1;

import com.jogamp.opengl.GL2;

public class LineGameObject extends GameObject {
	private double[] myPoint1;
	private double[] myPoint2;
	private double[] myLineColour;
	
	//Create a LineGameObject from (0,0) to (1,0)
	public LineGameObject(GameObject parent, double[] lineColour){
		super(parent);
	    myPoint1 = new double[]{0,0};
	    myPoint2 = new double[]{1,0};
	    myLineColour = lineColour;
	}

	//Create a LineGameObject from (x1,y1) to (x2,y2)
	public LineGameObject(GameObject parent,  double x1, double y1,
	                                          double x2, double y2,
	                                          double[] lineColour) {
		super(parent);
	    myPoint1 = new double[]{x1,y1};
	    myPoint2 = new double[]{x2,y2};
	    myLineColour = lineColour;
	}
	
	
    /**
     * Get the point1
     * 
     * @return point1
     */	
	public double[] getPoint1() {
	    return myPoint1;
	}
	
    /**
     * Set the point1
     * 
     * @param point1
     */
	public void setPoint1(double[] point1) {
	    myPoint1 = point1;
	}
	
    /**
     * Get the point2
     * 
     * @return point2
     */	
	public double[] getPoint2() {
	    return myPoint2;
	}
	
    /**
     * Set the point2
     * 
     * @param point2
     */
	public void setPoint2(double[] point2) {
	    myPoint2 = point2;
	}
	
    /**
     * Get the linecolour.
     *
     * @return linecolour
     */
    public double[] getLineColour() {
      return myLineColour;
    }
    
    /**
     * Set the linecolour.
     *
     * @param lineColour
     */
    public void setLineColour(double[] lineColour) {
      myLineColour = lineColour;
    }
    
    @Override
    public void drawSelf(GL2 gl){
    	double[] lineColour = getLineColour();

        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_LINE);
        gl.glColor4d(lineColour[0], lineColour[1], lineColour[2], lineColour[3]);
        
        gl.glBegin(GL2.GL_LINES);
        double[] point1 = getPoint1();
        double[] point2 = getPoint2();
        
        gl.glVertex2d(point1[0], point1[1]);
        gl.glVertex2d(point2[0], point2[1]);
        gl.glEnd();
        
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
    	
    }
}
