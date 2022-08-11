public class CircleCalculator {
    public static void main(String[] args) {

        int CircleRadius = 12;

        // Calculating the diameter of a circle
        double CircleDiameter = 2*(CircleRadius);
        System.out.println("The radius of the circle is: "+ CircleDiameter);

        // Calculating the circumference of a  circle
        double CircleCircumference = Math.PI * 2*(CircleRadius);
        System.out.println("The circumference of a circle is: "+ CircleCircumference);

        // Calculating the area of a circle
        double CircleArea = CircleRadius * CircleRadius;
        System.out.println("The area of a circle is "+ CircleArea);




    }
}
