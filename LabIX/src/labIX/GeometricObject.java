package labIX;

import java.lang.Comparable;

public abstract class GeometricObject implements Comparable{

	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;

	  /** Construct a default geometric object */
	  protected GeometricObject() {
	    dateCreated = new java.util.Date();
	  }

	  /** Construct a geometric object with color and filled value */
	  protected GeometricObject(String color, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.color = color;
	    this.filled = filled;
	  }

	  /** Return color */
	  public String getColor() {
	    return color;
	  }

	  /** Set a new color */
	  public void setColor(String color) {
	    this.color = color;
	  }

	  /** Return filled. Since filled is boolean,
	   *  the get method is named isFilled */
	  public boolean isFilled() {
	    return filled;
	  }

	  /** Set a new filled */
	  public void setFilled(boolean filled) {
	    this.filled = filled;
	  }

	  /** Get dateCreated */
	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }

	  /** Return a string representation of this object */
	  public String toString() {
	    return "created on " + dateCreated + "\ncolor: " + color +
	      " and filled: " + filled;
	  }
	  
	  /** Abstract method getRadius */
	  public abstract double getRadius();
	  
	  /** Abstract method getArea */
	  public abstract double getArea();

	  /** Abstract method getPerimeter */
	  public abstract double getPerimeter();
	
	  public int compare(Object one) {
		  if(getArea() > ((GeometricObject)one).getArea()) {
			  return 1;
		  }
		  else if(getArea()<((GeometricObject)one).getArea()){
			  return -1;
		  }
		  else {
			  return 0;
		  }
		  
	  }
	  
	  public static Comparable max(Comparable object1, Comparable object2) {
		  if(object1.compareTo(object2)>0) {
			  return object1;
		  }
		  else {
			  return object2;
		  }
	  }
}
