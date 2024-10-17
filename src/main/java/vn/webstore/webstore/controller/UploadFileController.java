package vn.webstore.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import vn.webstore.webstore.domain.Images;
import vn.webstore.webstore.repository.ImageRepository;
import vn.webstore.webstore.service.Helper;
import java.io.IOException;

@Controller
public class UploadFileController {
    @Autowired
    private ImageRepository repository;

    @GetMapping("/upload")
    public String index(Model model) {
        model.addAttribute("list", repository.findAll());
        return "templates/upload/index";
    }

    @GetMapping("/upload/add")
    public String add() {
        return "templates/upload/add";
    }

    @PostMapping("/upload/add")
    public String add(Model model,@RequestParam("f") @ModelAttribute("newImage") MultipartFile f ) {
        try {
            String fileName = Helper.saveFile("images", f, 32);
            Images image = new Images(0, fileName, f.getSize(), f.getContentType());
            repository.save(image);
            return "redirect:/upload";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "templates/upload/add";
    }
}
