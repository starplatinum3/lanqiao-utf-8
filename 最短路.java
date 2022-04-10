package lanqiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Receiver;

import sun.reflect.generics.tree.VoidDescriptor;

//import com.sun.glass.ui.Robot;

//import com.sun.org.apache.xpath.internal.operations.Div;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
//
//import sun.reflect.generics.tree.Tree;

//import sun.security.util.Length;

public class 最短路 {

	class Node implements Comparable<Node>{
		int id, len;

		public Node(int id, int len) {
			super();
			this.id = id;
			this.len = len;
		}

		public Node() {

		}
		@Override
		public int compareTo(Node ano) {
			// TODO Auto-generated method stub
			
			return len-ano.len;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "id: "+id+", len: "+len;
		}

	}

	int[] dis;
	boolean[] vis;
	int INF = 0x3f3f3f3f;
	int n;
	int[][] len;
	int[] ro;

	void dij() {
		Arrays.fill(vis, false);
		Arrays.fill(dis, INF);
		while (true) {
			int v = -1;
			int minn = INF;
			for (int i = 0; i < n; i++) {
				if (vis[i])
					continue;
				if (minn > dis[i]) {
					minn = dis[i];
					v = i;
				}
			}

			if (v == -1)
				break;
			vis[v] = true;
			for (int u = 0; u < n; u++) {
				if (vis[u])
					continue;
				if (dis[u] > dis[v] + len[v][u]) {
					dis[u] = dis[v] + len[v][u];
				}
			}

		}
	}

//	int [] g;
//	List[] g;
	int[][] g;
	int[] resc;
	List[] gLists;

	void dijPrio() {
		PriorityQueue<Node> queue = new PriorityQueue<>();

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			int u = node.id;
			if (vis[u])
				continue;
			vis[u] = true;
			for (int i = 0; i < g[u].length; i++) {
				int v = g[u][i];
				if (vis[v])
					continue;
				if (dis[v] > dis[u] + len[u][v]) {
					dis[v] = dis[u] + len[u][v];
//					u 是有了 ，v是还没有 要试试
				}
//				vis[v]=true;
				queue.add(new Node(v, dis[v]));
			}
//			for(Object ov:gLists[u]) {
//				int v=(int)ov;
//			}

		}
	}

	void dij2() {
		Arrays.fill(dis, INF);
		Arrays.fill(vis, false);
		while (true) {
			int v = -1;
			int minn = INF;
			for (int i = 0; i < n; i++) {
				if (minn > dis[i]) {
					minn = dis[i];
					v = i;
				}
			}
			if (v == -1)
				break;
			vis[v] = true;
			for (int u = 0; u < n; u++) {

				if (dis[v] > dis[u] + len[u][v]) {
//				变了路，那么路变了
					ro[v] = ro[u];
//				resc[v]=resc[u]

				} else if (dis[v] == dis[u] + len[u][v]) {
					ro[v] += ro[u];
				}
			}

		}
	}
	int []re;
	int st=1;
	void dij3() {
//		https://blog.csdn.net/qq_45915957/article/details/113485770
		PriorityQueue<Node>queue=new PriorityQueue<>();
		Arrays.fill(dis, INF);
//		queue.add(new Node(5,4));
		queue.add(new Node(st,0));
//		queue.add(new Node(2,3));
		
		while (!queue.isEmpty()) {
//		   System.out.println(queue.poll());
			int u=queue.poll().id;
			if(vis[u])continue;
			vis[u]=true;
			for (int v = 0; v < n; v++) {
				if(vis[v])continue;
				if(dis[v]>dis[u]+len[u][v]) {
					
				}else if(dis[v]==dis[u]+len[u][v]) {
					if(resc[v]<resc[u]+re[v]) {
						
					}
				}
				queue.add(new Node(v,dis[v]));
			}
			
		}
	}
	
	void dij3() {
//		https://blog.csdn.net/qq_45915957/article/details/113485770
		PriorityQueue<Node>queue=new PriorityQueue<>();
		Arrays.fill(dis, INF);
//		queue.add(new Node(5,4));
		queue.add(new Node(st,0));
//		queue.add(new Node(2,3));
		
		while (!queue.isEmpty()) {
//		   System.out.println(queue.poll());
			int u=queue.poll().id;
			if(vis[u])continue;
			vis[u]=true;
			for (Object ov:gLists[u]) {
				int v=(int)ov;
				if(vis[v])continue;
				if(dis[v]>dis[u]+len[u][v]) {
					
				}else if(dis[v]==dis[u]+len[u][v]) {
					if(resc[v]<resc[u]+re[v]) {
						
					}
				}
				queue.add(new Node(v,dis[v]));
			}
			
		}
	}
	
	void run() throws IOException {
//		BufferedReader reader=   	new BufferedReader(new InputStreamReader(System.in));
//		reader.readLine();
		gLists=new List[13];
		for (int i = 0; i < 11; i++) {
			gLists[i]=new ArrayList<>();
			System.out.println(gLists[i]);
		}
		for (int i = 0; i < n; i++) {
			gLists[i].add(i);
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		最短路 zuiduanl=new 最短路();
//		zuiduanl.dij3();
		zuiduanl.run();
	}
}
