import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] atgs){
		String ans=new String();
		Scanner input = new Scanner(System.in);
		BSort BS=new BSort();
		
		System.out.printf("Please input numbers sperate by comma:");
		String str = input.next();
		
		System.out.println(str);
		System.out.println(ans);
	}
}

class BSort{
	int data1[];
	String ret=new String();
	
	String sort(String a){
		int len;
		len=a.length();
		int i, j, temp, q;
		int commapos;
						
		data1=new int[len];
				
		q=0;
		do{
			commapos=getcomma(a);
			if(commapos>0){				
				data1[q]=Integer.valueOf(a.substring(0, commapos));				
				q++;	
				a=a.substring(commapos+1, a.length());
				System.out.println("a=" + a);
				
			}			
			//System.out.println(data1[i]);
		}while(commapos != 0);
		data1[q]=Integer.valueOf(a.substring(0, a.length()));	
		
		len=q+1;
		
		for(i=0;i<len-1;i++){
			for(j=0;j<len-1-i;j++){			
				if(data1[j]>data1[j+1]){
					temp=data1[j];
					data1[j]=data1[j+1];
					data1[j+1]=temp;
				}									
			}
		}
		
		ret="";
		for(i=0;i<len;i++){	
			//System.out.printf("%d\n", data1[i]);
			if(i==0){
				ret=ret + String.valueOf(data1[i]);
			}
			else{
				ret="," + ret + String.valueOf(data1[i]);
			}
			
		}
		
		return ret;
	}
	
	int getcomma(String a){
		int i,pos;
		char c1;
		
		pos=0;
		//to see if there had a dot
		for(i=0;i<a.length();i++){
			c1=a.charAt(i);
			if(c1==','){
				pos=i;
				break;
			}
		}
		
		return pos;
	
	}
	
}
