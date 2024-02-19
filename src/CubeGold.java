public class CubeGold extends GoldShape{

    double side;

    public CubeGold( double side) {
        //  super(volume);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public CubeGold() {
    }

    @Override
    double getVolume() {
        return getSide()*getSide()*getSide();
    }
}