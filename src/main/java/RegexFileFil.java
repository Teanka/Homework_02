import org.apache.commons.io.filefilter.RegexFileFilter;

import java.io.File;
import java.io.FileFilter;

public class RegexFileFil {

    public static void main(String[] args) {
        File dir = new File(".");
        FileFilter fileFilter = new RegexFileFilter("^.*[tT]est(-\\d+)?\\.java$");
        File[] files = dir.listFiles(fileFilter);
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
