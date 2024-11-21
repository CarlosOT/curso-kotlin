fun main(){
    val userA = User();

    userA.name = "Carlos";
    userA.printUpperCase();
    var nameLength = userA.getNameLength();
    println("Seu nome ${userA.name} tem $nameLength caracteres");

    userA.upadteName("Charles");
    userA.printUpperCase();
    nameLength = userA.getNameLength();
    println("Seu nome ${userA.name} tem $nameLength caracteres");
}

