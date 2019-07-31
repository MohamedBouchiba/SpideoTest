public class CakeType {

    private final int weight;
    private final int value;
    private double ratio;

    CakeType(int weight, int value) {
        this.weight = weight;
        this.value  = value;
        this.ratio = value/weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }


    public double getRatio() {
        return ratio;
    }


    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "CakeType{" +
                "weight=" + weight +
                ", value=" + value +
                ", ratio=" + ratio +
                '}';
    }
}