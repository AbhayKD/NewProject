package com.Abhay.Practice;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.*;
import net.glxn.qrgen.image.*;


public class QRCodeGenerator {
	public static void main(String[] args)throws Exception {
		String details = "Abhay Dekate : COurse : B. Tech Computer Science";
		
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
		
		File f = new File("C:\\Users\\ABHAY DEKATE\\Desktop\\Java Practice\\MyChannel.jpg");
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();
	}
}
