class Solution {
    public List<String> letterCombinations(String digits) 
    {
        List<String> res = new ArrayList<>();
        if( digits == null || digits.length() == 0 ) return res;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        back( digits, 0, new StringBuffer(), res, map );
        return res;
    }

    static void back(String digits, int i, StringBuffer ans, List<String> res, Map<Character, String> map )
    {
        if (i == digits.length()) {
            res.add(ans.toString());
            return;
        }

         String letters = map.get(digits.charAt(i));
        for (char ch : letters.toCharArray()) {
            ans.append(ch); // choose
            back(digits, i + 1, ans, res, map);
            ans.deleteCharAt(ans.length() - 1); // undo
        }
    }
}