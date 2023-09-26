package BaiTapDeQuy;

public class Bai5 {
	public static int tongCacChuSo(int num) {
		if(num<10) return num;
		return num%10 + tongCacChuSo(num/10);
	}
	public static void main(String[] args) {
		System.out.println(tongCacChuSo(25));
		System.out.println(tongCacChuSo(253));
		System.out.println(tongCacChuSo(5));
		System.out.println(tongCacChuSo(2518));
	}
}
