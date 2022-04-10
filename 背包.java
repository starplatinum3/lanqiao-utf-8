package lanqiao;

public class 背包 {
	int[][] dp;
	int cnt;
	int logListLen;
	int totLen;
	int[] tryCutLenList, dpMostMoney, value;

	void tryCut(int tryCutIdx, int totLen) {

		for (int len = tryCutLenList[tryCutIdx]; len <= totLen; len++) {
			dpMostMoney[len] = Math.max(dpMostMoney[len],
					dpMostMoney[len - tryCutLenList[tryCutIdx]] + value[tryCutIdx]);
					// 去掉长度的钱多 还是保留的多
		}
	}

	void run() {
		for (int tryCutIdx = 0; tryCutIdx < tryCutLenList.length; tryCutIdx++) {
			tryCut(tryCutIdx, totLen);
		}

	}
}
