package Sample;

public class InstantiateTV {
    public static void main(String[] args) {
        
        TV sonyTV = new TV();
        sonyTV.changeChannel(5);//5チャンネルにする

        TV sharpTV = new TV();
        sharpTV.changeChannel(13);//13チャンネルにする
    }

}
