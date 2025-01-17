package Sample;

public class PC implements Electrical{

    private boolean powerOn;

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }
    @Override
    public void power() {
        if(powerOn){
            //電源が入っている場合
            powerOn = false;
            System.out.println("PCの電源が切れました");

        }else{
            //電源が切れていた場合
            System.out.println("設定ファイルを読み込んでいます");
            powerOn = true;
            System.out.println("PCの電源が入りました");

            

        }
    }




}
