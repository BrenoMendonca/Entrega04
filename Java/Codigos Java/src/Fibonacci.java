public class Fibonacci{
    public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);
    int aux1 = 0;
    int aux2 = 1;
    int aux3;
    System.out.println("Digite quantos termos voce quer mostrar: ");
    aux1 = ler.nextInt();
    
    System.out.println(aux1);
    System.out.println(aux2);

    int contador = 3;
    
    while (contador <= num){
        aux3 = aux1 +aux2;
        System.out.println(aux3);
        aux1 = aux2;
        aux2 = aux3;
        contador +=1;
    };
}