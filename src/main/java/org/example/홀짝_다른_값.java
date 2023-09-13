package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class 홀짝_다른_값 {
    private final String ODD = "ODD";
    private final String EVEN = "EVEN";

    public int solution(int n) {
        String flag = findOddOrEven(n);
        List<Integer> intList = new ArrayList<>();

        if (Objects.equals(flag, ODD)) {
            for (int i = 0; i < n; i++) {
                int temp = n - i;
                if(temp % 2 == 1)
                    intList.add(temp);
            }
        } else {
            for (int i = 0; i < n; i++) {
                int temp = n - i;
                if(temp % 2 != 1)
                    intList.add(temp * temp);
            }
        }

        return makeAnswer(intList);
    }

    public String findOddOrEven(int n) {
        return n % 2 == 1 ? ODD : EVEN;
    }

    public int makeAnswer(List<Integer> intList) {
        int answer = 0;
        for (Integer integer : intList) {
            answer += integer;
        }
        return answer;
    }
}
