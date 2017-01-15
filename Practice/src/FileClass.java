import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./test.txt");
        File backup = new File("test.txt.bak");
        backup.delete();
        file.renameTo(backup); //Location 1
	}

}
