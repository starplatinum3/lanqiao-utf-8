package lanqiao;

public class LIS {
//	最长上升子序列
	int n = 11;
//	int[] a=new int[111]{1,2,3,4,1,2,3,4,5,1,2,3,5,4,3};
	int[] a = { 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 5, 4, 3 };
	int[] dp = new int[111];
	int max = 0, maxx = 0;

	void lis() {
		for (int i = 0; i < n; i++) {
			max = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && dp[j] > max) {
					max = dp[j];
				}

			}

			dp[i] = max + 1;
			maxx = Math.max(maxx, dp[i]);
		}
	}

	void lis() {
		for (int i = 0; i < a.length; i++) {
			max = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && max < dp[j]) {
					max = dp[j];
				}
			}
//			max=dp[j]+1;
			dp[i] = max + 1;
			maxx = Math.max(maxx, dp[i]);
		}
	}
	
	void lis3() {
		for (int i = 0; i <n; i++) {
			max=0;
			for (int j = 0; j <i; j++) {
				if(a[j]<a[i]&&dp[j]>max) {
					max=dp[j];
				}
			}
			dp[i]=max+1;
			maxx=Math.max(maxx, dp[i]);
		}
	}

	public static void main(String[] args) {
		LIS lisTest = new LIS();
		lisTest.lis();
		System.out.println(lisTest.maxx);

	}
}
