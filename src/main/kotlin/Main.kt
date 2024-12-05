fun main(){
    val userA = dataUser("Carlos", true);
    val userB = userA.copy(isAdmin = false);
    println(userA);
    println(userB);

}

data class dataUser(var name:String, var isAdmin:Boolean)




