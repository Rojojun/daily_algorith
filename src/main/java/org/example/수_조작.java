package org.example;

public class 수_조작 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(numLog.length);
        System.out.println(reverse(numLog));
    }

    public static int solution(int n, String control) {
        int answer = n;

        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                answer += 1;
            } else if (control.charAt(i) == 's') {
                answer -= 1;
            } else if (control.charAt(i) == 'd') {
                answer += 10;
            } else if (control.charAt(i) == 'a') {
                answer -= 10;
            }
        }

        return answer;
    }

    public static String reverse(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            if (diff == 1) {
                sb.append("w");
            } else if (diff == -1) {
                sb.append("s");
            } else if (diff == 10) {
                sb.append("d");
            } else if (diff == -10) {
                sb.append("a");
            }
        }
        return sb.toString();
    }
}
