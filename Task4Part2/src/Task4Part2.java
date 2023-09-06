import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task4Part2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        try {
            Random rand = new Random();
            BufferedReader read = new BufferedReader(new FileReader(".\\src\\poem.txt"));
            while (read.ready()) {
                queue.add(read.readLine());
            }
            while(queue.peek() != null){
                System.out.println(queue.poll());
                Thread.sleep(rand.nextLong(1000,3000));
            }
        }
            catch (IOException e){
                e.printStackTrace();
            }
            catch (InterruptedException e) {
            throw new RuntimeException(e);
            }
    }
}
