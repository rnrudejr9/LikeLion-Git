package week9.day2;

import java.util.Arrays;

public class p_기수정렬 {
    public static void main(String[] args) {
        int[] arr = new int[] {7,4,5,9,1,0};
        int [] redixArr = new int[10];
        Arrays.fill(redixArr,-1);

        for(int i : arr){
            redixArr[i] = i;
        }
        System.out.println(Arrays.toString(redixArr));
        int cnt = 0;
        for(int i =0;i<redixArr.length;i++){
            if(redixArr[i] != -1){
                arr[cnt++] = redixArr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
