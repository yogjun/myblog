package medium.rotate;

/**
 * {@link RotateArray} 旋转数组
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">Matthew.miao</a>
 * @version ${project.version} - 2021/1/8
 */
public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        k = k % nums.length;
        if (k == 0) {
            return nums;
        }
        reserve(nums, 0, nums.length - 1);
        reserve(nums, 0, k - 1);
        reserve(nums, k, nums.length - 1);
        return nums;
    }

    public void reserve(int[] nums, int i, int j) {
        for (int k = i; k <= (i + j) / 2; k++) {
            swap(nums, k, i + j - k);
        }
    }


    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
