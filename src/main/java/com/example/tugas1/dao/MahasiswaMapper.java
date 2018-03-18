package com.example.tugas1.dao;

import com.example.tugas1.model.MahasiswaModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MahasiswaMapper {
    @Select("select * from mahasiswa m, program_studi p, fakultas f, universitas u where m.id_prodi=p.id and p.id_fakultas=f.id and f.id_univ=u.id")
    List<MahasiswaModel> selectAllMahasiswa();

    @Select("select * from mahasiswa m, program_studi p, fakultas f, universitas u where m.id_prodi=p.id and p.id_fakultas=f.id and f.id_univ=u.id and m.npm = #{npm}")
    MahasiswaModel selectMahasiswa(@Param("npm") String npm);
}
