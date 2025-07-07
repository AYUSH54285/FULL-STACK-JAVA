//11/6/25


//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		catch(ArithmeticException e) {
//				
//		}
//		
//	}
//}
//--> it is valid because it is following the order and finally is optional




//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		catch(ArithmeticException e) {
//				
//		}
//		catch(NullPointerException e) {
//			
//		}
//		
//	}
//}
//--> it is valid beacuse multiple catch is allowed and parameters are also correct 



//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		catch(ArithmeticException e) {
//				
//		}
//		catch(ArithmeticException e) {
//			
//		}
//		
//	}
//}
//--> it is invalid because ArithmeticException is written in two catch and first one will execute and second is unreachable



//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		
//	}
//}
//--> only try is not allowed , only allowed with resource



//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		catch(Exception e) {
//				
//		}	
//	}
//}
//--> only catch is not allowed because it is not following the order also



//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		System.out.println("hello");
//		catch(Exception e) {
//			
//		}
//		
//	}
//}
//--> no statement is allowed between the try catch and finally


//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		catch(Exception e) {
//				
//		}
//		finally {
//			
//		}
//		
//	}
//}
//--> very good :) 



//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		finally {
//			
//		}
//		
//	}
//}
//--> correct because try-finally is allowed



//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		finally {
//			
//		}
//		finally {
//			
//		}
//		
//	}
//}
//--> more than 1 finally is not allwoed

//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		catch(Exception e) {
//				
//		}
//		System.out.println("Hello");
//		finally{
//			
//		}
//		
//	}
//}
//--> no statement is between try catch finally is allowed


//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		finally{
//			
//		}
//		catch(Exception e) {
//				
//		}	
//	}
//}
//--> wrong order is not allowed


//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		finally{
//			
//		}
//	}
//}
//--> only finally is not allowed


//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			try {
//				
//			}
//			catch(Exception e) {
//				
//			}
//		}
//		catch(Exception e) {
//				
//		}	
//	}
//}
//--> correct because nested is good for multiple exception in first try


//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		catch(Exception e) {
//			try {
//				
//			}
//			finally {
//				
//			}
//		}	
//	}
//}
//--> correct syntax and order



//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		catch(Exception e) {
//			try {
//				
//			}
//			catch(Exception e) {
//				
//			}
//			
//		}	
//		finally {
//			finally {
//				
//			}
//		}
//	}
//}
//--> finally -> finally not allowed 



//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		finally {
//			
//		}
//		try {
//			
//		}
//		catch(Exception e){
//			
//		}
//	}
//}
//--> not valid


//package com.pack1;
//
//public class Test1 {
//	public static void main(String[] args) {
//		try {
//			
//		}
//		catch(Exception e){
//			
//		}
//		finally {
//			try {
//				
//			}
//			catch(Exception e){
//				
//			}
//			finally {
//				
//			}
//		}
//		
//	}
//}
//--> valid
