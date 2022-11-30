var x = parseInt(prompt("Digite o primeiro num")); 
var y = parseInt(prompt("Digite o segundo num"));
var aux;

if( x > y){
    aux = x;
    x = y;
    y = aux;
}
for(var i = x; i > 1 && !(x%i==0 && y%i==0); i--){

}
console.log(" O MDC e: " + i)