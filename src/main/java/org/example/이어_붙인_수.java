package org.example;

public class 이어_붙인_수 {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddNumber = "";
        String evenNumber = "";

        int temp = 0;

        for(int i = 0; i < num_list.length; i++) {
            temp = num_list[i];

            if (temp % 2 == 1) {
                oddNumber += String.valueOf(temp);
            } else {
                evenNumber += String.valueOf(temp);
            }
        }
        answer = Integer.parseInt(oddNumber) + Integer.parseInt(evenNumber);

        return answer;
    }
}
