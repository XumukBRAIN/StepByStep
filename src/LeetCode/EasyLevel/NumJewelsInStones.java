package LeetCode.EasyLevel;

public class NumJewelsInStones {
    public static void main(String[] args) {
        String jewels = "aAbBzZ";
        String stones = "aaaAAbBBBzzZ";
        NumJewelsInStones task10 = new NumJewelsInStones();
        System.out.println(task10.numJewelsInStones(jewels, stones));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; j < jewels.length(); j++){
                if(stones.charAt(i) == jewels.charAt(j)){
                    answer++;
                }
            }
        }
        return answer;
    }

}
