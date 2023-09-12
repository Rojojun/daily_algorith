package org.example;

public class 문자열_섞기 {
    public String solution(String str1, String str2) {
        String answer = "";
        int itrCnt;
        if (Integer.compare(str1.length(), str2.length()) != -1) {
            itrCnt = str1.length();
        } else {
            itrCnt = str2.length();
        }
        for(int i = 0; i < itrCnt; i ++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }
}
