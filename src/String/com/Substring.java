package String.com;

public class Substring {

	public static void main(String[] args) {
		 String s="hello i am meghana";
		 System.out.println(s.substring(5));
		 System.out.println(s.substring(10,17));
		 System.out.println(s.replace('n','m'));
		 System.out.println(s.replaceAll("am","was"));
		 String s1="meghana";
		 String s2="apoorva";
		 String s3="dharani";
		 System.out.println(s1.equals(s2));
		 System.out.println(s1==s3);
		 String number="143";
		 int num=Integer.parseInt(number);
		 System.out.println(num);
			int a=456;
			String x=String.valueOf(a);
			System.out.println(x.concat(number));
			
			
			StringBuffer sb=new StringBuffer("meg");
			sb=sb.append("ad");
			System.out.println(sb);
			StringBuilder sb1=new StringBuilder("apo");
			sb1=sb1.append("mad");
			System.out.println(sb1);
	}

}


