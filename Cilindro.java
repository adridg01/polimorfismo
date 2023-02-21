public class Cilindro extends Forma{
    private int radio;
    private int altura;
    public Cilindro (int radio, int altura){
        super ("Cilindro");
        this.radio=radio;
        this.altura=altura;
    }
    @Override
    public double area() {
        return super.area()+(Math.PI*Math.pow(radio,2*altura));
    }
    @Override
    public String toString() {
        return super.toString() + area();
    }
}