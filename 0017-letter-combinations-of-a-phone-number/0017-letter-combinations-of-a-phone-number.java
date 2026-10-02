class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return ans;
        }
        backTrack(ans,"",0,digits);
        return ans;
    }
        private void backTrack(List<String> ans,String current,int index, String digits){
            if(current.length() == digits.length()){
                ans.add(current);
                return;
            }
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        String letters = mapping[digits.charAt(index) -'0'];
        for(int i = 0; i < letters.length(); i++){
            backTrack(ans, current + letters.charAt(i), index + 1, digits);
        }
    }
}