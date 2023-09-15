package org.example;

public class 마지막_두_원소 {

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int temp_a = num_list[num_list.length - 1];
        int temp_b = num_list[num_list.length - 2];

        if (temp_a < temp_b) {
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            answer[answer.length] = temp_a - temp_b;
        } else {
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            answer[answer.length] = temp_a * temp_b;
        }

        return answer;
    }
}
