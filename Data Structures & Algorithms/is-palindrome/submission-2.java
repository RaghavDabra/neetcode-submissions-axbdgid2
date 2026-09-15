class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder build = new StringBuilder();
        for(char c : s.toCharArray())
        {
            if(Character.isLetterOrDigit(c)){
                build.append(Character.toLowerCase(c));
            }
        }
        return build.toString().equals(build.reverse().toString());
    }
}
