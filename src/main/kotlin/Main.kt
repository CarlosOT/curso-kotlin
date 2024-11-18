fun main() {
    var testPrograma = false;

     while(testPrograma == false){
         print("Insira o ID do produto: ");
         val produtoId = readln().toInt();

         when(produtoId){
             1,3 -> {
                 println("Você ganhou 10% de desconto");
             }
             2 -> {
                 println("Você ganhou 20% de desconto");
             }
             else ->{
                 println("Resposta padrão");
                 testPrograma = true;
             }
        }
     }
}