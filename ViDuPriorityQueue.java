import java.util.PriorityQueue;
import java.util.Queue;

 // Sap xep theo thu tu uu tien
public class ViDuPriorityQueue {
    public static void main(String[] args) {
        
        Queue<String> studentList = new PriorityQueue<String>();

        studentList.offer("Dinh Ngoc Tam");
        studentList.offer("Hoang Vy");
        studentList.offer("My Duyen");

        studentList.offer("An");
        while(true){
            String name = studentList.poll(); //peek => lay ra nhung khong xoa
            if(name == null) break;
            System.out.println(name);
            
        }
    }
}
