package ketang.lianxi.java;

import java.io.*;

/**
 * Created by Administrator on 2016/10/16.
 */
public class OutputStreamTest {
    public static void main(String[] args){
        OutputStream outputStream=null;
        try {
            outputStream = new FileOutputStream("C:/text1.txt");
            outputStream.write(122);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
