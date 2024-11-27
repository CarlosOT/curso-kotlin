fun main(){
    val user = User("Felipe", false);
    println(user.getName());
    user.setName("Carlos");
    println(user.getName());
    println("");

    val userB = User();
    println(userB.getName());
}



