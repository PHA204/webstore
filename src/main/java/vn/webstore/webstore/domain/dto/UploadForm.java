package vn.webstore.webstore.domain.dto;

import org.springframework.web.multipart.MultipartFile;

public class UploadForm {
    private MultipartFile f;

    // Getter và Setter
    public MultipartFile getF() {
        return f;
    }

    public void setF(MultipartFile f) {
        this.f = f;
    }
}
