public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle(1);
        System.out.println("the area of the circle of radius "
                + circle1.radius + "  is " + circle1.getArea());
        // Create a circle with radius 1
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());
        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());

    }

}
