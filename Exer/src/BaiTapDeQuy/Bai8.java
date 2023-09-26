package BaiTapDeQuy;

public class Bai8 {
	public static int tongCacChuSoChan(int num) {
		if (num == 0) {
			return 0;
		}

		int chuDau = num % 10;
		if (chuDau % 2 == 0) {
			return chuDau + tongCacChuSoChan(num / 10);
		} else {
			return tongCacChuSoChan(num / 10);
		}
	}

	public static void main(String[] args) {
		System.out.println(tongCacChuSoChan(12));
		System.out.println(tongCacChuSoChan(123));
		System.out.println(tongCacChuSoChan(1234567));
		System.out.println(tongCacChuSoChan(124683));
	}
}
