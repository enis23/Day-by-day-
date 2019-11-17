package day32.task;

public class Rectangle{  // Create class Rectangle
    // add attributes,
    // add methods: getPerimeter => (a+b+a+b)
    // getArea => (a*b)

    // in other class print those perimeter and area
public int x;
public int y;

public int getPerimeter (int x,int y) {
    int Perimeter = x + y + x + y;
    return Perimeter;
}
public int Getarea(int x,int y) {
    int area = x * y;
    return area;

}

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        System.out.println(r.getPerimeter(3,4));
        System.out.println(r.Getarea(3,4));
    }



    }
