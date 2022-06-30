package exercises;

public class Exercise5_4 {
	public static void main(String[] args) {
		double TriangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積：" + TriangleArea + "平方cm");
		double CircleArea = calcCircleArea(5.0);
		System.out.println("円の面積：" + CircleArea + "平方cm");
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double result = (bottom * height) / 2;
		return result;
	}
	
	public static double calcCircleArea(double radius) {
		double result = radius * radius * 3.14;
		return result;
	}
}
