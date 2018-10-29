package com.github.kyriosdata.dsr;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DatasusFileReader {

	public Object generateEstablishmentResume(String url) throws Exception {
    	

    	ZipInputStream zipInputStream = getZipInputStream(url);
    	ZipEntry zipEntry = null;
    	
    	
    	 while ((zipEntry = zipInputStream.getNextEntry()) != null) {
    		 
    		 
    	        FileOutputStream fileOutputStream = new FileOutputStream(zipEntry.getName());
    	        for (int c = zipInputStream.read(); c != -1; c = zipInputStream.read()) {
    	        	fileOutputStream.write(c);
    	        }
    	        zipInputStream.closeEntry();
    	        fileOutputStream.close();
    	      }
    	
    	
    	return null;
	}

	private ZipInputStream getZipInputStream(String url) throws Exception {
		ZipInputStream zipInputStream = new ZipInputStream(getInputStream(url));
		
		return zipInputStream;
	}

	private InputStream getInputStream(String url) throws Exception, Exception {
		return getUrlConnection(url).getInputStream();
	}

	private URLConnection getUrlConnection(String url) throws Exception {
		URL urlObject = new URL(url);
    	URLConnection conectorURL = urlObject.openConnection();
    	
    	return conectorURL;
	}
}
