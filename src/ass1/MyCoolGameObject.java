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

		    CircularGameObject circle = new CircularGameObject(this,0.5, white, black);

	  }
}
