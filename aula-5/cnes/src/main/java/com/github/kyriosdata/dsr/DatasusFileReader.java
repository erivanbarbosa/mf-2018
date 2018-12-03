package com.github.kyriosdata.dsr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DatasusFileReader {
	
	private InputStreamReader inputStreamReader;

	public Object generateEstablishmentResume(String url) throws Exception {
		URLConnection urlConnection = getUrlConnection(url);
		InputStream inputStream =  urlConnection.getInputStream();
		ZipInputStream zipInputStream = getZipInputStream(inputStream);
		inputStreamReader = new InputStreamReader(zipInputStream, "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println(bufferedReader.readLine());
		return null;
	}
	
	private URLConnection getUrlConnection(String url) throws Exception {
		File file = new File(url);		
		URL urlObject = file.toURI().toURL();
		URLConnection conectorURL = urlObject.openConnection();
		return conectorURL;
	}
	
	private ZipInputStream getZipInputStream(InputStream inputStream) throws Exception {
		ZipInputStream zipInputStream = new ZipInputStream(inputStream);
		zipInputStream = positionateZipInputStream(zipInputStream);
		return zipInputStream;
	}

	private ZipInputStream positionateZipInputStream(ZipInputStream zipInputStream) throws Exception {
		ZipEntry zipEntry = null;
		while ((zipEntry = zipInputStream.getNextEntry()) != null) {
			if (zipEntry.getName().equals("tbEstabelecimento201808.csv"))
				return zipInputStream;
		}
		throw new FileNotFoundException();
	}	
}
