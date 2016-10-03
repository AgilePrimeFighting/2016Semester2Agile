package com.prime.PDF.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

import javax.activation.MimetypesFileTypeMap;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.web.context.annotation.RequestScope;

import com.prime.PDF.model.PDF;


@ManagedBean
public class pdfDownload  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StreamedContent  pdfFile ; 
	
	public StreamedContent getPdfFile() 
	{
		System.out.println("get the pdf file.");
		return pdfFile;
	}

	public void setPdfFile(StreamedContent pdfFile) 
	{
		this.pdfFile = pdfFile;
	}

	public void downloadAction( PDF tempPDF )
   {
//		
		System.out.println("This is a download action.");
		File file = new File(tempPDF.getPDF_Name()) ;
		//pdfFile = new File () ;
//		System.out.println("filename " + tempPDF.getPDF_Name());
//	//	System.out.println("fileLength " + tempPDF.getFileContent());
//        //File tempFile = new File("C:/temp.txt");
//		FacesContext facesContext = FacesContext.getCurrentInstance();
//	    ExternalContext externalContext = facesContext.getExternalContext();
//	    externalContext.setResponseHeader("Content-Type", "pdf");
//	    //externalContext.setResponseHeader("Content-Length", tempPDF.getFileContent().length);
//	    externalContext.setResponseHeader("Content-Disposition", "attachment;filename=\"" + tempPDF.getPDF_Name() + "\"");
//	    try {
//			externalContext.getResponseOutputStream().write(tempPDF.getFileContent());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    facesContext.responseComplete();
	
		//System.out.println(x);
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream (file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream pdfInputStream = new ByteArrayInputStream(tempPDF.getFileContent() );

		// Read PDF contents and write them to the output
		byte[] bytesBuffer = new byte[2048];
		int bytesRead;
		try {
			while ((bytesRead = pdfInputStream.read(bytesBuffer)) > 0) {
				outputStream.write(bytesBuffer, 0, bytesRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Make sure that everything is out
		try {
			outputStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close both streams
		try 
		{
			outputStream.close();
			pdfInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        try 
        {
			pdfFile = new DefaultStreamedContent(new FileInputStream(file), new MimetypesFileTypeMap().getContentType(".pdf"));
		} catch (FileNotFoundException e)
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("finish download action.");
   }

	


}
