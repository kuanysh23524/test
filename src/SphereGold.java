public class SphereGold extends GoldShape{


    double radius;

    public SphereGold(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public SphereGold() {
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return   (4/3) * 3.14 * getRadius()*getRadius()*getRadius();


    }

}
