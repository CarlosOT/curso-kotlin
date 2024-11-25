fun main(){
    val controle =  PlayerDeVideo(50);
    controle.aumentarVolume();
    controle.diminuirVolume();
    controle.aumentarVolume();
    controle.aumentarVolume();
    controle.aumentarVolume();
    controle.aumentarVolume();
    controle.aumentarVolume();
    controle.aumentarVolume();
    controle.aumentarVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
    controle.diminuirVolume();
}

class PlayerDeVideo(private var volume: Int){

    private fun validarVolume(): Boolean{
        if (getVolume() >= 0 && getVolume() <= 100){
            return true;
        }else{
            return false;
        }
    }

    public fun aumentarVolume(){
        if(validarVolume() && getVolume() != 100){
            setVolume(getVolume() + 10);
            println("Volume(+): ${getVolume()}");
        }else{
            setVolume(100);
            println("Volume máximo(x): ${getVolume()}");
        }

    }

    public fun diminuirVolume(){
        if(validarVolume() &&getVolume() != 0){
            setVolume(getVolume() - 10);
            println("Volume(-): ${getVolume()}");
        }else{
            setVolume(0);
            println("Volume mínimo(x): ${getVolume()}");
        }
    }

    private fun getVolume(): Int{
        return volume;
    }

    private fun setVolume(value: Int){
        volume = value;
    }

}

