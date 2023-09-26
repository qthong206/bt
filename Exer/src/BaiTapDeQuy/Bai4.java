package BaiTapDeQuy;

public class Bai4 {
public static int demChuSo(int num) {
	if(num<10) return 1;
	else {
		return 1 + demChuSo(num/10);
	}
}
public static void main(String[] args) {
	System.out.println(demChuSo(123));
	System.out.println(demChuSo(12));
	System.out.println(demChuSo(1234));
	System.out.println(demChuSo(12345));
	System.out.println(demChuSo(3));
}
}
