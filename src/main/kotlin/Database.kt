/**
 * teste documentando
 * */
object Database{
    var name = "unknow";
    var userLogged: User? = null;

    fun login(user: User){
        Database.userLogged = user;
    }
}