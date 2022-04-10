package lanqiao;

public class 矩阵快速幂 {
	long MOD = (long) (1e6 + 7);

	long[][] mul(long[][] a, long[][] b) {
		long[][] res = new long[6][6];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				for (int k = 0; k < res.length; k++) {
					res[i][j] = (res[i][j] + a[i][k] * b[k][j]) % MOD;
				}
			}

		}

		return res;
	}

	int fastPow(int a, int n) {
		int res = 1;
		for (int i = n; i > 0; i >>= 1) {
			if ((i & 1) == 1) {
				res *= a;
			}
			a *= a;
		}
		return res;
	}

	long[][] fastMulPow(long[][] a, int n) {
		long[][] res = new long[6][6];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				if (i == j) {
					res[i][j] = 1;
				} else {
					res[i][j] = 0;
				}

			}
		}
		for (; n > 0; n >>= 1) {
			if ((n & 1) == 1) {
				res = mul(res, a);
			}
			a = mul(a, a);

		}
		return res;
	}

	int intMod = (int) (1e6 + 7);

	int fastPow1(int a, int n) {
		int res = 1;
		for (; n > 0; n >>= 1) {
			if ((n & 1) == 1) {

				res = (res * a) % intMod;
			}
			a = (a * a) % intMod;
		}
		return res;
	}
	
	int[][] matMul(int[][] a,int [][]b){
		int[][] res=new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k <6; k++) {
					res[i][j]=(res[i][j] +a[i][k]*b[k][j])%intMod;
					
				}
			}
		}
		
		return res;
	}
	
	int[][] fastMulPow(int[][] a,int n){
		int[][] res=new int[6][6];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if(i==j) {
					res[i][j]=1;
				}else {
					res[i][j]=0;
				}
			}
		}
		
		for (;n>0;n>>=1) {
			if((n&1)==1) {
				res=matMul(res, a);
			}
			a=matMul(a, a);
		}
		return res;
	}
}
