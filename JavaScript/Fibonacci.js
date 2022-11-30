var num = parseInt(console.log("Digite quantos termos voce quer mostrar:"))
var aux1 = 0;
var aux2 = 1;
var aux3;
console.log(aux1)
console.log(aux2)

var contador = 3;
while (contador <= num){
    aux3 = aux1 +aux2
    console.log(aux3)
    aux1 = aux2
    aux2 = aux3
    contador +=1;
};
