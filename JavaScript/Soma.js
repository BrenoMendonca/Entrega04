// Somatório: Soma de um conjunto de números.

var num = prompt("Digite a quantidade de vezes que deseja informar um numero")
var soma = 0;
for(var i = 1; i <= num; i++){
    var X = parseInt(prompt("Digite o num desejado"))
    soma =  soma + X
}

console.log(soma)