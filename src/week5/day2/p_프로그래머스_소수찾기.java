package week5.day2;

//서로 겹치는게 없는 수
//소수의 반대는 합성 수
//모든 자연수는 a = b*q + r 형태로 표현 가능하다.

//유클리드 정리0
//소수 판별법
//1) 13이 있으면 1~13까지 나눠봄 0이 아니면 소수 O(N)
//2) 13이 13/2 미만 까지 나누어 보는 방법 6.5 이므로 2~6까지 나누어 ㅂ보기
//3) 13이 있다. 루트 13까지 (*포함) 까지 나누어 보는 방법 2,3
//4) 에라토스테네스의 체

public class p_프로그래머스_소수찾기 {
    public static void main(String[] args) {
//        Solution1 solution1 = new Solution1();
//        System.out.println(solution1.solution(14));
//
//        Solution2 solution2 = new Solution2();
//        solution2.solution(12);
//        solution2.solution(11);
//
//        Solution3 solution3 = new Solution3();
//        System.out.println(solution3.solution(10));
//
//
        TemplateCallbackPrime tp = new TemplateCallbackPrime();
        boolean bool = tp.isPrime(15, (a, b)->a*a < b);
        boolean bool2 = tp.isPrime(15, (a, b)->a < b/2);
        boolean bool3 = tp.isPrime(15, (a, b)->a < b);
        System.out.println(bool);
        System.out.println(bool2);
        System.out.println(bool3);
    }
}


