package ketang.lianxi.java;

import java.io.*;

/**
 * Created by Administrator on 2016/10/16.
 */
public class ReaderAndWriterTest {
    public static void main(String[] args) {
        //Reader reader;
        try (
                Reader reader=new FileReader("c:/text.txt");
                Writer writer=new FileWriter("c:/textnew2.txt")
        ){
            int i;
            while ((i=reader.read())!=-1){
                System.out.print((char) i);
                writer.write(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //try (Writer writer=new FileWriter("c:textnew.txt")){
//
//
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}

    }
}
