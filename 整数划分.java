package lanqiao;

public class 整数划分 {
//	https://blog.csdn.net/my_sunshine26/article/details/77141398
	int n;
	char[] s;
	long num[][];
	long dp[][];
//	String s;
	int m;
	void run() {
		int len=s.length;
		for (int i = 1; i <=len; i++) {
			num[i][i]=s[i]-'0';
			for (int j = i+1; j <=len; j++) {
				num[i][j]=num[i][j-1]*10+s[j]-'0';
			}
		}
		
		
		for (int i = 1; i <=n; i++) {
			dp[i][0]=num[1][i];
				
		}
		for (int j = 1; j < m; j++) {
			for (int i = j+1; i <=len; i++) {
				for (int k = i; k < j; k++) {
					dp[i][j]=Math.max(dp[i][j], dp[k][j-1]*num[k+1][i]);
				}
			}
		}
		
		
	}
}
