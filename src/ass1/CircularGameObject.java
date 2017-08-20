package ass1;

import com.jogamp.opengl.GL2;

public class CircularGameObject extends GameObject {
	// Circle
	private double[] myCentre;
	private double myRadius;
	private double[] myFillColour;
	private double[] myLineColour;
	
    /**
     * Create a CircularGameObject with centre 0,0 and radius 1
     *
     * @param parent The parent in the scene tree
     * @param points A list of points defining the polygon
     * @param fillColour The fill colour in [r, g, b, a] form
     * @param lineColour The outlien colour in [r, g, b, a] form
     */
	public CircularGameObject(GameObject parent, double[] fillColour,
	                                             double[] lineColour){
		super(parent);
		myRadius = 1.0;
		myCentre = new double[]{0,0};
		myFillColour = fillColour;
		myLineColour = lineColour;
		
		
	}

    /**
     * Create a CircularGameObject with centre 0,0 and a given radius
     *
     * @param parent The parent in the scene tree
     * @param radius the radius of the CircularGameObject
     * @param fillColour The fill colour in [r, g, b, a] form
     * @param lineColour The outline colour in [r, g, b, a] form
     */
	public CircularGameObject(GameObject parent, double radius,double[] fillColour,
	                                                           double[] lineColour){
		super(parent);
		myRadius = radius;
		myCentre = new double[]{0,0};
		myFillColour = fillColour;
		myLineColour = lineColour;
		
	}
	
    /**
     * Get the radius
     * 
     * @return radius
     */
    public double getRadius() {        
        return myRadius;
    }
    
    
    /**
     * Set the radius
     * 
     * @param radius
     */
    public void setRadius(double radius) {
        myRadius = radius;
    }

    /**
     * Get the centre
     * 
     * @return centre
     */
    public double[] getCentre() {        
        return myCentre;
    }
    
    
    /**
     * Set the centre
     * 
     * @param centre
     */
    public void setRadius(double[] centre) {
        myCentre = centre;
    }
    
    /**
     * Get the fillcolour
     *
     * @return fillcolour
     */
    public double[] getFillColour() {
    	return myFillColour;
    }
    
    /**
     * Set the fillcolour.
     *
     * @param fillColour The fill colour in [r, g, b, a] form
     */
    public void setFillColour(double[] fillColour) {
    	myFillColour = fillColour;
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
    
    
    /**
     * Draw a Circle
     *
     */
    @Override
    public void drawSelf(GL2 gl){
    	double radius = getRadius();
    	double[] centre = getCentre();
    	double[] fillColour = getFillColour();
    	double[] lineColour = getLineColour();
    	double numVertices = 32;

    	//draw fillColor
    	gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
        gl.glColor4d(fillColour[0], fillColour[1], fillColour[2], fillColour[3]);
        gl.glBegin(GL2.GL_POLYGON);
        {        	
            double angle = 0;
            double angleIncrement = 2*Math.PI/numVertices;
            for(int i=0; i <= numVertices; i++){
            	angle = i* angleIncrement;
            	double x = centre[0] + radius * Math.cos(angle);
            	double y = centre[1] + radius * Math.sin(angle);
            
            	gl.glVertex2d(x, y);
            }
        }
        gl.glEnd();
        
    	//draw lineColor
    	gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_LINE);
        gl.glColor4d(lineColour[0], lineColour[1], lineColour[2], lineColour[3]);
        gl.glBegin(GL2.GL_POLYGON);
        {        	
            double angle = 0;
            double angleIncrement = 2*Math.PI/numVertices;
            for(int i=0; i <= numVertices; i++){
            	angle = i* angleIncrement;
            	double x = centre[0] + radius * Math.cos(angle);
            	double y = centre[1] + radius * Math.sin(angle);
            
            	gl.glVertex2d(x, y);
            }
        }
        gl.glEnd();
        gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
    }
	                            
}
