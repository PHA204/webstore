package vn.webstore.webstore.service;

import java.io.IOException; // Xử lý các ngoại lệ khi làm việc với file
import java.nio.file.Files; // Các thao tác với file hệ thống
import java.nio.file.Path; // Để biểu diễn đường dẫn của file
import java.nio.file.Paths; // Để làm việc với đường dẫn của file
import java.util.Random; // Tạo chuỗi ngẫu nhiên
import org.springframework.web.multipart.MultipartFile; // Để làm việc với file upload từ Spring

public class Helper {
    public static String saveFile(String uploadDir, MultipartFile file, int len) throws IOException {
        Path path = Paths.get(uploadDir);
        if (!Files.exists(path)) {
            Files.createDirectories(path);
        }
        String name = file.getOriginalFilename();
        String ext = name.substring(name.lastIndexOf('.'));
        String fileName = randomString(len - ext.length()) + ext;
        Path filePath = path.resolve(fileName);
        file.transferTo(filePath);
        return "/images/" + fileName; // Chú ý, phải bao gồm /images/
    }

    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        String pattern = "1234567890qwertyuiopasdfghjklzxcvbnm";
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            sb.append(pattern.charAt(random.nextInt(pattern.length())));
        }
        return sb.toString();
    }
}