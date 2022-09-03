package upload;

import org.springframework.web.multipart.MultipartFile;

public class UploadForm {
	
	String name; 
	String description;
	String file1; 
	String uploadtime;
	public UploadForm(String name, String description, String file1, String uploadtime) {
		this.name = name;
		this.description = description;
		this.file1 = file1;
		this.uploadtime = uploadtime;
	}
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFile1() {
		return file1;
	}
	public void setFile1(String file1) {
		this.file1 = file1;
	}
	public String getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(String uploadtime) {
		this.uploadtime = uploadtime;
	}

	
	
	
	

}
