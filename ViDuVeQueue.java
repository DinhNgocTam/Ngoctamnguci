import java.util.LinkedList;
import java.util.Queue;


public class ViDuVeQueue {
    public static void main(String[] args) {
        
        Queue<String> studentList = new LinkedList<String>();

        studentList.offer("Dinh Ngoc Tam");
        studentList.offer("Hoang Vy");
        studentList.offer("My Duyen");

        studentList.offer("Viet Toan");
        while(true){
            String name = studentList.poll(); //peek => lay ra nhung khong xoa
            if(name == null) break;
            System.out.println(name);
            
        }
    }
}
