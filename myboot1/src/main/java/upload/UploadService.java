package upload;

import java.util.List;

public interface UploadService {
	
	public void insertUpload(UploadForm form);

	public List<UploadForm> fbn(String name);
}
