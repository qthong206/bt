package BaiTapDeQuy;

public class Bai6 {
	public static int tichCacChuSo(int num) {
		if(num<10) return num;
		return num%10 * tichCacChuSo(num/10);
	}
	public static void main(String[] args) {
		System.out.println(tichCacChuSo(25));
		System.out.println(tichCacChuSo(253));
		System.out.println(tichCacChuSo(5));
		System.out.println(tichCacChuSo(2518));
	}
}
