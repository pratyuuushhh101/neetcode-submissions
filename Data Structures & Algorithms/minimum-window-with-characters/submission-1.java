class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] need = new int[128];
        int[] window = new int[128];

        for (char c : t.toCharArray()) need[c]++;

        int required = 0;
        for (int i = 0; i < 128; i++) if (need[i] > 0) required++;

        int formed = 0, l = 0, r = 0;
        int minLen = Integer.MAX_VALUE, start = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            window[c]++;
            if (need[c] > 0 && window[c] == need[c]) formed++;
            r++;

            while (formed == required) {
                if (r - l < minLen) {
                    minLen = r - l;
                    start = l;
                }
                char ch = s.charAt(l);
                window[ch]--;
                if (need[ch] > 0 && window[ch] < need[ch]) formed--;
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}