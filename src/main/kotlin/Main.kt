fun main() {
    var usuarioLogado = false;

    while(usuarioLogado == false){
        println("Login!")
        print("Digite seu Usuario: ")
        val usu = readln()
        print("Digite sua Senha: ")
        val senha = readln()
        val intSenha = senha.toInt()
        val usuData = "Felipe"
        val senhaData = 1234
        if (usu == usuData && intSenha == senhaData){
            println("Login efetuado com sucesso!");
            usuarioLogado = true;
        }else {
            println("Usuário ou Senha incorretos, tente novamente!");
        }
    }
}