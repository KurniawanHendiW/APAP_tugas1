package com.example.tugas1.controller;

import com.example.tugas1.dao.MahasiswaMapper;
import com.example.tugas1.model.MahasiswaModel;
import com.example.tugas1.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MahasiswaController {
    @Autowired
    MahasiswaService mahasiswaDAO;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/mahasiswa")
    public String mahasiswa(Model model, @RequestParam(value = "npm", required = false) String npm){
        MahasiswaModel mahasiswa = mahasiswaDAO.selectMahasiswa(npm);
        if (mahasiswa != null){
            model.addAttribute("mahasiswa", mahasiswa);
            return "view-mahasiswa";
        }else{
            model.addAttribute("npm", npm);
            return "not-found";
        }
    }
}
