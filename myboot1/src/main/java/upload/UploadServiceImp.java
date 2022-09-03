package upload;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("uploadservice")
public class UploadServiceImp implements UploadService {

	@Autowired
	UploadDAO uploaddao;
	
	
	@Override
	public void insertUpload(UploadForm form) {
		uploaddao.insertUpload(form);
	}


	@Override
	public List<UploadForm> fbn(String name) {
		return uploaddao.fbn(name);
	}

	
	
	
	
}
