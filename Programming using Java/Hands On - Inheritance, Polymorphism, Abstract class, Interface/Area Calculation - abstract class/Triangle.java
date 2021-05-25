public class Triangle extends Shape{
    private float base;
    private float height;
    public void setBase(float a){
        base=a;
    }
    public void setHeight(float b){
        height=b;
    }
    public float getBase(){
        return base;
    }
    public float getHeight(){
        return height;
    }
    public Triangle(float c,float d){
        base=c;
        height=d;
    }
    public double calculateArea(){
        double area=0;
        area=(0.5*base*height);
        return area;
    }
}