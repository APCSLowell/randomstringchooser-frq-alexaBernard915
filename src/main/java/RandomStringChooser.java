import java.util.*;
public class RandomStringChooser{
  //member variables 
private String [] wordArray; 
private ArrayList <Integer> uncalledIndex; 
  //constructor
public RandomStringChooser (String [] s){
  uncalledIndex = new ArrayList <Integer>(); 
  wordArray = s; 
  for (int i = 0; i< wordArray.length; i++){
    uncalledIndex.add(i);
  }
}
  public String getNext(){
    if(uncalledIndex.size() == 0){
      return ("NONE");
    }
    int x = (int)(Math.random()*uncalledIndex.size());
    String s = wordArray[uncalledIndex.get(x)];
    uncalledIndex.remove(x); 
    return s; 
  }
    
    
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
