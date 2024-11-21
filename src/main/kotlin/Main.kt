fun main(){
    val userA = User();

    userA.name = "Carlos";
    userA.printUpperCase();
    userA.upadteName("Charles");
    userA.printUpperCase();
}

class User{
    var name: String = "";

    fun printUpperCase(){
        println(("Olá " + name).uppercase());
    }

    fun upadteName(newName:String){
        name = newName;
    }
}