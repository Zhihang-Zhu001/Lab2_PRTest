import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class L2022211978_13_Test {

    /*

    等价类划分原则：

    1. 小于等于3个球
    示例 nums = [2,0,1]
    示例 nums = [2,0]

    2. 多于3个球
    示例 nums = [2,0,1,1,2,2,1,0]
    示例 nums = [2,0,1,2,2,1,1,0,0]

     */


    /*
    输入：nums = [2,0,1]
    预期结果： nums = [0,1,2]
     */
    @Test
    public void testSortColorsMethod(){
        Solution solution = new Solution();

        int[] nums = new int[]{2,0,1};

        solution.sortColors(nums);

        int[] exceptResult = new int[]{0,1,2};

        assertArrayEquals(exceptResult,nums);

    }

    /*
    输入：nums = [2,0]
    预期结果： nums = [0,2]
     */
    @Test
    public void testSortColorsMethod01(){
        Solution solution = new Solution();

        int[] nums = new int[]{2,0};

        solution.sortColors(nums);

        int[] exceptResult = new int[]{0,2};

        assertArrayEquals(exceptResult,nums);

    }

    /*
    输入：nums = [2,0,1,1,2,2,1,0]
    预期结果： nums = [0,0,1,1,1,2,2,2]
     */
    @Test
    public void testSortColorsMethod02(){
        Solution solution = new Solution();

        int[] nums = new int[]{2,0,1,1,2,2,1,0};

        solution.sortColors(nums);

        int[] exceptResult = new int[]{0,0,1,1,1,2,2,2};

        assertArrayEquals(exceptResult,nums);

    }

    /*
    输入：nums = [2,0,1,2,2,1,1,0,0]
    预期结果： nums = [0,0,0,1,1,1,2,2,2]
     */
    @Test
    public void testSortColorsMethod03(){
        Solution solution = new Solution();

        int[] nums = new int[]{2,0,1,2,2,1,1,0,0};

        solution.sortColors(nums);

        int[] exceptResult = new int[]{0,0,0,1,1,1,2,2,2};

        assertArrayEquals(exceptResult,nums);

    }


}
