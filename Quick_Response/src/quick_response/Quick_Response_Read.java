/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick_response;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

/**
 *
 * @author Danish
 */
public class Quick_Response_Read {
    public static void main(String args[])throws WriterException,IOException,NotFoundException{
        try{
            String filePath="D:\\QR\\2.png";
            String charset="UTF-8";
            
            Map<EncodeHintType,ErrorCorrectionLevel> hintMap=new HashMap<EncodeHintType,ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            
            System.out.println("Data read froom QR code: "+ readQRCode(filePath,charset,hintMap));
        }catch(Exception e){e.printStackTrace();}
    }
    public static String readQRCode(String filePath,String charset,Map hintMap)throws FileNotFoundException,IOException,NotFoundException{
        
        BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(new FileInputStream(filePath)))));
        Result qrCodeResult=new MultiFormatReader().decode(binaryBitmap,hintMap);
        return qrCodeResult.getText();
    
    }
    
}
