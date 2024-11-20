package ThirdWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Find_Lucky_Integer_in_an_Array {

    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm =new HashMap<>();

        for(int ele:arr){
            if(hm.containsKey(ele)) {
                hm.put(ele, hm.get(ele) + 1);
            }else{
                hm.put(ele, 1);
            }
        }
        int ans=-1;

        for(int key : hm.keySet()){
            if(key==hm.get(key)){
                ans=Math.max(ans, key);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[]={2,2,3,4};
        Find_Lucky_Integer_in_an_Array fli=new Find_Lucky_Integer_in_an_Array();
        System.out.println(fli.findLucky(arr));
    }

}
