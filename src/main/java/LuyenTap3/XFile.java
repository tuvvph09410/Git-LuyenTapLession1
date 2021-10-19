/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author vuvantu
 */
public class XFile {

    public static void writeFile(String path, Object o) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Object readFile(String path) {
        try {
            FileInputStream fps = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fps);
            Object o = ois.readObject();
            ois.close();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
