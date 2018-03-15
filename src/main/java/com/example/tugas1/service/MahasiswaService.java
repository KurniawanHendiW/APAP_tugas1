package com.example.tugas1.service;

import com.example.tugas1.model.MahasiswaModel;

import java.util.List;

public interface MahasiswaService {
    List<MahasiswaModel> selectAllMahasiswa();

    MahasiswaModel selectMahasiswa(String npm);
}
