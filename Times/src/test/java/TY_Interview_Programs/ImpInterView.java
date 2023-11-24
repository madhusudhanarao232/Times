package TY_Interview_Programs;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class ImpInterView {
	@Test
	public void retreiveDate() {
		String s="My date of birth is 2006-11-13 id fghg aJGJghj jkhhj jkh";
		String sp []=s.split(" ");
		StringBuilder b=new StringBuilder();
		String sd=" ";
		for(int i=0;i<sp.length;i++) {
			String st = sp[i];
			for(int j=0;j<st.length();j++) {
				if(st.charAt(j)>='0'&&st.charAt(j)<='9'||st.charAt(j)=='-') {
					b.append(st.charAt(j));
					sd=sd+st.charAt(j);
				}
			}
		}
		System.out.println(b+" | "+sd);

	}
	@Test
	public void A2b3c2d2a2b1() {
       String s="aaaabbcdddaabb";
      //char []ch=s.toCharArray();
      StringBuilder b=new StringBuilder();
      String st=" ";
      int count=1;
      for(int i=0;i<s.length();i++) {
    	 if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)) {
    		 count++;
    	 }
    	 else {
    		 b.append(s.charAt(i)).append(count);
    		 st=st+s.charAt(i)+count;
    		 count=1;
    	 }
      }
      System.out.println(b.toString());
      System.out.println(st.trim());
	}
	@Test
	public void a5b3c1d2() {
		String s="aabcddaaabb";
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				if(i>j) {
					break;
				}
				count++;
			}
			}
			if(count>=1)
			System.out.print(s.charAt(i)+""+count);
		}
		System.out.println();
	}
	@Test
	public void shareScreen() {
		String s="share screen";//s1h1a1r1e1 1s2c1r2e2e3n1
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				if(i<j) {
					break;
				}
				count++;	
			}
			
			}
			
			if(count>=1)
				System.out.print(s.charAt(i)+""+count);
		
		}
		System.out.println();
	}
	@Test
	public void aaaabbcddd() {
		String s="a3b2cd4ef2";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int n=0;
				if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
					if(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9') {
						n=s.charAt(i+1)-48;
					}
					else
						n=1;
				}
			for(int k=1;k<=n;k++) {
				System.out.print(ch);
			}
		}
		System.out.println();
	}
	@Test(priority=11)
	public void chocolateWrapper() {
		int n=72,sum=0,temp=n;
		while(n>=6) {
			n=n/6;
			sum=sum+n;
		}
		sum=sum+temp;
		System.out.println(sum);
	}
	@Test
	public void printAtoZWhenEnterThoseRespNumber() {
		int n=17;
		for(int i=1;i<=n;i++) {
			//if(n==i)
				System.out.print((char)(i+64)+" ");
		}
		System.out.println();
	}
	
	@Test
	public void googleVoice() throws Exception {
		//Create a map to store  preferences 
		HashMap<String, Integer> prefs = new HashMap<String, Integer>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.managed_default_content_settings.media_stream", 1);
		//prefs.put("profile.managed_default_content_setting_values.notifications", 2);   
		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver=new ChromeDriver(options);
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='callout']"));
		high(frame, driver);
		// switch to frame
		driver.switchTo().frame(frame);
		WebElement sign = driver.findElement(By.xpath("//c-wiz//button"));
		high(sign, driver);
		a.click(sign).perform();
		// switch back to default content
		driver.switchTo().defaultContent();

		WebElement voice = driver.findElement(By.xpath("//*[local-name()='svg' and @class='goxjub']"));
		high(voice, driver);
		a.click(voice).perform();
		Thread.sleep(4000);
		driver.quit();
	}
	public void high(WebElement e,WebDriver driver) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('style','background: green; border: 2px solid black;');", e);
	}
	@Test
	public void continuePrintNumbers() {
		int a[]= {2,5,8};
		for(int i=1;i<=10;i++) {
			if(a[0]==i||a[1]==i||a[2]==i) {
				continue;
			}
			System.out.println(i);
		}
	}
	@Test
	public void continuePrintNumbers1to100() {
		int a[]={22,53,61,95,4,44,13,37,75};
		boolean flag=true;
		for (int i=1;i<=100;i++){
			for(int j=0;j<a.length;j++) {
				if(a[j]==i){
					flag=false;
					break  ;
				}
			}
			if(flag==true) {
				System.out.print(i+" ");
			}
			flag=true;

		}	
	}
	@Test
	public void subStringPro() {
		String s="Bharath";
		for (int i =0;i<s.length();i++) {
			for (int j=i;j<s.length();j++) {
				String sub = s.substring(i,j);
				System.out.println(sub);
			}
		}
	}
	@Test
	public void swapping() {
		int a=45,b=99;
		//	int temp=a;
		//	a=b;
		//	b=temp;
		a=a+b;//30
		b=a-b;// 30-20=10
		a=a-b;
		System.out.println(a+" "+b);

	}
	@Test
	public void generateOTP() {
		Random r=new Random();
		int numRan = r.nextInt(999);
		String Up = RandomString.make(1);
		Up=Up.toUpperCase();
		String small = RandomString.make(4);
		small=small.toLowerCase();
		final String sp="!@#$%^&*()-=+_[]{};:\'/?.>,<|";	
		System.out.println(Up+""+small+""+numRan);

	}
	@Test
	public void nonRepeatedNumIndex() {
		int a[]= {7,2,6,7,3,5,6,9,2,};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for (int j = 0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;				
				}
			}
			if(count==1) {
				System.out.println(i);
				break;
			}
			else if(count>1){
				System.out.println(-1);
			}
		}
	}
	@Test
	public void remove1stAndLastCharThoroughly() {
		String s="abcdefg";
		int f=0, l=s.length();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.println(s.substring(f,l));
				f++;
			}
			else {
				System.out.println(s.substring(f,l));
				l--;
			}

		}
	}
	@Test
	public void printA2B3C1A2B2() {
		String s="aaaaabbbcaabbeeeeeaaaaaa";
		String compressed = compressString(s);
		System.out.println(compressed);
	}
	public static String compressString(String input) {
		StringBuilder b = new StringBuilder();
		int count = 1;
		for (int i=0;i<input.length();i++) {
			if(i+1<input.length()&& input.charAt(i)==input.charAt(i+1)){
				count++;
			} else {
				b.append(input.charAt(i)).append(count);
				count = 1;
			}
		}

		return b.toString();
	}
	@Test	    
	    static void Anagram() { 
		  String s1="keep";
		  String s2="peek";
	        //String s1 = str1.replaceAll("\\s", "");  
	        //String s2 = str2.replaceAll("\\s", "");  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	         }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	    }  
	@Test
	public void panagram() {
		String s="The quick brown fox jumps over the lazy dog";
        String st=isPanagram(s);
        System.out.println(st);
	}
	public static String isPanagram(String s) {
		int n[]=new int[26];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				n[ch-97]++;
			}
			else if(ch>='A'&&ch<='Z') {
				n[ch-65]++;
			}
		}
			for(int i=0;i<n.length;i++) {
				if(n[i]==0) {
					return "NOT PANAGRAM";
				}
			}
			return "PANGRAM";
	}
	@Test
	public void oneWordRev1wordkeepStraight() {
		String s="my name is madhu and Student";
		String st="";
		String ch[]=s.split("\\s");
		for(int i=0;i<ch.length;i++) {
			if(i%2==0) {
			 for(int j=ch[i].length()-1;j>=0;j--) {
				st=st+ch[i].charAt(j);
			 }
			}
			else {
				st=st+ch[i];
			}
           st=st+" ";
		}
		System.out.println(st);
	}
	@Test
	public void sliderBox() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_HistoryAutoSuggest_6_0_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_6_0_na_na_na&as-pos=6&as-type=HISTORY&suggestionId=mobiles&requestId=9bf86471-381e-4f05-bef1-df9d107bb0da&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D15000");
		WebElement rr = driver.findElement(By.xpath("//div[@class='_12FhcQ']"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDropBy(rr, (int) -143.276, 0);
	}
	   
}
