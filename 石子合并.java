package lanqiao;

public class 石子合并 {
	int n;
	int[][] dp;
	int[] sum;

	void run() {
		for (int len = 2; len <= n; len++) {
			for (int i = 1; i <= n; i++) {
				int j = i + len - 1;
				if (j > n) {
					continue;
				}
				for (int k = i; k < j; k++) {
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + sum[j] - sum[i - 1]);
				}
			}
		}
//	 合并第i堆到第j堆石子
//	 合并第1堆到第n堆石子
		System.out.println(dp[1][n]);
	}
	int [] [] s;
	void youhua() {
		
		for (int i = 1; i <=n; i++) {
		   s[i][i]=i;
		   dp[i][i]=0;
		}
		for (int len = 2; len <n; len++) {
			for (int i = 1; i <=n; i++) {
				int j=i+n-1;
				if(j>n)continue;
				for (int k = s[i][j-1]; k <=s[i+1][j]; k++) {
					if(dp[i][j]>dp[i][k]+dp[k+1][j]+sum[j]-sum[i-1]) {
						dp[i][j]=dp[i][k]+dp[k+1][j]+sum[j]-sum[i-1];
						s[i][j]=k;
					}
				}
			}
			
		}
	}
}
