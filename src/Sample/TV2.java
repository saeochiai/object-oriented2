package Sample;

public class TV2 implements Electrical {

    @Override
    public void power() {
        // TODO Auto-generated method stub
        if (powerOn){
            //電源が入っていた場合
            System.out.println("テレビの電源が切れました");
            powerOn = false;

        }else{
            //電源が切れていた場合
        System.out.println("テレビの電源が入りました");
        powerOn = true;
        }
        
    }
    //チャンネルを切り替える操作
    public void changeChannel(int channel){
        if(!powerOn){
            System.out.println("テレビの電源を入れてください");
            return
        }
        this.channel = channel;
        System.out.println(this.channel + "チャンネルに切り替わりました");
    }

}
