package lanqiao;

public class 连续子数组的最大和 {
//	链接：https://www.nowcoder.com/questionTerminal/459bd355da1549fa8a49e350bf3df484
//		来源：牛客网

		 public int FindGreatestSumOfSubArray(int[] array) {
		         if (array.length==0 || array==null) {
		             return 0;
		         }
		         int curSum=0;
		         int greatestSum=0x80000000;
		         for (int i = 0; i < array.length; i++) {
		             if (curSum<=0) {
		                 curSum=array[i]; //记录当前最大值
		             }else {
		                 curSum+=array[i]; //当array[i]为正数时，加上之前的最大值并更新最大值。
		             }
		             if (curSum>greatestSum) {
		                 greatestSum=curSum; 
		             }
		         }
		         return greatestSum;
		     }
		 
		 int  findG(int[] array) {
			 int curSum=0;
			 int greatestSum=0x80000000;
			 for (int i = 0; i < array.length; i++) {
				if(curSum<=0) {
					curSum=array[i];
				}else {
					curSum+=array[i];
				}
				if(curSum>greatestSum) {
					greatestSum=curSum;
				}
			}
			 return greatestSum;
		 }
}
