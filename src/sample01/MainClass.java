package sample01;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("헬로우 자바");
		
		System.out.println("수정하였음 !!");
		
		// 한줄 주석문 -> 컴파일 되지 않는다
		
		/*
		  범위 주석문
		  
		  html <!-- -->
		  
		  jsp  <%-- --%>
		  
		  mySQL --
		  
		  Python # or """ 주석 """
		  
		 */
		
		System.out.println("Hello World");	
		
		System.out.print("Hello");
		
		System.out.print("월드");
		
		// 기능 : escape sqeuence
		//     : \n(개행), \b(backspace), \"(""), \t(탭, 띄어쓰기), \\(\표현시)
		
		System.out.print("World\n");
		
		System.out.println("헬로\b우");
		
		System.out.println("\"Hello World\"");
		
		System.out.println("\tHello\tworld");
		System.out.println("\t월드\t헬로\"");
		
		System.out.println("\\헬로우 월드\\");
		
		System.out.printf("--%s-- \n", "Hello"); // Hello == 문자열(String)
		//                표현자료형   값
		
		System.out.println(1024);
		System.out.println("Hello" + "World");
	}

}
