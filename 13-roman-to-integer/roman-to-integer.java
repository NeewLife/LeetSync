class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int result = 0;
        
        for (int i = 0; i < s.length(); i++){
            if(i < s.length() - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))){
                result -= roman.get(s.charAt(i));
            } else {
                result += roman.get(s.charAt(i));
            }
            System.out.println(i + " : " + result);
        }

        return result;
    }
    /*
      - 먼저 로마 문자열이 담긴 Map 객체를 만든다.
      - 로마 문자열의 길이만큼 반복되는 for 문을 만든다.
      - 만약 앞자리 문자가 뒷자리 문자보다 작으면 작은 문자를 빼도록 조건을 걸어준다
        - 예를 들어 IV 를 입력받았을 경우 4를 뜻하는데 I는 1 V는 5를 의미한다.
        - I는 V보다 작으므로 0번째 for문에서는 I를 빼므로 result = -1
        - 1번째 for문에서는 V를 더하므로 result = -1 +5 = 4 가 반환된다.
      - 추가로 for문의 인덱스가 끝자리일 겨웅에는 그냥 더하면 되므로, 
        앞의 조건들은 끝자리 - 1 번째까지만 적용된다고 할 수있다.
      - 따라서 i < s.length() 조건을 동시에 충족해야 하므로 && 조건문을 사용했다.
    */
}