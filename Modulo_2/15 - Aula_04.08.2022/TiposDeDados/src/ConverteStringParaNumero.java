public class ConverteStringParaNumero {

	public static void main(String[] args) {
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
		
		String str2 = "456.78f";
		float num2 = Float.parseFloat(str2);
		System.out.println(num2);
		
		String str3 = "789.01";
		double num3 = Double.parseDouble(str3);
		System.out.println(num3);
	}

}
