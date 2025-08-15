/*
 * Creado el 8/11/2005
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.trxonline.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.asic.trxonline.sma.strings.AbstractTrxString;
import com.asic.trxonline.tramas.TramaOrganizer;
import com.general.utils.SimpleReader;

/**
 * @author Javier
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class ReadTLogTest {
	
	

	public static void main(String[] args) {
		String fileName_ = "C:\\ASIC\\proyectos\\eamtranc.dat";
		File file_ = new File(fileName_);
		try {
			//FileReader fr_ = new FileReader(file_);
			
			//BufferedReader br_ = new BufferedReader(fr_);
			
			FileInputStream fis_ = new FileInputStream(file_);
			SimpleReader br_ = new SimpleReader(fis_);
			
			String line_ = null;
			while ((line_ = br_.readLine()) != null){
				System.out.println("=========================================================");
				//line_ = removeQuotes(line_);
				System.out.println("Line of " + line_.length() + " ch");
				printChars(line_);
				
				AbstractTrxString[] array_;
				try {
					array_ = TramaOrganizer.getTrxTramaArray(line_, 450, 1);
					for (int i = 0; i < array_.length; i++) {
							System.out.println(array_[i]);
					}					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				
				
//				for(StringTokenizer t1 = new StringTokenizer(line_,",");t1.hasMoreTokens();){
//					String record_ = removeQuotes(t1.nextToken());
//					//System.out.println("record of " + record_.length() + " ch");
//					//printChars(record_);
//					System.out.println(TramaOrganizer.getTrxTrama(record_));
//					/*
//					for(StringTokenizer t2 = new StringTokenizer(record_,":");t2.hasMoreTokens();){
//						String field_ = removeQuotes(t2.nextToken());
//						//System.out.println("field of " + field_.length() + " ch");
//						String newStr_ = printChars(field_);
//					}
//					*/
//				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static String removeQuotes(String pStr){
		if(pStr.startsWith("\""))
			pStr = pStr.substring(1);
		if(pStr.endsWith("\""))
			pStr = pStr.substring(0,pStr.length() - 1);
		return pStr;
	}
	
	public static String printChars(String pStr){
		char[] array_ = pStr.toCharArray();
		//byte[] array_ = pStr.getBytes();
		for (int i = 0; i < array_.length; i++) {
			System.out.print((int)array_[i] + " ");
			if(array_[i]<0)
				array_[i]+=256;
		}
		System.out.println();
		return new String(array_);
	}
	
}
