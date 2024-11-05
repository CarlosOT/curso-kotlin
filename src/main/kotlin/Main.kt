fun main() {
    // é assim que se comenta no kotlin
    /*é a mesma coisa que
    no javascript*/

    /*consigo reatribuir o valor na variável que declaro como 'var'*/
    var resultado = 10 + 1;
    println(resultado);
    resultado = 10+10;
    println(resultado);
    println("")

    /*já quando declaro a variável como 'val' o valor é imutável, não posso fazer reatribuição*/
    val novoResultado = 10+30;
    println(novoResultado);
    //novoResultado = 20; (vai dar erro)

}