//package dodo;
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner input=new Scanner(System.in);
//	    int a=input.nextInt(),b=input.nextInt();
//	    System.out.println(a+" + "+b+" = "+(a+b));
//	    System.out.println(a+" - "+b+" = "+(a-b));
//	    System.out.println(a+" * "+b+" = "+(a*b));
//	    System.out.println(a+" / "+b+" = "+(a/b));
//        System.out.println(a+" % "+b+" = "+(a%b));
//	    input.close();
//		Scanner in=new Scanner(System.in);
//		int a1=in.nextInt(),a2=in.nextInt(),a3=in.nextInt(),a4=in.nextInt();
//		int Sum=0;
//		double Average=0;
//		Sum=a1+a2+a3+a4;
//		Average=Sum*1.0/4;
//		System.out.printf("Sum = %d; Average = %.1f",Sum,Average);
//		in.close();
//		Scanner in=new Scanner(System.in);
//		double F;
//		F=in.nextDouble();
//		double C;
//		C=9*1.0/5*F+32;
//		System.out.printf("%.1f",C);
//		in.close();
//		
//	}
//
//}


//package dodo;
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in=new Scanner(System.in);
//		int a;
//		boolean b;
//		System.out.println(in.next());//原样输出
//		a=in.nextInt();
//		System.out.println(a);//若输入为非整形会报错
//		b=in.hasNext();//布尔类型&永真
//		System.out.println(b);
//		b=in.hasNextInt();//要看具体输入
//		System.out.println(b);
//		in.close();
//	}
//	}

//package dodo;
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//Scanner in=new Scanner(System.in);
//int cm;
//cm=in.nextInt();
//double foot,inch,n;
//foot=cm*1.0/30.48;
//n=Math.floor(foot);
//inch=(foot-n)*12;
//System.out.printf("%.0f %.0f",Math.floor(foot),Math.floor(inch));
//    }
//}

//package dodo;
//public class Main{
//	public static void main(String[] args) {
//	int i=6;
//	i+=i-1;
//	System.out.println(i);
//	}
//	}

//package dodo;
//public class Main{
//	public static void main(String[] args) {
//	String str="123";
//	int x=4,y=5;
//	str=str+x+y;
//	System.out.println(str);
//	}
//	}


//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//	Scanner in=new Scanner(System.in);
//	int sum=0,i=0;
//	int[]arr=new int[4];
//	sum=in.nextInt();
//	in.close();
//		for(i=0;i<3;i++) {
//			if(sum<=0)
//				break;
//			arr[i]=sum%10;
//			sum=sum/10;
//		}
//		int k=0;
//	for(int j=0;j<i;j++) {
//		if(arr[j]==0&&k==0)
//			continue;
//		System.out.print(arr[j]);
//		k=1;
//	}
//	}
//	}

//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//	Scanner in=new Scanner(System.in);
//	int start=in.nextInt();
//	int end=in.nextInt();
//	int hour=0,minute=0;
//	int sum=0;
//	sum=end/100*60+end%100-start/100*60-start%100;
//	hour=sum/60;
//	minute=sum%60;
//	if(hour<10)
//		System.out.print("0"+hour+":");
//	else
//		System.out.print(hour+":");
//	if(minute<9)
//		System.out.print("0"+minute);
//	else
//		System.out.print(minute);
//	in.close();
//	}
//
//}


//package dodo;
//import java.util.Scanner;
//public  class Main{
//	public static void main(String[] args) {
//	Scanner in=new Scanner(System.in);
//	int a=in.nextInt();
//	System.out.printf("%.2f",(Math.cos(50.0/180*Math.PI)+Math.sqrt(37.5))/(a+1));
//	in.close();
//	}
//}

//package dodo;
//import java.util.Scanner;
//public  class Main{
//	public static void main(String[] args) {
//	Scanner in=new Scanner(System.in);
//	double h,r;
//	h=in.nextDouble()*1.0/100;
//	r=in.nextDouble()*1.0/100;
//	double v;
//	v=Math.PI*r*r*h;
//	System.out.println(Math.ceil(v/20));//向上取整//floor 向下取整
//	in.close();
//	}
//}

//package dodo;
//import java.util.Scanner;
//public class Main{
//   public static void main(String[] args) {
//	 boolean n=false,m=true;//java中布尔类型只有true 和false，没有0和1
//	 System.out.println(n);
//	 System.out.println(m);
//	 int i=1;
//	 if(i) {
//		 //不可以放在if中
//	 }
//}
//}

//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args){
//		Scanner in=new Scanner(System.in);
//		int a=0,b=0;
//		a=in.nextInt();
//		b=in.nextInt();
//		if(a>b)
//			System.out.println("true");
//		else
//			System.out.println("false");
//		if(a<b)
//			System.out.println("true");
//		else
//			System.out.println("false");
//		if(a==b)
//			System.out.println("true");
//		else
//			System.out.println("false");
//		if(a!=b)
//			System.out.println("true");
//		else
//			System.out.println("false");
//		in.close();
//	}
//}


//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		int num=0;
//		num=in.nextInt();
//		System.out.printf("%d divisible by 5 and 6?",num);
//		System.out.println(num%5==0&&num%6==0);
//		System.out.printf("%d divisible by 5 or 6?",num);
//		System.out.println(num%5==0||num%6==0);
//		System.out.printf("%d divisible by 5 or 6,but not both?",num);
//		System.out.println((num%5==0&&num%6!=0)||(num%5!=0&&num%6==0));
//	}
//}


