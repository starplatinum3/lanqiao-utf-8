package lanqiao;

public class 最长公共子序列 {
	int n, m;
	char[] s1, s2;
	int[][] dp;
//	https://blog.csdn.net/qq_30241305/article/details/51097211
	void run() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (s1[i] == s2[j]) {
					if (i < 1 || j < 1) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i - 1][j - 1] + 1;
					}
				} else {
					if (i < 1 && j < 1) {
						dp[i][j] = 0;

					} else if (i < 1) {
						dp[i][j] = dp[i][j - 1];
					} else if (j < 1) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
					}
				}
			}
		}

		System.out.println(dp[n - 1][m - 1]);
	}
	void run1() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(s1[i]==s2[j]) {
					if(i<1||j<1) {
						dp[i][j]=1;
					}else {
						dp[i][j]=dp[i-1][j-1]+1;
					}
				}else {
					if(i<1&&j<1) {
						dp[i][j]=1;
					}
					else if(i<1) {
						dp[i][j]=dp[i][j-1];
					}	else if(j<1) {
						dp[i][j]=dp[i-1][j];
					}else {
						dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
					}
				}
			}
		}
	}
}
