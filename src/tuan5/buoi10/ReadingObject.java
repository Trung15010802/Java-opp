package tuan5.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import tuan3.buoi6.bai6.HangThucPham;

public class ReadingObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inFile = new FileInputStream("htp.dat");

        ObjectInputStream objIn = new ObjectInputStream(inFile);

        HangThucPham htp = (HangThucPham) objIn.readObject();
        System.out.println(htp);


        objIn.close();
    }
}
