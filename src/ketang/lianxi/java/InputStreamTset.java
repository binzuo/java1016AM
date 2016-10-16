package ketang.lianxi.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/10/16.
 */
public class InputStreamTset {
    public static void main(String[] args) {
        try {
            InputStream inputStream=new FileInputStream("C:/text.txt");
            int i;
            while ((i=inputStream.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
