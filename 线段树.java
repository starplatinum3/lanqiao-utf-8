package lanqiao;

import java.util.Set;

//import com.sun.org.apache.bcel.internal.generic.DADD;

public class 线段树 {
	class SegTree {
		int l, r;
		SegTree lson, rson;
		int data;

		public SegTree(int l, int r) {
			super();
			this.l = l;
			this.r = r;
		}

	}

	int[] b;

	SegTree buildSegTree(int l, int r) {
		SegTree tree = new SegTree(l, r);
//		if (l > r) {
//			return null;
//		}
		if (l == r) {
			tree.data = b[l];
			return tree;

		}
		int mid = (l + r) / 2;
		SegTree lson = buildSegTree(l, mid);
		SegTree rson = buildSegTree(mid + 1, r);
		tree.lson = lson;
		tree.rson = rson;
		tree.data = lson.data + rson.data;
		return tree;
	}

	void add(SegTree tree, int pos, int val) {
		if (tree == null)
			return;
		int l = tree.l;
		int r = tree.r;
		tree.data += val;
//		if(l<=x&&y<=r) {
//			tree.data+=val;
//			
//		}
		int mid = (l + r) / 2;
		if (pos <= mid) {
			add(tree.lson, pos, val);
		} else {
			add(tree.rson, pos, val);
		}

	}

	int sum(SegTree tree, int x, int y) {
		int l = tree.l;
		int r = tree.r;
		int res = 0;
//		if (l <= x && y <= r) {
//			return tree.data;
//
//		}
		if (x <= l && r <= y) {
			return tree.data;
		}
		int mid = (l + r) / 2;
		if (x <= mid) {
			res += sum(tree.lson, x, y);
		}
		if (y > mid) {
			res += sum(tree.rson, x, y);
		}
		return res;
	}
	
	int sum(SegTree tree,int x,int y) {
		int l=tree.l;
		int r=tree.r;
		if(x<=l&&r<=y) {
			return tree.data;
					
		}
		int mid=(l+r)/2;
		int res=0;
		if(x<=mid)res+=sum(tree.lson, x, y);
		if(mid<y)res+=sum(tree.rson, x, y);
		return res;
	}
	
	void add(SegTree tree,int pos,int val) {
		if(tree==null)return;
		tree.data+=val;
		int l=tree.l;
		int r=tree.r;
		int mid=(l+r)/2;
		if(pos<=mid)add(tree.lson, pos, val);
		else if(pos>mid)add(tree.rson, pos, val);
	}
	
	SegTree buildSegTree(int l,int r) {
		SegTree tree=new SegTree(l,r);
		if(l==r) {
			tree.data=b[l];
			return tree;
		}
		int mid=(l+r)/2;
		SegTree lson=buildSegTree(l, mid);
		SegTree rson=buildSegTree(mid+1, r);
		tree.data=lson.data+rson.data;
		tree.lson=lson;
		tree.rson=rson;
		return tree;
		
	}

}
