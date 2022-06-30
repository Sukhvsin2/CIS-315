public class OctagonTest {
    public static void main(String[] args) {
        double side = 5;
        Octagon octagon1 = new Octagon(side);
        System.out.printf("Area of the octagon with side value %.2f is %.2f\n", side, octagon1.getArea());
        System.out.printf("Perimeter of the octagon with side value %.2f is %.2f\n", side, octagon1.getPerimeter());
        Octagon octagon2 = null;
        try {
             octagon2 = octagon1.clone();
        }catch (CloneNotSupportedException cnse){
            cnse.printStackTrace();
        }

        System.out.println("Comparison result between an octagon and its clone: " + octagon1.compareTo(octagon2));
        // System.out.println("Octagon 2 area = " + octagon2.getArea() + ", perimeter = " + octagon2.getPerimeter());


    }

}