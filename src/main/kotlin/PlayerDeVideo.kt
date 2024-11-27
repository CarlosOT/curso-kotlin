/**
 * teste documentando
 * */
class PlayerDeVideo(private var volume: Int){

    companion object{
        private const val MAX_NAME_LENGTH = 8;
        var count = 0;

        /**
         * teste documentando
         * */
        fun resetCount(){
            count = 0;
        }
    }

    init {
        count++;
        println(count);
    }

    /**
     * teste documentando
     * */
    private fun validarVolume(): Boolean{
        if (getVolume() >= 0 && getVolume() <= 100){
            return true;
        }else{
            return false;
        }
    }

    /**
     * teste documentando
     * */
    public fun aumentarVolume(){
        if(validarVolume() && getVolume() != 100){
            setVolume(getVolume() + 10);
            println("Volume(+): ${getVolume()}");
        }else{
            setVolume(100);
            println("Volume máximo(x): ${getVolume()}");
        }

    }

    /**
     * teste documentando
     * */
    public fun diminuirVolume(){
        if(validarVolume() &&getVolume() != 0){
            setVolume(getVolume() - 10);
            println("Volume(-): ${getVolume()}");
        }else{
            setVolume(0);
            println("Volume mínimo(x): ${getVolume()}");
        }
    }

    /**
     * teste documentando
     * */
    private fun getVolume(): Int{
        return volume;
    }

    /**
     * teste documentando
     * */
    private fun setVolume(value: Int){
        volume = value;
    }

}