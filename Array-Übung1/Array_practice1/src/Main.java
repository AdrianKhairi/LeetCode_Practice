public class Main {
    public static void main(String[] args) {
            int consecutiveOnes = 0;
            int[] nums = new int[]{1, 1, 0, 1, 1, 1};
            int longestOnes =0;

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == 1) {
                        consecutiveOnes++;
                    }
                    if (consecutiveOnes > longestOnes){
                        longestOnes = consecutiveOnes;
                    }
                    if (nums[i] != 1){
                        consecutiveOnes =0;
                    }
                }

        System.out.println(longestOnes);
    }
}
