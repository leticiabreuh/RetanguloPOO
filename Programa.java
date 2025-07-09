public class Programa{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Criando Retangulo
        Retangulo retangulo1 = new Retangulo();

        //Informações
        System.out.println("Altura: ");
        retangulo1.altura=scanner.nextDouble();

        System.out.println("Largura: ");
        retangulo1.largura=scanner.nextDouble();

        retangulo1.mensagem();

        scanner.close();
    }
}