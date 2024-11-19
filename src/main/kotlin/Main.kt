fun main() {
    var endereco: String? = "Rua A";
    val qtdeCaracteres = endereco?.length ?: 0;
    print(qtdeCaracteres);
}