package lanqiao;

public class 神奇的口袋 {
	int n;
	int W;
	int []w;
//	int[ ][] dp;
	int[] dp;
	int[] volu;
  void run() {
	  
	  for (int i = 0; i < n; i++) {
//		for (int j = 0; j <=W; j++) {
//			dp[i][j]=Math.max(dp[i][j],dp[i+1][j-w[i]]);
//		}
		for (int tiji = 40; tiji >=volu[i]; tiji++) {
			dp[tiji]+=dp[tiji-volu[i]];
//			dp[i][tiji]=Math.max(dp[i][tiji],dp[i+1][tiji-volu[i]]);
		}
	}
  }
}
