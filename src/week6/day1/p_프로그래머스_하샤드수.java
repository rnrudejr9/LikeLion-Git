package week6.day1;

public class p_프로그래머스_하샤드수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
        System.out.println(solution.solution(12));
        System.out.println(solution.solution(11));
        System.out.println(solution.solution(13));
    }
}


//자릿수의 합
//나누어떨어지는지 체크

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String s = Integer.toString(x);
        String[] str = s.split("");
        int temp = 0;
        for(int i=0;i<str.length;i++){
            temp += Integer.parseInt(str[i]);
        }

        if(x % temp == 0){
            return answer = true;
        }
        return answer;
    }
}