abstract class GoldShape {

    double volume;
    abstract double getVolume();

    public GoldShape(double volume) {
        this.volume = volume;
    }
    public GoldShape() {
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPrice(){

        return getVolume()*250+1200;

    }

}
