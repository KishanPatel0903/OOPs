/*java Generics example 1 which accepts string and gives 
compile time type error for adding of other types */
    import java.util.*;  
class javageneric1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
list.add("Vicky");  
list.add("Raj");  
list.add("Dev");
String s=list.get(1); //type casting is not required  when using generics
System.out.println("element is: "+s);  
  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  

