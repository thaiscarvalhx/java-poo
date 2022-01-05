package POO.ControleRemoto;

public class Controle {

    private
    Integer volume;
    Integer canal;

    public Controle(Integer volume, Integer canal) {
        this.volume = volume;
        this.canal = canal;
    }


    /*------------------------------------
                    FUNÇÕES
    --------------------------------------*/

    public String situacao() {
        System.out.println("\n" + "Volume = " + volume + "\n" +
                "Canal = " + canal);
        return null;
    }

    public void aumentarVol(){
        if(volume < 30){
            volume ++;
        } else if (volume == 30){
            System.out.println("Volume máximo atingido.");
        }
    }

    public void diminuirV(){
        if(volume > 0){
            volume --;
        } else if (volume == 0){
            System.out.println("Volume mínimo atingido.");
        }
    }

    public void aumentarCan() {
            canal ++;
       //     if(canal == 16){
       //         System.out.println("Número máximo de canais atingidos.");
       //     }
    }


    public void diminuirCan(){
        if(canal > 0){
            canal --;
        } else if (canal == 0){
            System.out.println("Esta é sua HOME PAGE, escolha um canal.");
        }
    }

    public void escolherCan(int ec){
        this.canal = ec;
    }


    /*------------------------------------

    --------------------------------------*/


    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }


}
