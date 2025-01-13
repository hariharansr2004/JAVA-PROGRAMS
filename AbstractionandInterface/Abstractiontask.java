

package AbstractionandInterface;

/*
 * Abstract class is a restricted class that cannot be used to create objects.
 * It can be only accessed and inherited from another class
 * abstract class must at-least contains one abstract method
 * abstract method does not have any body
 * we can leave abstract method without defining it but we can't leave normal methods like that 
 * we should define the normal method and we can also use normal method in a abstract class
 * we can indirectly create objects for abstract method by extending it
 * in interface only we write methods inside  
 */


abstract class Shape {
    public void shp() {
        System.out.println("Calculating area and perimeter");
    }

    public abstract void calcarea();

    public abstract void calcperim();
}

class Rect extends Shape {
    public int l=5 ; 
    public int b =8; 

    public void calcarea() {
        int area = l * b;
        System.out.println("Rectangle Area: " + area);
    }

    public void calcperim() {
        int perimeter = 2 * (l + b);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Triangle extends Shape {
    public int b = 4; 
    public int h = 3; 
    public int a = 3, bp = 4, c = 5; 

    public void calcarea() {
        int area = (int) (0.5 * b * h);
        System.out.println("Triangle Area: " + area);
    }

    public void calcperim() {
        int perimeter = a + bp + c;
        System.out.println("Triangle Perimeter: " + perimeter);
    }
}

class Circle extends Shape {
    public int rad = 7;

    public void calcarea() {
        double area = Math.PI * rad * rad;
        System.out.println("Circle Area: " + area);
    }

    public void calcperim() {
        double perimeter = 2 * Math.PI * rad;
        System.out.println("Circle Perimeter: " + perimeter);
    }
}

public class Abstractiontask {
    public static void main(String[] args) {
    	//Shape obj= new Shape(); 
//above we can see the error that can't instantiate the type shape because we can't create objects for abstract class
// so to access the method in abstract class we can indirectly able to done by extending it
        Rect rect = new Rect();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        rect.shp();//accessing the method indirectly by extending the abstract class
        rect.calcarea();
        rect.calcperim();
        System.out.println("------------------------");
        

        triangle.calcarea();
        triangle.calcperim();
        System.out.println("------------------------");

        circle.calcarea();
        circle.calcperim();
    }

}








