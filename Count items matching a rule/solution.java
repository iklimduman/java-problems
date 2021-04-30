class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        
        int matchValue = 0 ;
        
        int index = 0 ;
        
        if(ruleKey.equals("type")){
            index = 0 ;
        }
        else if(ruleKey.equals("color")){
            index = 1 ;
        }
        else if(ruleKey.equals("name")){
            index = 2 ;
        }
        else{
            System.out.println("Unknown key");
        }
        
        for(int i=0 ; i<items.size() ; i++){
            if(items.get(i).get(index) == ruleValue){
                matchValue++;
            }
        }
        
        
        return matchValue ;
        
    }
}
