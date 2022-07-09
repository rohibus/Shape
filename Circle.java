public class Circle extends Shape
{
	double radius;

	public Circle(double radius, String color)
	{
		super(color);
		this.radius = radius;
	}

	@Override
	public double calculateArea()
	{
		return 3.142 * radius * radius;
	}

	@Override
	public double calculatePerimeter()
	{
		return 2 * 3.142 * radius;
	}

	@Override
	public void display()
	{
		System.out.println("this is a Circle shape with color " + super.color);
	}
}