import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
public static void main(String[] args) {
	FileOutputStream fo=null;
	try {
//		fo=new FileOutputStream("abc",true);
//		fo.write("hello".getBytes());
//		fo.write("abcdefghijklmnopqrstuvwxyz".getBytes());
		fo=new FileOutputStream("abc",true);
		fo.write("123".getBytes());
		fo.write("abcdefghijklmnopqrstuvwxyz".getBytes());
		fo.write("456".getBytes());
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			if(fo!=null) {
				fo.close();	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
