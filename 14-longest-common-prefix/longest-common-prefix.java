class Solution {
    public String longestCommonPrefix(String[] strs) {

        String ans = strs[0];
        String sub = "";
        for (int i = 1; i < strs.length; i++){
            for(int j = 0; j < Math.min(ans.length(), strs[i].length()); j++){
                if(ans.charAt(j) == strs[i].charAt(j)){
                    sub += ans.charAt(j);
                }
                else{
                    break;
                }
            }
            System.out.println(i + " : " + ans);
            ans = sub;
            sub = "";
            System.out.println(i + " : " + ans);
        }
        System.out.println(ans);

        return ans;

    }
}


/**
  # 핵심기술
  - Math.min(a, b) = a, b 중 작은 것
  - for문이 한번 끝날 때마다 변수 덮어쓰기
  */

/**
  해설
  - strs 배열의 첫 번째 단어를 ans 변수로 정의한다.
  - 인덱스를 i=1부터 시작하게 하여서 strs[]의 첫번째 단어의 길이나 두번째 단어의 길이 중 짧은 길이까지 반복하는
    이중 반복문을 설정한다.
    - 이때, 이 반복문은 i=2부터는 ans가 strs[]의 첫번째 단어가 아니라 공통단어로 덮어씌워지므로 점점 짧아진다.
  - 첫 번째 단어와 두 번째 단어를 비교해서 글자가 같다면 따로 변수(sub)에 한글자씩 저장하고,
    틀리면 break 한다.
  - for문을 다 돌리든 break가 되든 생성된 sub변수는 두 단어의 최소 공통언어일 것이다.
  - ans에 sub변수를 덮어쓴다. 이렇게 하면 두 번째 반복문 부터는 '앞 두글자의 공통단어' 와 strs[]의 뒷 단어를
    비교하게 되는 것이다.
*/