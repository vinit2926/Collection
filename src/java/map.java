
import java.util.*;
import java.util.function.BiConsumer;


public class map {

        public static void main(String[] args) 
        {
                      //key     value
                HashMap<String,Integer> courses = new HashMap<>();
                
                //adding elements
                
                courses.put("corejava",4000);
                courses.put("basic python", 3500);
                courses.put("spring",8000);
                courses.put("android",4000);
                courses.put("android",4000);
                courses.put("php", 200);
                
                System.out.println(courses);
                
                courses.isEmpty();
                courses.containsKey("corejava");
                
                courses.forEach((key,value)->{
                        System.out.println(key+"=>"+value);
                });
              
        }

}