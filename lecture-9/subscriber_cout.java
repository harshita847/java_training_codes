//package lecture-9;
class youtube{
    private String channel_name;
    private int subscount;
    
    public void set(String channel_name)
    {
              this.channel_name=channel_name;
              this.subscount=0;
    }
    public void gets(){
        System.out.println(channel_name);
    }
     public void gets_count(int pin){
        if(pin==123){
        System.out.println(subscount);
    
    }
else System.out.println("invalid pin");}
     public void gets_both(){
        System.out.println(channel_name);
         System.out.println(subscount);

    }
    public void subscribed(){
        subscount++;
    }
    public void unscribed(){
        if(subscount >0){
        subscount--;
        }
    else{
        System.out.println("0");
    }
    }
}

public class subscriber_cout {
    public static void main(String[] args){
        youtube c1=new youtube();
        c1.set("unique");
        c1.gets_both();
        c1.gets_count(200);
        c1.subscribed();
        c1.subscribed();
        c1.subscribed();
         c1.subscribed();
          c1.subscribed();
           c1.subscribed();
           c1.gets_both();
        c1.unscribed();
    }
    
}
