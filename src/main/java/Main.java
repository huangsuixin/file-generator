import java.io.File;
import java.util.Scanner;

/**
 * @author huangsuixin
 * @version 1.0
 * @className Main
 * @date 2019/3/27 10:40
 * @description //TODO
 * @program garbage-generator
 */
public class Main {
    /**
     * 1GB
     */
    private static final long ONE_GB = 1024 * 1024 * 1024;

    private static final String FILE_NAME = "generator-file";

    public static void main(String[] args) {
        String path1 = FileUtils.getPath();
        System.out.println(path1);
        File file = new File(path1 + FILE_NAME);
        System.out.print("请输入要生成的文件大小(GB):");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        FileUtils.createFixLengthFile(file, ONE_GB * size);
    }


}
