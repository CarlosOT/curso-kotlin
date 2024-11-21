fun main(){
    val userA = Usuario();
    val userB = Usuario();

    userA.nome = "Carlos";
    userB.nome = "Ingrid";

    userA.inprimeMaiusculo();
    userB.inprimeMaiusculo();
}

class Usuario{
    var nome: String = "";

    fun inprimeMaiusculo(){
        println(("Olá " + nome).uppercase());
    }

}