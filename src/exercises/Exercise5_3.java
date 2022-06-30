package exercises;

public class Exercise5_3 {
	public static void main(String[] args) {
		String title = "久しぶりです";
		String address = "a@example.com";
		String text = "来月遊びませんか？";
		email(address, text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
