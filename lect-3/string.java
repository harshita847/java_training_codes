
// to remove duplicate from strings
public class string {
    public static void main(String[] var0){
        String name="harshita";
        String newname="";
        for(char ch : name.toCharArray())
        {
               if(newname.indexOf(ch)==-1)
               {
                     newname+=ch;
               }
               
        }
       System.out.println(newname);

    }
    
}
