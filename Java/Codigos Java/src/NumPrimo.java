public class NumPrimo{
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int numPrimo;
        int numDiv;
        System.out.println("Digite um numero");
        numPrimo = ler.nextInt();
       
        if(numPrimo > 0){
        for(int i = 1; i <=numPrimo; i++){
          if(numPrimo % i == 0){
            numDiv ++
          }
        }
            if(numDiv == 2){
                System.out.println("O numero e primo");
            } else{
                System.out.println("O numero nao e primo");
            }
          } 
          else {
            System.out.println("Numero invalido");
          }
}