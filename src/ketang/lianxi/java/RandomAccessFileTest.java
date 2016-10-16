package ketang.lianxi.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/10/16.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile=new RandomAccessFile("c:/t","rw")) {
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i*0.5);
            }
            randomAccessFile.seek(16L);
            System.out.println(randomAccessFile.readDouble());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
