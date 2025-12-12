import java.io.FileWriter;

public class write {
     static void writedata(String data){
        try{
            FileWriter writer=new FileWriter("new.java", true);

            writer.write(data);
            writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


public static void main(String[] args){

         writedata("hello i am old data");
}
}

