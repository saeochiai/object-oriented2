package Sample;
private class TV {

    private int channel;


    public TV() {
        //TODO Auto-generated constructor stub
    }
    public void changeChannel(int channel){
        if(channel <= 0 || 13 <=channel ){
            System.out.println("チャンネルは1~12までの間で設定してください");
            return;


        }
        this.channel = channel;
        System.out.println(this.channel+"チャンネルに切り替わりました");

    }
        public int getChannel(){
            return this.channel;
        

    }
        
    }

