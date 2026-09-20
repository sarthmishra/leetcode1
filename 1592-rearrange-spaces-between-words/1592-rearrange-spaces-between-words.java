class Solution {
    public String reorderSpaces(String text) {
        int n = text.length();
        int spaceCount = 0;
        for(int i = 0; i < n; i++){
            if(text.charAt(i) == ' '){
                spaceCount++;
            }
        }
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;

        StringBuilder sb = new StringBuilder();
        if(wordCount == 1){
            sb.append(words[0]);
            for(int i = 0 ; i < spaceCount; i++){
                sb.append(' ');
            }
            return sb.toString();
        }
        int spacesBetween = spaceCount / (wordCount - 1);
        int extraSpaces = spaceCount % (wordCount - 1);

        String gap = " ".repeat(spacesBetween);
        String extra = " ".repeat(extraSpaces);
        
        for (int i = 0; i < wordCount; i++) {
            sb.append(words[i]);
            if (i < wordCount - 1) {
                sb.append(gap);
            }
        }
        sb.append(extra);
        
        return sb.toString();
        

        
        



    }
}