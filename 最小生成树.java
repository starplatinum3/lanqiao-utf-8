package lanqiao;

import java.util.ArrayList;
import java.util.List;

public class 最小生成树 {
	static class Node {
		int u, v;
		int id, w;

		public Node(int u, int v, int w) {
			this.u = u;
			this.v = v;
			this.w = w;
		}
	}

	void init() {
		for (int i = 0; i < f.length; i++) {
			f[i]=i;
		}
	}

	public static void main(String[] args) {
		最小生成树 最小生成树 = new 最小生成树();
		List<Node> list = new ArrayList<>();
		list.add(new Node(1,2,1));
		list.add(new Node(2,4,2));
		list.add(new Node(3,4,3));
		list.add(new Node(6,4,4));
		list.add(new Node(3,5,5));
		list.add(new Node(6,5,6));
		最小生成树.krus(list);
		System.out.println("最小生成树.ans");
		System.out.println(最小生成树.ans);
	}

	int n;
	int ans = 0;
	int[] f;

	int find(int x) {
		if (x == f[x])
			return x;
		return f[x] = find(f[x]);
	}

//	void krus(List<Node> list ) {
//
//	}
	void krus(List<Node> list ) {
//		List<Node> list = new ArrayList<>();
		list.sort((o1, o2) -> {
			return o1.w - o2.w;
		});
		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			int fx = find(list.get(i).u);
			int fy = find(list.get(i).v);
			if (fx == fy)
				continue;
			f[fx] = fy;
			cnt++;
			ans += list.get(i).w;
			if (cnt == n - 1)
				break;

		}

	}
	
//	void krus() {
//		List<Node>list=new ArrayList<>();
//		list.sort((o1,o2)->{
//			return o1.w-o2.w;
//
//		});
//		int cnt=0;
//		for (int i = 0; i <list.size(); i++) {
//			int fx=find(list.get(i).u);
//			int fy=find(list.get(i).v);
//			if(fx==fy)continue;
//			cnt++;
//			ans+=list.get(i).w;
//			if(cnt==n-1)break;
//
//		}
//
//
//	}
}
