public class Test {


  public static int[] shuffle(int[] nums, int n) {
    int[] res = new int[n*2];
    for(int i = 0; i < n; i++){
        res[i] = nums[i];
        res[n+i] = nums[n+i];
     }
     return res;
    }


    public static void main(String[] args) {
      int [] arr = new int[]{2,5,1,3,4,7};
      System.out.println(shuffle(arr, 3));
    }
  
}
