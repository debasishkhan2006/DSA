package Linked_List;

public class find_duplicate {
    public int findDuplicate(int[] arr) {
        int slow = 0,fast = 0;

        while(true){
            slow = arr[slow];
            fast = arr[fast];
            fast = arr[fast];

            if(slow==fast){
                slow = 0;
                while(slow!=fast){
                    slow = arr[slow];
                    fast = arr[fast];
                }
                break;
            }
        }
        return slow;
    }
}
