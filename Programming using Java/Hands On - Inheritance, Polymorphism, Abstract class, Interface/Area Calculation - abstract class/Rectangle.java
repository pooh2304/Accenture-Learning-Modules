public class Rectangle extends Shape{
    private float length;
    private float breadth;
    public void setLength(float a){
        length=a;
    }
    public void setBreadth(float b){
        breadth=b;
    }
    public float getLength(){
        return length;
    }
    public float getBreadth(){
        return breadth;
    }
    public Rectangle(float c,float d){
        length=c;
        breadth=d;
    }
    public double calculateArea(){
        double area=0;
        area=(length*breadth);
        return area;
    }
}