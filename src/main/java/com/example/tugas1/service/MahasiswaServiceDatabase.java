package com.example.tugas1.service;

import com.example.tugas1.dao.MahasiswaMapper;
import com.example.tugas1.model.MahasiswaModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MahasiswaServiceDatabase implements MahasiswaService{
    @Autowired
    private MahasiswaMapper mahasiswaMapper;

    @Override
    public List<MahasiswaModel> selectAllMahasiswa(){
        log.info("Select all mahasiswa");
        return mahasiswaMapper.selectAllMahasiswa();
    }

    @Override
    public MahasiswaModel selectMahasiswa(String npm){
        log.info("Select mahasiswa with npm {}", npm);
        return mahasiswaMapper.selectMahasiswa(npm);
    }
}
