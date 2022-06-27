/*Example of generics using map
here, we are passing key and value */
import java.util.*;  
class javagenerics2{  
public static void main(String args[]){  
Map<Integer,String> map=new HashMap<Integer,String>();  
map.put(1,"Raj");  
map.put(4,"Vicky");  
map.put(2,"Dev");  
  
//Now use Map.Entry for Set and Iterator  
Set<Map.Entry<Integer,String>> set=map.entrySet();  
  
Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
while(itr.hasNext()){  
Map.Entry e=itr.next();//no need to typecast  
System.out.println(e.getKey()+" "+e.getValue());  
}  
  
}}  