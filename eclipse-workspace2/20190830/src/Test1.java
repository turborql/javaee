import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test1 {
	public static void main(String[] args) {
		// 随机访问文件的读取和写入
		RandomAccessFile rf=null;
		try {
			rf = new RandomAccessFile("a","rw");
			rf.seek(4);
			rf.write("hello".getBytes());
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rf!=null) {
				try {
					rf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
