public class Cilindro extends Forma{
    private int Radio;
    private int Altura;
    public Cilindro (int Radio, int Altura){
        super ("Cilindro");
        this.Radio=Radio;
        this.Altura=Altura;
    }
    @Override
    public double Area() {
        return super.Area()+(Math.PI*Math.pow(Radio,2*Altura));
    }
    @Override
    public String toString() {
        return super.toString() + Area();
    }
}