public class Contagem {
    public static void main(String[] args) throws Exception {
    
Scanner ler = new Scanner(System.in);
int num; 
System.out.println(" Digite o numero desejado");
num = ler.nextInt();

for(int i = 0; i <= num; i ++ ){
    System.out.println("Numero " + i + "\n");
}
}
