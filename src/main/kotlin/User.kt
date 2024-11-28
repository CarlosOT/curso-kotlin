/**
 * teste documentando
 * */
class User(private var name: String, private var isAdmin: Boolean){

    companion object{
        const val MAX_NAME_LENGTH = 8;
    }

    init{

    }

    constructor(name: String) : this(name, false){
        println("execute o construtor 2");
    }
    constructor() : this("Desconhecido"){
        println("execute o construtor 3");
    }


    public fun setName(newName: String){
        name = newName;
    }
    public fun getName(): String{
        return name;
    }

}