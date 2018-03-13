package com.example.tugas1.dao;

import com.example.tugas1.model.MahasiswaModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MahasiswaMapper {
    @Select("select * from mahasiswa")
    List<MahasiswaModel> selectAllMahasiswa();
}
