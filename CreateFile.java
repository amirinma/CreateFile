import java.io.*;
import java.util.*;
import java.lang.*;

class writeFile{
   public static void main(String[] args){
      CreateFile g = new CreateFile();
      g.openFile();
      g.addRecords();
      g.closeFile();
   }
}

public class CreateFile{
   private Formatter x;
   public void openFile(){
      try{
         x = new Formatter("Chinese.txt");
      }
      catch (Exception e){
         System.out.println("You got an error");
      }
   }
   public void addRecords(){
      x.format("%s%s%s", "Save me ", " to the file ", "and close."); 
   }
   public void closeFile(){
      x.close();
   }
}