package com.github.kyriosdata.dsr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DatasusFileReader {

	public Object generateEstablishmentResume(String url) throws Exception {

		InputStreamReader inputStreamReader = getInputStreamReader(url);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		return null;
	}

	private InputStreamReader getInputStreamReader(String url) throws Exception {
		ZipInputStream zipInputStream = getZipInputStream(url);
		InputStreamReader inputStreamReader = new InputStreamReader(zipInputStream, "UTF-8");

		return inputStreamReader;
	}

	private ZipInputStream getZipInputStream(String url) throws Exception {
		ZipInputStream zipInputStream = new ZipInputStream(getInputStream(url));
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

	private InputStream getInputStream(String url) throws Exception, Exception {
		return getUrlConnection(url).getInputStream();
	}

	private URLConnection getUrlConnection(String url) throws Exception {
		URL urlObject = new URL(url);
		URLConnection conectorURL = urlObject.openConnection();

		return conectorURL;
	}
}
