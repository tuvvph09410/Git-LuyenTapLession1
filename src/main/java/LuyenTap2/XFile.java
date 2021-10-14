/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTap2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author vuvantu
 */
public class XFile {

    public static void writeFile(String path, Object o) {
        try {
            FileOutputStream fps = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fps);

            oos.writeObject(o);

            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Object readFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            ois.close();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
             throw new RuntimeException();
        }
    }
}
