class User{
    var name: String = "";
    var cpf: CPF = CPF();

    fun printUpperCase(){
        println(name.uppercase());
    }

    fun upadteName(newName:String){
        name = "$newName [atualizado com sucesso]";
    }

    fun getNameLength() : Int{
        return name.length;
    }
}