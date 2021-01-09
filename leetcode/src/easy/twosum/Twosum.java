package easy.twosum;

/**
 * {@link Twosum}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">Matthew.miao</a>
 * @version ${project.version} - 2021/1/9
 */
public class Twosum {

    public int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length<2){
            return null;
        }
        int[] res = new int[2];
        for(int i=0;i<=nums.length-2;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {

    }

}
