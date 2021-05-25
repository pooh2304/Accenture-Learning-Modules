public class Circle extends Shape{
    private float radius;
    public void setRadius(float a){
        radius=a;
    }
    public float getRadius(){
        return radius;
    }
    public Circle(float c){
        radius=c;
    }
    public double calculateArea(){
        double area=0;
        area=(radius*radius*Math.PI);
        return area;
    }
}