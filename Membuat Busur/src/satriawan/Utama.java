/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satriawan;
import javax.swing.JFrame;
/**
 *
 * @author Satriawan
 */
public class Utama {
    public static void main (String args[]){
        JFrame frame = new JFrame("Menggambar Busur");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panggil ok = new panggil();//menciptakan gambar dari class panggil.java
        frame.add(ok);//menambhkan panggil pada frame
        frame.setSize(300,300);//menetapkan ukuran frame
        frame.setVisible(true);//menampikan frame
    }//akhir main
}//akhir kelas Utama
