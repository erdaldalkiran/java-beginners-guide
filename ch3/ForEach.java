public class ForEach {
    public static void main(String[] args)    {
        int[] nums = {1,2,3,4,5};
        var sum = 0;
        for (var num : nums) {
            sum += num;
        }

        System.out.println(Integer.toString(sum));
    }
}
