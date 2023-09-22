public class test {
    public static void main(String[] args) {

        Solution solution = new Solution(); // Membuat objek dari kelas Solution

        int[] nums = {1, 2, 3}; // Contoh array nums

        int[] result = solution.getConcatenation(nums); // Memanggil metode getConcatenation dengan array nums sebagai argumen

        // Menampilkan hasil
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
   }


class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        System.gc();
        return ans;
    }
}