
//Número é primo: Um número inteiro positivo n é primo se for divisível apenas por 1 e por n.
const numPrimo = parseInt(prompt("Digite um numero"));
var numDiv = 0;
if(numPrimo > 0){
for(var i = 1; i <=numPrimo; i++){
  if(numPrimo % i == 0){
    numDiv ++
  }
}
if(numDiv == 2){
  console.log("O numero e primo")
} else{
  console.log("O numero nao e primo")
}
} else {
  console.log("Numero invalido")
}