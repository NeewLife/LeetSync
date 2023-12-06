class Solution {
    public boolean isPalindrome(int x) {
        // if(x < 0){
        //     return false;
        // }

        String str1 = x + "";
        String str2 = "";
        
        for(int i = str1.length() - 1; i>=0; i--){
            str2 += str1.charAt(i);
        }
        System.out.println(str1);
        System.out.println(str2);
        if(str1.equals(str2)){
            return true;
        }
        return false;

        /*
        - 기존의 int를 x + ""; 를 사용해서 문자열로 치환한다.
        - 빈 문자열을 만들고 str1의 길이 - 1 의 초기 인덱스를 설정한 반복문을 만든다.
        - 이 반복문은 문자열을 뒤집는 용도이기 때문에 인덱스가 -- 로 감소한다.
        - str1 을 한글자씩 뒤집은 str2 를 새로 만든다.
        - JAVA 에서는 문자열을 비교할 때 == 이 아니라 .equals() 를 사용해야 한다.
        */
    }
}