package org.example;

public class 더_크게_합치기 {
    public int solution(int a, int b) {
        int answer = 0;
        int compareA = Integer.parseInt(a + String.valueOf(b));
        int compareB = Integer.parseInt(b + String.valueOf(a));
        answer = Math.max(compareA, compareB);
        return answer;
    }
}
