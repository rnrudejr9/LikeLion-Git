package week5.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime {
    static ArrayList<Integer> list;
    static boolean[] arr;
    public static void main(String[] args) {
        list = new ArrayList<>();
        int temp = 10_000_000;
        arr = new boolean[temp];
        for(int i = 2;i<temp;i++){
            list.add(i);
        }
        arr[0] = true;
        arr[1] = true;
        isRemove(2);
        isRemove(3);
        isRemove(5);
        isRemove(7);

        int cnt = 0;
        for(boolean x : arr){
            if(x == false){
                System.out.println(cnt);
            }
            cnt++;
        }
    }
    public static void isRemove(int n){
        for(int i =0;i<list.size();i++){
            if(list.get(i) % n == 0 && list.get(i) > n){
                arr[list.get(i)] = true;
            }
        }
    }
}
