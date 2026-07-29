class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder left = new StringBuilder();
        char middle=0;
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<freq[i]/2;j++)
            {
                left.append((char)('a'+i));
            }
            if(freq[i]%2==1)
                middle=(char)('a'+i);
        }
        StringBuilder right = new StringBuilder(left);
        right.reverse();
        String ans = (middle!=0)?new StringBuilder().append(left).append(middle).append(right).toString():new StringBuilder().append(left).append(right).toString();
        return ans;
    }
}