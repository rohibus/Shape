import java.util.*;

public class Shape
{
	String color;

	public Shape()
	{}

	public Shape(String color)
	{
		this.color = color;
	}

	public double calculateArea()
	{
		return 0;
	}

	public double calculatePerimeter()
	{
		return 0;
	}

	public void display()
	{
		System.out.println("this is a shape with color " + color);
	}

	/*public static void main(String[] args)
	{
		Shape s = new Shape();
		s.Display();
		s = new Shape("Red");
		s.Display();
	}*/
}