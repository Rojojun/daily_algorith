package org.example;

public class 등차수열 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += d * i + + a;
            }
        }
        return answer;
    }
}
