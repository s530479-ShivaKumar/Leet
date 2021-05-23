package sample;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Class {
	public enum ShivaEnum {
		SHIVA, KUMAR;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Shiva";
		System.out.println(Base64.getEncoder().encodeToString(s.getBytes()));
		System.out.println(Base64.getEncoder().encodeToString(s.getBytes(StandardCharsets.UTF_8)));
		System.out.println(Base64.getEncoder().encode(s.getBytes()));
		System.out.println(Base64.getEncoder());
		
		String sh = null;
		
//		StringBuilder sb = new StringBuilder(5);
//		System.out.println(sb.capacity());
//		sb.append("shivakumar");
//		System.out.println(sb.capacity());
//		System.out.println(sb.toString());
//		sb.append(sh);
//		System.out.println(sb.toString());
//		System.out.println(sb.capacity());
//		System.out.println(sh);
		System.out.println(Boolean.valueOf(sh));
		
		ShivaEnum en = ShivaEnum.SHIVA;
		
		ShivaEnum en1 = null;
		
//		System.out.println(en.valueOf("SHIVA"));
		System.out.println(en1.valueOf(sh));

	}

}
