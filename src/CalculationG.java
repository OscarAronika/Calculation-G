public class CalculationG {
    public static void main(String[] args) {
        double gravity=-9.81;
        double fallingTime =30;
        double initialVelocity=0.0;
        double finalVelocity;
        double initialPosition=0.0;
        double finalPosition=0.0;
        double time=0.5;
        System.out.println("The object's position after "+fallingTime+"seconds is "+finalPosition+"m.");
        //x(t)=0.5*at^2+vit+xi
        finalPosition=time*gravity*fallingTime*fallingTime+initialVelocity*fallingTime+initialPosition;
        System.out.println("finalPosition:"+finalPosition);
        //v(t)=at+vi
        finalVelocity=gravity*fallingTime+initialVelocity;
        System.out.println("finalVelocity area:"+finalVelocity);
        double num1=10;
        double num2=15;
        double multiplication=num1*num2;
        System.out.println("multiplication is:"+multiplication);
        double square=num2*num2;
        System.out.println("square is: "+square);
        double sum = num1+num2;
        System.out.println("sum is: "+sum);



    }
}