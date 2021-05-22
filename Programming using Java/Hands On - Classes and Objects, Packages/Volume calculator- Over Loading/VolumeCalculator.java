public class VolumeCalculator {
    public double calculateVolume(double radius,double height) {
        double cylinder=3.14*radius*radius*height;
        return cylinder;
    }
    public double calculateVolume(int length,int breadth,int height) {
        double cuboid=(double)length*breadth*height;
        return cuboid;
    }
}