public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = new int[]{1, 0, 2,0,3, 3};
        solution.moveZeroes(nums);
        for (int e : nums
                ) {
            System.out.println(e);

        }
    }
}
