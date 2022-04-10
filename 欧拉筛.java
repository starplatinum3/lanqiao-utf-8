package lanqiao;

import java.util.Arrays;
import java.util.PriorityQueue;

//import jdk.net.NetworkPermission;

public class 欧拉筛 {
	int n;
	int[] isPrime, notPrime;

	int[] eular() {
		int cnt = 0;
		for (int i = 2; i <= n; i++) {
			if (notPrime[i] == 0) {
				isPrime[cnt++] = i;
			}
			for (int j = 0; j < cnt && i * isPrime[j] <= n; j++) {
				notPrime[i * isPrime[j]] = 1;
			}
		}
		return Arrays.copyOf(isPrime, cnt);
	}

	int[] eular2() {
		int cnt = 0;
		for (int i = 2; i <= n; i++) {
			if (notPrime[i] == 0) {
				isPrime[cnt++] = i;
			}
			for (int j = 0; j < cnt && i * isPrime[j] <= n; j++) {
				notPrime[i * isPrime[j]] = 1;
			}
		}
	}

	void eular3() {
		int cnt = 0;
		for (int i = 2; i <= n; i++) {
			if (notPrime[i] == 0) {
				isPrime[cnt++] = i;
			}
			for (int j = 0; j < cnt && i * isPrime[j] <= n; j++) {
				notPrime[i * isPrime[j]] = 1;
			}
		}
	}

	void eular4() {
		int cnt = 0;
		for (int i = 2; i <= n; i++) {
			if (notPrime[i] == 0) {
				isPrime[cnt++] = i;
			}
			for (int j = 0; j < cnt && i * isPrime[j] <= n; j++) {
				notPrime[i * isPrime[j]] = 1;
			}
		}
	}
	
	void eular() {
		int cnt=0;
		for (int i = 2; i <=n; i++) {
			if(notPrime[i]==0) {
				isPrime[cnt++]=i;
			}
			for (int j = 0; j <cnt&&i*isPrime[j]<=n; j++) {
				notPrime[i*isPrime[j]]=1;
			}
		}
	}
}
