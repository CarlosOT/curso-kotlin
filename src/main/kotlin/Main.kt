fun main(){

    println(Database.name);
    println(Database.userLogged?.getName());

    println("");
    val userA = User("Carlos");
    Database.login(userA);
    println(Database.userLogged?.getName());

    println("");
    val userB = User("Ingrid");
    Database.login(userB);
    println(Database.userLogged?.getName());

}





