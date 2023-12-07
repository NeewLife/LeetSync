class Solution {
    public int strStr(String haystack, String needle) {
        char[] arr = haystack.toCharArray();

        if(haystack.length() < needle.length()){
            return -1;
        }

        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int j = 0;
            while(j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            } 
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}

/**
 * 일단 haystack 보다 needle 이 길면 포함이 안되므로 -1 반환
 * for 문을 짓는데 인덱스 설정을 haystack 길이에서 needle 길이만큼 뺀 것 까지 설정한다.
 * 왜냐면 만약 needle이 포함될 경우, haystack의 맨 끝에 포함된다고 해도 반환할 i 는 haystack길이 - needle길이
 * 이기 때문이다.
 * 그리고 int j 값을 새로 주고, while 조건을 'j 는 needle의 길이보다 작고, haystack의 i+j 번째 글자와 needle의 j번째
 * 글자가 같을 경우' 로 설정한다.
 * 왜 haystack은 i+j냐면, i 인덱스쓰는 for 문이 반복되다가 i가 3이 되었다고 치면, 4번째까지 기타 카포 끼우듯이 베이스를
 * 설정해놓고 needle 하고 비교한다고 이해하면 될듯 하다.
 * 그렇게 비교하다가 j가 needle의 길이와 같아지면 i를 반환하고, 
 * 만약 j가 다르면 그냥 계속 while 돌리다가 for문 끝나고 -1을 리턴하게 된다.
 */