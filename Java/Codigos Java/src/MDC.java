public class MDC {
    public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);
    int x,y,aux;
    
    System.out.println(" Digite o primeiro numero desejado");
    x = ler.nextInt();
    System.out.println(" Digite o segundo numero desejado");
    y = ler.nextInt();
    
    if( x > y){
        aux = x;
        x = y;
        y = aux;
    }
    for(int i = x; i > 1 && !(x%i==0 && y%i==0); i--){
    
    }
    System.out.println(" O MDC e: " + i);
}
}