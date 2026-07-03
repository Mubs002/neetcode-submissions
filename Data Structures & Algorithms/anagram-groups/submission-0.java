class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String sortedWord = new String(letters);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<String>());
            }
            
            map.get(sortedWord).add(strs[i]);
        
        }

        return new ArrayList<>(map.values());
    }
}
