package com.maryanto.dimas.example.mapper;

import com.maryanto.dimas.example.dto.NasabahPeroranganDTO;
import com.maryanto.dimas.example.entity.NasabahPerorangan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NasabahPeroranganMapper {

    NasabahPeroranganMapper INSTANCE = Mappers.getMapper(NasabahPeroranganMapper.class);

    @Mappings(value = {
            @Mapping(target = "passPhoto", source = "dto.passPhoto"),
            @Mapping(target = "cif", source = "dto.nomorNasabah"),
            @Mapping(target = "namaLengkap", source = "dto.namaLengkap"),
            @Mapping(target = "alamatDomisili.jalan", source = "dto.alamatDomisili")
    })
    NasabahPerorangan dtoToEntity(NasabahPeroranganDTO dto);
}
