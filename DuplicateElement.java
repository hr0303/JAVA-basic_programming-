// FINDING DUPLICATE ELEMENT IN AN UNSORTED ARRAY

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        String[] names={"harry","ron","harmione","harry"};

//        COMPARING EACH ELEMENT-[time complexity: O(n^2)]
        for(int i=0;i< names.length;i++){
            for(int j=i+1;j< names.length;j++){

                if(names[i].equals(names[j])){
                    System.out.println("Duplicate element is: "+ names[i]);
                }
            }
        }

//        USING HashSet: STORES UNIQUE VALUE [time complexity: O(n)]
//        HashSet is a part of java collections(to use it import java.util.Set &java.util.HashSet package)
        Set<String> store=new HashSet<String>();
        for(String name:names){
            if(store.add(name)==false){
                System.out.println("Duplicate element is: "+ name);
            }
        }

//        USING HASHMAP(LEARN AGAIN)
        

    }

}
