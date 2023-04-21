import java.util.*;

public class Collection {

        public static void main(String[] args) {

                HashSet<Double> names = new HashSet<>();

                names.add(13.34);  //yha autoboxing ho rhi hai apne aap.aur jb nikalege tb unboxing ho jaegi.
                names.add(3.123);
                names.add(347.428);
                names.add(13.34);
                names.add(10.0);
                System.out.println(names);
                
                
                TreeSet<Double> tset = new TreeSet<>();
                
                tset.addAll(names);
                
                System.out.println(tset);
                

        }

}
