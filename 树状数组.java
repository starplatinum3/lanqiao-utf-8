package lanqiao;
//import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class 树状数组 {
	int[] bit;

	int lowbit(int x) {
		return x & ~x;
	}

	void add(int pos, int num) {
		for (int i = pos; i < bit.length; i += lowbit(i)) {
			bit[i] += num;
		}
	}

	int sum(int pos) {
		int res = 0;
		for (int i = pos; i > 0; i -= lowbit(i)) {
			res += bit[i];
		}
		return res;
	}
}
