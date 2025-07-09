public class Retangulo{
    public double altura;
    public double largura;

    public double area(){
        return altura * largura;
    }

    public double perimetro(){
        return 2*(altura+largura);
    }

    public double diagonal(){
        double d= Math.sqrt(altura*altura+largura*largura);
        return d;
    }

    public void mensagem(){
        System.out.println("Area: "+area());
         System.out.println("Perimetro: "+perimetro());
          System.out.println("Diagonal: "+diagonal());
    }

       



}