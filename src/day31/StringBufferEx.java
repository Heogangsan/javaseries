package day31;

public class StringBufferEx {

	public static void main(String[] args) {
		String str = "text";
		StringBuffer buffer = new StringBuffer("text");
		
		str.replace('t', 'T');
		System.out.println(str);
		
		buffer.replace(1, 3, "ES");
		System.out.println(buffer);
	}

}
