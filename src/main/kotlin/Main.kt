fun main() {
    print("Insira nome do usuário: ");
    var nameUser: String? = readln();
    if(nameUser?.length == 0){
        nameUser = null;
    }
    val checkNameUser = nameUser ?: "usuário Desconhecido";
    print("Seja bem Vindo(a), $checkNameUser");
}