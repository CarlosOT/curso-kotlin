fun main(){
    val controle =  PlayerDeVideo(50);
    controle.aumentarVolume();

    val controle2 = PlayerDeVideo(30);
    controle2.aumentarVolume();

    PlayerDeVideo.resetCount();

    val controle3 = PlayerDeVideo(20);
    controle3.aumentarVolume();
    val controle4 = PlayerDeVideo(10);
    controle4.aumentarVolume();

}



