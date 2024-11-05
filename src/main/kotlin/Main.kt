fun main() {
    // é assim que se comenta no kotlin
    /*é a mesma coisa que
    no javascript*/

    /*consigo reatribuir o valor na variável que declaro como 'var'*/
    var resultado: Int = 10 + 1;
    println(resultado);
    resultado = 10+10;
    println(resultado);
    println("")

    /*já quando declaro a variável como 'val' o valor é imutável, não posso fazer reatribuição*/
    val novoResultado: Int = 10+30;
    println(novoResultado::class); // para saber o tipo de dado armazenado basta usar '::class'
    //novoResultado = 20; (vai dar erro)
    println("")

    val nome: String = "Carlos"; //tipo explícito
    println(nome::class);
    println("")

    val sobrenome = "Teixeira"; //tipo inferido
    println(sobrenome::class);

}