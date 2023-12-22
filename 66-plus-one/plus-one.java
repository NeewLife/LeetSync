class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

/**
 * 못풀어서 해설 가져옴
 * for문 안에서 [5, 8] 이나 [8, 0] 같은 일반적인 배열일때는
 * 배열 끝 인덱스값 + 1 하고 바로 배열 return 해서 종료 [5, 9]  [8, 1]
 *
 * 만약 [5, 9] 같은 끝자리가 9인 배열은
 * 배열 끝 인덱스값 + 1 하면 10으로 넘어가므로
 * 배열 끝부터 0 대입하고 그 전 인덱스값 + 1 하고 리턴 [6, 0]
 * 
 * 만약 [9, 9] 나 [9, 9, 9] 같이 특수한 배열일 경우
 * 반복문대로 실행하면 배열 값 전부 0 찍혀서 [0, 0]   [0, 0, 0]으로 반환하고 반복문이 종료되므로
 * 배열을 new 로 만들어서 기존배열의 길이 + 1로 생성하고,
 * 첫번째 값을 1로 한다.. 그 후 리턴 [1, 0, 0]  [1, 0, 0, 0]
 */