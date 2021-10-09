package Files;

import java.io.File;

public class FileDetailes {

	public static void main(String[] args) {
		
        File f = new File("sree.txt");
        System.out.println(f.canWrite());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.canRead());
        System.out.println(f.length());
    
	}

}
