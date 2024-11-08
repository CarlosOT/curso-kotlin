fun main() {
    val texto = """
        Olá, Carlos!
        Seu produto chegou...
        """.trimIndent();
    println(texto);

    val csv = """
        texto1,
        texto2
        """.replaceIndent(newIndent = ";");
    println(csv);
}