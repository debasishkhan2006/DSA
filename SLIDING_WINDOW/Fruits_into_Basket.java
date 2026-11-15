package SLIDING_WINDOW;

import java.util.HashMap;

public class Fruits_into_Basket {

    public int totalFruit(int[] arr) {
        int n = arr.length, low = 0,high = 0,max_fruits = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(high = 0;high<n;high++){
            int fruit = arr[high];
            if(map.containsKey(fruit)){
                map.put(fruit, map.get(fruit)+1);
            }
            else{
                map.put(fruit, 1);
            }

            while (map.size()>2) {
               int curr_fruit = arr[low];
               map.put(curr_fruit, map.get(curr_fruit)-1);

               if(map.get(curr_fruit)==0) map.remove(curr_fruit);
               low++; 
            }

            if(map.size()<=2){
                int curr_number_fruits = 0;
                for(int f:map.keySet()){
                    curr_number_fruits += map.get(f);
                }
                max_fruits = Math.max(max_fruits, curr_number_fruits);
            }
        }
        return max_fruits;
    }
    public static void main(String[] args) {
        
    }
}
