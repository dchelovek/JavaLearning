package com.za.tutorial;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DownloadFileFromServer")
public class DownloadFileFromServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final String FILE_LOCATION = "d:/JAVA/Projects/Learning/workspace/JavaLearning/DownloadFile";
	final String[][] contentTypes = {{"xml","text/xml"},{"pdf","application/pdf"},{"mp3","audio/mpeg"}};
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object requestObject = request.getParameter("filename");
		if(requestObject != null){
			String filename = (String)requestObject;
			String[] fileNameParts = filename.split("\\.");
			String contentType = getContentType(fileNameParts[fileNameParts.length-1]);
			File file = new File(FILE_LOCATION + "/" + filename);
			response.setContentType(contentType);
			response.addHeader("Content-Disposition", "attachmentl; filename="+filename);
			response.setContentLength((int)file.length());
			ServletOutputStream servletOutputStream = response.getOutputStream();
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
			int bytesRead = bufferedInputStream.read();
			while(bytesRead != -1){
				servletOutputStream.write(bytesRead);
				bytesRead = bufferedInputStream.read();
			}
			
			if(servletOutputStream != null) servletOutputStream.close();
			if(bufferedInputStream != null) bufferedInputStream.close();
		}
		
	}

	private String getContentType(String fileType){
		for(String[] elem : contentTypes){
			if(fileType.equals(elem[0])){
				return elem[1];
			}
		}
		return null;
	}
}
