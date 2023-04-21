import java.util.*;

public class TraverseExample 
{

        public static void main(String[] args) 
        {
                
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Durgesh");
        names.add("Sitara");
        names.add("Roshni");
        names.add("vandana");
        names.add("Vandana");

        //traversal using for each
        
        for(String s : names)
        {
                System.out.println(s+" "+s.length());
        }
                System.out.println("----------------------------------------------------------------------");
                
                
                
                //traversing using iterator
                
              Iterator<String> itr = names.iterator();
                
        
              while(itr.hasNext())
              {
                     String next =  itr.next();
                      System.out.println(next);
              }
              
                System.out.println("---------------------------------------------------------");
              
              //backword traversal of collection using LISTITERATOR
              
              
              ListIterator<String> litr = names.listIterator(names.size());
              
              
              while(litr.hasPrevious())
              {
                     String previous =  litr.previous();
              
                      System.out.println(previous);
              }
              
              
        
        //Enumeration
        
        //for each method
        
                System.out.println("-------------For each method----------");
        
        names.forEach(e->{
        
                System.out.println(e);
        });
              
              
        }

       
        
}