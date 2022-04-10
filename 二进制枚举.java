package lanqiao;

public class 二进制枚举 {

	int n;
	int sum;
	int[] a;
	int t;

//	https://blog.csdn.net/sugarbliss/article/details/81101493
	void run() {
		for (int i = 0; i < (1 << n); i++) {
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) == 1) {
					sum += a[j];
				}
			}
			if (sum == t) {

				for (int j = 0; j < n; j++) {
					if ((i & (1 << j)) == 1) {
						System.out.println(a[j]);
					}
				}

			}
		}
	}

	void meiju() {
		for (int i = 0; i < (1 << n); i++) {
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) == 1) {
					sum += a[j];
				}
			}

			if (sum == t) {

				for (int j = 0; j < n; j++) {
					if ((i & (1 << j)) == 1) {

						System.out.println(a[j]);

					}
				}
			}
		}
	}
	
	void meiju() {
		for (int i = 0; i < (1<<n); i++) {
			
			for (int j = 0; j < n; j++) {
				if((i&(1<<j))==1) {
					sum+=a[j];
				}
			}
			
			if(sum==t) {
				for (int j = 0; j < n; j++) {
					if((i&(1<<j))==1) {
						System.out.println(a[j]);
					}
				}
			}
			
		}
	}
}
