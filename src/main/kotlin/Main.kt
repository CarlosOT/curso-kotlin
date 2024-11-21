fun main(){
    val userA = Usuario();
    val userB = Usuario();

    userA.nome = "Carlos";
    userB.nome = "Ingrid";

    userA.inprimeMaiusculo();
    val getNomeUserB = userB.getNomeMaiusculo();
    println(getNomeUserB);
}

class Usuario{
    var nome: String = "";

    fun inprimeMaiusculo(){
        println(("Olá " + nome).uppercase());
    }

    fun getNomeMaiusculo() : String{
        return nome.uppercase();
    }

}