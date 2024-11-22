fun main(){
    val user1 = User();
    user1.name = "Carlos";
    user1.password = "123";
    println(user1.name);
    println(user1.password);

    user1.updatePassword(user1.name);
    println(user1.password);

}

