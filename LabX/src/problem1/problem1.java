package problem1;
import java.io.BufferedReader;  
import java.io.FileReader;  
public class problem1 {

	public static void main(String[] args) throws Exception{
		String line;  
        int count = 0;  
            
        FileReader fr = new FileReader("/Users/ik/Downloads/Hamlet.txt");  
        BufferedReader br = new BufferedReader(fr);  
              

        while((line = br.readLine()) != null) {  

            String words[] = line.split(" ");  
 
            for(String word: words) {
            	if (word.equals("thou")||word.contentEquals("Thou")){
            		count+=1;
            	}
            }
 
        }  
          
        System.out.println("The total number of 'thou' appearances is " + count);  
        br.close();  

	}

}

   
