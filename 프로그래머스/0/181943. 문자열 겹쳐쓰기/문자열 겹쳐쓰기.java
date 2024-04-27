class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
         int s2 = overwrite_string.length();
                
        //String answer = my_string.replace(minus, overwrite_string);
/*
String.replace() 메서드는 해당 문자열에서 특정 문자열을 모두 다른 문자열로 교체해 줍니다. 다만, 교체되는 문자열이 여러 번 나온다면 그 모든 경우에 대해 교체됩니다.

여기서 minus 변수는 my_string에서 s부터 s + s2까지의 부분 문자열을 추출한 것이죠. 그리고 그 부분 문자열을 overwrite_string으로 교체하려는 것이 맞습니다.
그런데 만약 minus가 여러 번 나온다면, 모든 minus가 overwrite_string으로 교체될 것입니다.
예를 들어, "HelloWorld"에서 "lloWorl" 부분이 두 번 이상 나온다면, 모든 "lloWorl"이 "overwrite_string"으로 교체됩니다.
그래서 결과적으로 solution 메서드는 이상한 결과를 반환할 수 있습니다.

이를 방지하기 위해서는, replace() 대신에 substring()을 사용하여 원하는 부분만 교체하는 방법을 사용할 수 있습니다
*/
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+s2); 
        return answer;
    }
}