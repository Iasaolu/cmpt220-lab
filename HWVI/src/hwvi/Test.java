package hwvi;

public class Test {
	  public static void main(String[] args) {

	        Queue new_queue = new Queue();
	        //enqueue 20 numbers 
	        for (int i = 0; i < 20; i++) {
	            new_queue.enqueue(i);
	        }

	        // show first 20 numbers FIFO style
	        for (int i = 0; i < 20; i++) {
	            System.out.printf("%2d ", new_queue.dequeue());
	            if ((i + 1) % 5 == 0) { 
	            	System.out.printf("\n");
	            	}
	        }
	    }


}
