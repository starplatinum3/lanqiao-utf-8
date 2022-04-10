package lanqiao;

public class 最长上升子序列 {
	int n;
	int[] dp, a;
	int max, maxx;

	void run() {
		dp[0] = 1;
		for (int i = 0; i < n; i++) {
//			dp[i] = 1;
			max = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && dp[j] > max) {
					max = dp[j];
				}
			}
			dp[i] = max + 1;
			maxx = Math.max(maxx, dp[i]);
		}

		System.out.println("res: " + maxx);
	}

}
