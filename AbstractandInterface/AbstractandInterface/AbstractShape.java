package AbstractandInterface;

public abstract class AbstractShape implements Shape {
	
	String coloroftheshape;
	
	public AbstractShape(String cshape ) {
		this.coloroftheshape = cshape;
		
	}
	

	public abstract double area ();;
	public abstract double perimeter();

}
