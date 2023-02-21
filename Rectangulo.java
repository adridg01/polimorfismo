public class Rectangulo extends Forma {
    private double largo;
    private double ancho;
    public Rectangulo ( double largo, double ancho) {

        super("Rectangulo");
        this.ancho=ancho;
        this.largo=largo;
    }
    @Override
    public double area() {
        return super.area() + largo * ancho;
    }

    @Override
    public String toString() {
        return super.toString()+ area();
    }
}