//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		double a=0,b=0,c=0;
//		a=in.nextDouble();
//		b=in.nextDouble();
//		c=in.nextDouble();
//		if(a+b<=c||a+c<=b||b+c<=a)
//			System.out.println("Invalid");
//		else
//			System.out.println(a+b+c);
//	}
//}


//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		int a=0,b=0,c=0;
//		a=in.nextInt();
//		b=in.nextInt();
//		c=in.nextInt();
//		if(a>b) {
//			if(b>c)
//				System.out.println(b);
//			else {
//				if(a>c)
//					System.out.println(c);
//				else
//					System.out.println(a);
//			}
//		}
//		else {
//			if(b<c)
//				System.out.println(b);
//			else {
//				if(a>c)
//					System.out.println(a);
//				else
//					System.out.println(c);
//			}
//		}
//		in.close();
//	}
//}


//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		int time=0;
//		time=in.nextInt();
//		int hour=0,minute=0;
//		hour=time/100;
//		minute=time%100;
//		int newhour=0;
//		newhour=(hour-8)>=0?(hour-8):(24+hour-8);
//		if(newhour==0) {
//			if(minute>=10)
//				System.out.println(minute);
//			else
//				System.out.println("0"+minute);
//		}
//		else {
//			if(minute>=10)
//				System.out.printf("%d%d",newhour,minute);
//			else
//				System.out.println(newhour+"0"+minute);
//		}
//		
//		in.close();
//	}
//}


//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		String input=in.nextLine();
//		int year=Integer.parseInt(input.split("/")[0]);
//		int month=Integer.parseInt(input.split("/")[1]);
//		int day=Integer.parseInt(input.split("/")[2]);
//		if(month==1||month==2) {
//			month+=12;
//			year-=1;
//		}
//		int h=0,q=day,m=month,k=0,j=0;
//		j=year/100;
//		k=year%100;
//		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
//		switch(h) {
//		case 0:System.out.println("Saturday");break;
//		case 1:System.out.println("Sunday");break;
//		case 2:System.out.println("Monday");break;
//		case 3:System.out.println("Tuesday");break;
//		case 4:System.out.println("Wednesday");break;
//		case 5:System.out.println("Thurssday");break;
//		case 6:System.out.println("Friday");break;
//		}
//		in.close();
//	}
//}

//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		int []arr=new int[100];
//		int k=0,i=0,sum=0,l=0;
//		k=in.nextInt();
//		if(k==0)
//			System.out.println("No input");
//		else {
//		for(i=0;k!=0;i++) {
//			arr[i]=k;
//			sum+=arr[i];
//			if(arr[i]>0)
//				l+=1;
//			k=in.nextInt();
//		}
//		System.out.println(l);
//		System.out.println(i-l);
//		System.out.println(sum);
//		System.out.printf("%.2f",sum*1.0/i);}
//		in.close();
//	}
//}


//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		while(in.hasNextInt()) {
//			int a=in.nextInt();
//			int b=in.nextInt();
//			int k=0;
//			k=a>b?b:a;
//			for(int i=k;i>=1;i--) {
//				if(a%i==0&&b%i==0) {
//					System.out.println(i);
//					break;
//				}
//			}
//		}
//		in.close();
//	}
//}

//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//	    while(in.hasNextInt()) {
//	    	int a=in.nextInt();
//	    	int b=in.nextInt();
//	    	for(int i=a;i<=b;i++) {
//	    		for(int j=i;j>=2;j--) {
//	    			if(i%j==0&&j!=i)
//	    				break;
//	    			if(j==2)
//	    				System.out.print(i+" ");
//	    		}
//	    	}
//	    }
//		in.close();
//	}
//}

//package dodo;
//import java.util.Scanner;
//public class Main{
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//	    int y=in.nextInt();
//	    int a=0,b=0,c=0,k=0;
//	    for(a=1;a<=9&&k!=1;a++) {
//	    	for(b=0;b<=9&&k!=1;b++) {
//	    		for(c=0;c<=9&&k!=1;c++) {
//	    			if((a*10+b)*c+a==y) {
//	    				System.out.println(a+" "+b+" "+c);
//	    				k=1;
//	    			}
//	    		}
//	    	}
//	    }
//	    if(k==0)
//	    	System.out.println("No solution");
//		in.close();
//	}
//}

//package dodo;
//public class Main{
//	public static void main(String[] args) {
//		for(char man = 'A'; man <= 'D'; ++man) {
//		    int count = 0;
//		    if(man != 'A')
//		        ++count;
//		    if(man == 'C')
//			++count;
//		    if(man == 'B')
//			++count;
//		    if(man != 'B')
//			++count;
//		    if(count == 3) {
//			System.out.println(man);
//			break;
//		    }
//		}
//	}
//}

package dodo;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int[]arr1=new int[20],arr2=new int[20];
		int i=0;
		for(i=0;num>0;i++) {
			arr1[i]=num%10;
			num/=10;
		}
		for(int j=1;j<=i;j++) {
			if((j%2==0&&arr1[j-1]%2==0)||(j%2!=0&&arr1[j-1]%2!=0))
				arr2[j-1]=1;
			else
				arr2[j-1]=0;
		}
		int sum=0;
		for(int k=0;k<=i;k++) {
			sum+=arr2[k]*Math.pow(2,k);
		}
		System.out.println(sum);
		in.close();
	}
}