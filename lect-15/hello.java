import java.io.File;

public class hello {
    // crud- using code we will create,read,update,delete any file
    
    public static void main(String[] args){
               
           File file=new File("new.java");
           try{

            if(file.createNewFile()){

                System.out.println("file is created");
                System.out.println(file.getName());
                System.out.println(file.getAbsoluteFile());
            
            }
            else{
                System.out.println("file is already existed");
            }
           }
           catch(Exception e){
            System.out.println(e);
           }
    }
    
}
