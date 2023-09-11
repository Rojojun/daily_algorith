package org.example;

public class 문자_겹치기 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        if (my_string.length() - my_string.substring(0, s).length() == overwrite_string.length()) {
            answer = my_string.substring(0, s) + overwrite_string;
        } else {
            String temp =  my_string.substring(0, s) + overwrite_string;
            answer = temp + my_string.substring(temp.length());
        }

        return answer;
    }
}
