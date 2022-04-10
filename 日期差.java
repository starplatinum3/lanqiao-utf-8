package lanqiao;

public class 日期差 {
	class Date {
		int y, m, d;
	}

	int[] mo;

//	int elapse(Date date1,Date date2) {
//	  date1.y--;
//	  
//	  for (int i = 1; i <13&&i<; i++) {
//		
//	}
//  }

	boolean isLeap(int y) {
		return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
	}

	int elapse(Date date) {
		int res = 0;
		date.y--;
		int m = date.m;
		int y = date.y;
//		每 4年 和每400年都会有闰年，但是每次4年会重复算每次400年的
//		% 是0 的，就+ ，不是的就是- （这是在背代码，不是真的理解）
//		4 100 400 变大 ，符号是+ - +
		res += y / 4 - y / 100 + y / 400 + y * 365+date.d;
		for (int i = 1; i < 13 && i < m; i++) {
			res += mo[i];
		}
		if (m > 2 && isLeap(date.y + 1)) {
			res++;
		}
		return res;
	}

	int elapse2(Date date) {
//		date.y--;
		int y = date.y - 1;
		int res = y / 4 - y / 100 + y / 400 + y * 365 + date.d;
		for (int i = 1; i <= 12 && i < date.m; i++) {
			res += mo[i];
		}
		if (date.m > 2 && isLeap(date.y))
			res++;
		return res;
	}

}
