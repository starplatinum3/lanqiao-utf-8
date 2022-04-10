package lanqiao;

public class 最大连续子序列 {
	int []a;
  void run() {
	  int newSt,newEnd;
	  int sum=0;
	  int max=0,start=0;
	  for (int i = 0; i < a.length; i++) {
		if(a[i]<0) {
			sum=0;
			start=a[i];
		}
		sum+=a[i];
		if(sum>max) {
			max=sum;
			newSt=start;
			newEnd=a[i];
		}
		
	}
  }
}
