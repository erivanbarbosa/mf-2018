package com.redesprou.datasus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.google.gson.Gson;


public class DatasusFileReader {
	
	public void generateEstablishmentResume(String url, String fileName) throws Exception {
		validateFields(url, fileName);
		BufferedReader bufferedReader = generateBufferedReader(url);
		generateJsonFileFromBufferedReader(fileName, bufferedReader);
	}
	
	private void validateFields(String url, String fileName) throws Exception {
		validateField(url);
		validateField(fileName);
	}

	private void validateField(String field) throws Exception {
		if(field == null || field.isEmpty() )
			throw new Exception("A URL informada é inválida!");
	}

	private BufferedReader generateBufferedReader(String url) throws Exception, IOException, UnsupportedEncodingException {
		URLConnection urlConnection = getUrlConnection(url);
		InputStream inputStream =  urlConnection.getInputStream();
		ZipInputStream zipInputStream = getZipInputStream(inputStream);
		InputStreamReader inputStreamReader = new InputStreamReader(zipInputStream, "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		return bufferedReader;
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

	private void generateJsonFileFromBufferedReader(String fileName, BufferedReader bufferedReader) {
		List<DataSusInformation> list = readBufferedReader(bufferedReader);
		generateJsonFile(list, fileName);
	}
	
	private List<DataSusInformation> readBufferedReader(BufferedReader bufferedReader) {
		Pattern pattern = Pattern.compile(",");
		List<DataSusInformation> informationList = new ArrayList<DataSusInformation>();
		
		bufferedReader.lines().skip(1).forEach(line -> {
			String[] x = pattern.split(line);
			DataSusInformation information = new DataSusInformation(x[0], x[5], x[39], x[40]);
			informationList.add(information);
		});
		
		return informationList;
	}
	
	private void generateJsonFile(List<DataSusInformation> list, String fileName) {
		   try (Writer writer = new FileWriter("src/main/resources/teste.json")){
			   executeGenerateJsonFile(list, fileName, writer);
		    } catch (IOException e) {
		    	resolveError(e);
		    }
	}

	private void executeGenerateJsonFile(List<DataSusInformation> list, String fileName, Writer writer)
			throws IOException {
		Gson gson = new Gson();
		   writer.write(gson.toJson(list));
		   System.out.println("Arquivo criado com sucesso: src/main/resources/arquivos/" + fileName);
	}
	
	private void resolveError(IOException e) {
		System.out.println("Houve um erro ao gerar o arquivo!");
		e.printStackTrace();
	}




	


	
}
