package com.maryanto.dimas.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alamat {

    private String jalan;
    private Integer rt;
    private Integer rw;
    private String kota;
    private String provinsi;
    private String kelurahan;
    private String kecamatan;
}
