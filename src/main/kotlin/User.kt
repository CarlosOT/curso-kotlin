class User{
    var name:String = "";
    var password:String = "";

    fun updatePassword(initialValue: String){
        val numberPositive = Math.abs(initialValue.hashCode());
        password = numberPositive.toString();
    }
}