import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {
	public static void main(String[] args) {
           try {
        	   //重定向
        	   System.setOut(new PrintStream("baiduwenku.txt"));
			URL url=new URL("http://www.baidu.com");
			System.out.println("Authority="+url.getAuthority());
			System.out.println("host"+url.getHost());
			System.out.println("path"+url.getPath());
			
			System.out.println("content"+url.getContent());
			URLConnection conn=url.openConnection();
			InputStream is=conn.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
