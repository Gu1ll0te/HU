package com.example.Sprint4.services;

import com.example.Sprint4.entities.ArticuloInsumo;

import java.util.List;

public interface ArticuloInsumoService extends BaseService<ArticuloInsumo, Long>{

    List<ArticuloInsumo> busquedadenominacion(String filtro) throws Exception;
    List<ArticuloInsumo> busquedaporalta() throws Exception;

}
