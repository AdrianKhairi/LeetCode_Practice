public class Main {
    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896};
        int evenNumber = 0;
        int counter =0;
        int amount=0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                counter++;
                nums[i] /= 10;
            }
            if (counter % 2 == 0){
                amount ++;
            }
            counter = 0;

        }
    }
}
