public class  Esfera extends Forma{
    private double radio;
    public Esfera(double radio) {
        super("Esfera");
        this.radio=radio;
    }

    @Override
    public double area() {
        return super.area()+(4*Math.PI*Math.pow(radio,2));
    }

    @Override
    public String toString() {
        return super.toString()+" " + area();
    }
}
