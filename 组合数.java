package lanqiao;

public class 组合数 {
	int[][] c = new int[1011][1011];
	int mod = (int) 1e6 + 7;

	void run() {

		for (int i = 0; i < 1000; i++) {
			c[i][i] = c[i][0] = 1;
		}
		for (int i = 2; i < 1000; i++) {
			for (int j = 1; j < i; j++) {
				c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % mod;
			}
		}

		System.out.println(c[4][2]);

	}

	void zuhe() {
		for (int i = 0; i < 1000; i++) {
			c[i][i] = c[i][0] = 1;
		}
		for (int i = 2; i < c.length; i++) {
			for (int j = 1; j < i; j++) {
				c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % mod;
			}
		}
	}

	public static void main(String[] args) {
		new 组合数().run();
	}
}
