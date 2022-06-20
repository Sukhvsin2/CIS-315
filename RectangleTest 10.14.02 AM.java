public class RectangleTest
{
    
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(40.0, 4.0);
		
		System.out.println("Before the change: ");
		
		System.out.printf("\nThe rectangle's width is  %.2f and its height is %.2f.\n", obj.getWidth(), obj.getHeight());
        System.out.printf("Its area is %.2f and its perimeter is %.2f.\n\n", obj.getArea(), obj.getPerimeter());
		
		obj.setWidth(35.90);
		obj.setHeight(3.50);
		System.out.println("After the change: ");
		
		System.out.printf("\nThe rectangle's width is  %.2f and its height is %.2f.\n", obj.getWidth(), obj.getHeight());
        System.out.printf("Its area is %.2f and its perimeter is %.2f.\n\n", obj.getArea(), obj.getPerimeter());
		
		
	}
}
