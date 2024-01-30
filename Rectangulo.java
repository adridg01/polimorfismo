public class Rectangulo extends Forma {
    private double Largo;
    private double Ancho;
    public Rectangulo ( double Largo, double Ancho) {

        super("Rectangulo");
        this.Ancho=Ancho;
        this.Largo=Largo;
    }
    @Override
    public double Area() {
        return super.Area() + Largo * Ancho;
    }

    @Override
    public String toString() {
        return super.toString()+ Area();
    }
}
