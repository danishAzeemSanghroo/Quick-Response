/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick_response;

import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.HashMap;
import java.util.Map;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Danish
 */
public class Quick_Response_Write {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String qrCodeData="Danish Azeem";
            String filePath="D:\\QR\\qr.png";
            String charset="UTF-8";
            int size=200;
            Map<EncodeHintType,ErrorCorrectionLevel> hintMap=new HashMap<EncodeHintType,ErrorCorrectionLevel>();
            
            hintMap.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.L);
            
            BitMatrix matrix=new MultiFormatWriter().encode(
                    new String(qrCodeData.getBytes(charset),charset),
                    BarcodeFormat.QR_CODE,size,size,hintMap); 
            
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.')+1),new File(filePath));
            
            System.out.println("QR code image created successfully");
            
        }catch(Exception e){e.printStackTrace();}
        
    }
    
}
