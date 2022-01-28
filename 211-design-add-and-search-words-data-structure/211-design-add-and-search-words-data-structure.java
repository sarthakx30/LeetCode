class WordDictionary {
    
    Map<Integer, Set<String>> map;
    
    public WordDictionary() {
        map = new HashMap<>();
    }
    
    public void addWord(String word) {
        int index = word.length();
        if (!map.containsKey(index)) {
            Set<String> set = new HashSet<>();
            set.add(word);
            map.put(index, set);
        } else {
            map.get(index).add(word);
        }
    }


    public boolean search(String word) {
      int index = word.length();
      if (!map.containsKey(index)) {
          return false;
      }

      Set<String> set = map.get(index);
      for(String s : set) { 
          if(isSame(s, word)) { // when word has '.'
              return true;
          }
      }
      return false;
    }

    public boolean isSame(String s, String word) { // word has '.'
        for (int i = 0; i < s.length(); i++) {
            if (word.charAt(i) != '.' && s.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */