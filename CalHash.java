import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Scanner;

public class CalHash{

public static byte[] SHA1Checksum(InputStream is) throws Exception{
	byte[] buffer = new byte[1024];
	MessageDigest complete = MessageDigest.getInstance("SHA-1");
	int numRead = 0;
	do {
		numRead = is.read(buffer);
		if (numRead > 0) {
			complete.update(buffer,0,numRead);
		}
		
	} while(numRead != -1);
	is.close();
	return complete.digest();
}

//深度遍历文件夹
public static void dfs(String s) {
	File dir = new File(s);
	File[] fs = dir.listFiles();
	for(int i = 0;i < fs.length;i++) {
		if(fs[i].isFile()) {
			System.out.println("file" + fs[i].getName());
			dfs(s + File.separator + fs[i].getName());
		}
	}
}

public static void main(String[] args) {
	System.out.println("Please enter the path of the file: ");
	Scanner s = new Scanner(System.in); 
	try {
		dfs(s.toString());
	} catch(Exception e) {
		e.printStackTrace();
		s.close();
	}
	
	System.out.println("Please enter the name(with file suffix) of the file: ");
	try {
		Scanner f = new Scanner(System.in);
		File file = new File(f.toString());
		FileInputStream is = new FileInputStream(file);
		byte[] sha1 = SHA1Checksum(is);
		
		String result = "";
		for (int i = 0; i < sha1.length; i++) {
			result += Integer.toString(sha1[i]&0xFF, 16);
		}
		f.close();
		System.out.println(result);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}


