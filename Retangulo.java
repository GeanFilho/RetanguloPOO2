public class Retangulo{

    //aqui eu coloco os atributos
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double Area(){
        return largura * altura;
    }

    public double Perimetro(){
        return (2*(largura+altura));
    }

    public void MostrarInformacao(){
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + Area());
        System.out.println("Perimetro: " + (Perimetro()));
    }



}