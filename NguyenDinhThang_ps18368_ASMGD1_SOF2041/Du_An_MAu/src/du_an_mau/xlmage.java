/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package du_an_mau;


import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author dinh thang
 */
public class xlmage {
    public static Image getAppicon(){
        URL url = xlmage.class.getResource("/anh/fpt.png");
        return new ImageIcon(url).getImage();
    }
}
