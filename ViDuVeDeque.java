import java.util.ArrayDeque;
import java.util.Deque;

import java.util.LinkedList;

public class ViDuVeDeque {
    public static void main(String[] args) {
        
        Deque<String> studentList = new ArrayDeque<String>();


        studentList.offer("Dinh Ngoc Tam");
        studentList.offer("Hoang Vy");
        studentList.offer("My Duyen");
        studentList.offer("Viet Toan");

        studentList.offer("Hi");        
        studentList.offerFirst("Hello");
        studentList.offerLast("See ya");

        while(true){
            String name = studentList.poll(); //peek => lay ra nhung khong xoa
            if(name == null) break;
            System.out.println(name);
            
        }
    }
}
