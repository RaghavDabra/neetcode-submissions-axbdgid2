class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0; // this is we are returning
        int left = 0;
        int maxfrequencies = 0;

        for(int r =0; r<s.length(); r++)
        {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1); // it is basically used to get 
            //the count from the map defaulting to 0 if seen first time otherwise 1 
            maxfrequencies = Math.max(maxfrequencies, map.get(s.charAt(r)));

            while((r-left+1) - maxfrequencies > k )
            //window size - most frequenct character count
            {
                map.put(s.charAt(left) , map.get(s.charAt(left)) - 1);
            left++;
        }
        result = Math.max(result, r-left+1);

    }
    return result;
}
}
