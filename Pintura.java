public class Pintura{
 double Cobertura;
public Pintura(double Cobertura){
 this.Cobertura=Cobertura;
}
public double getcobertura(Forma forma){

 return forma.Area()/Cobertura;
}
}