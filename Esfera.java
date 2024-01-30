public class  Esfera extends Forma{
    private double Radio;
    public Esfera(double Radio) {
        super("Esfera");
        this.Radio=Radio;
    }

    @Override
    public double Area() {
        return super.Area()+(4*Math.PI*Math.pow(Radio,2));
    }

    @Override
    public String toString() {
        return super.toString()+" " + Area();
    }
}
