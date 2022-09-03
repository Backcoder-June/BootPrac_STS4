package upload;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UploadDTO {
	
	String name; 
	String description;
	MultipartFile file1; 
	String uploadtime;
	public UploadDTO(String name, String description, MultipartFile file1, String uploadtime) {
		super();
		this.name = name;
		this.description = description;
		this.file1 = file1;
		this.uploadtime = uploadtime;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "UploadDTO [name=" + name + ", description=" + description + ", file1=" + file1 
				+ ", uploadtime=" + uploadtime + "]";
	}






	public String getUploadtime() {
		return uploadtime;
	}





	public void setUploadtime(String uploadtime) {
		this.uploadtime = uploadtime;
	}





	public UploadDTO() {} 
	
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
	public MultipartFile getFile1() {
		return file1;
	}
	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}
	
	
	
	
	
	

}
