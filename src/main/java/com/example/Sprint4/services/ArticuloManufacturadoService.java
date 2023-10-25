package com.example.Sprint4.services;

import com.example.Sprint4.entities.ArticuloManufacturado;

import java.util.List;

public interface ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long>{

    List<ArticuloManufacturado> busquedaporDenominacion (String filtro) throws Exception;
    List<ArticuloManufacturado> filtradoporPrecioDesc() throws Exception;
    List<ArticuloManufacturado> filtradoporPrecioAsc() throws Exception;

}
