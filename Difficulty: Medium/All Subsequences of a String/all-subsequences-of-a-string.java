class Solution {
    public List<String> powerSet(String s) {
        List<String> list = new ArrayList<>();
        subset("", s, 0, list);
        Collections.sort(list);
        return list;
    }
    public void subset(String ans, String s, int i, List<String> list) {
        if (i == s.length()) {
                list.add(ans);
            return;
        }
        char ch = s.charAt(i);
        subset(ans + ch, s, i + 1, list);// PICK
        subset(ans, s, i + 1, list);// SKIP

    }

}