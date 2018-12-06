package com.maryanto.dimas.example;

import com.maryanto.dimas.example.dto.NasabahPeroranganDTO;
import com.maryanto.dimas.example.entity.NasabahPerorangan;
import com.maryanto.dimas.example.mapper.NasabahPeroranganMapper;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
//        super.setUp();
    }

    @Test
    public void testTransferDTO() {

        NasabahPeroranganDTO dto = new NasabahPeroranganDTO();
        dto.setAlamatDomisili("Bandung");
        dto.setNamaLengkap("Dimas Maryanto");
        dto.setNomorNasabah("640328039300007");
        dto.setPassPhoto("asdf");

        NasabahPerorangan nasabah = NasabahPeroranganMapper.INSTANCE.dtoToEntity(dto);

        assertNotNull("Nama nasabah tidak boleh kosong", nasabah.getNamaLengkap());
        assertEquals("Bandingkan nama lengkap nasabah!", nasabah.getNamaLengkap(), dto.getNamaLengkap());

        assertNotNull("nomor CIF tidak boleh kosong", nasabah.getCif());
        assertEquals("bandingkan nomor cif", nasabah.getCif(), dto.getNomorNasabah());
    }
}
