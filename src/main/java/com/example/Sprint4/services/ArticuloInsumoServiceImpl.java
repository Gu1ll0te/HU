package com.example.Sprint4.services;

import com.example.Sprint4.entities.ArticuloInsumo;
import com.example.Sprint4.repositories.ArticuloInsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArticuloInsumoServiceImpl extends BaseServiceImpl<ArticuloInsumo,Long>  implements ArticuloInsumoService {

    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;

    @Override
    public List<ArticuloInsumo> busquedadenominacion(String filtro) throws Exception {
        try{
            List<ArticuloInsumo> articuloInsumos = articuloInsumoRepository.busquedadenominacion(filtro);
            return articuloInsumos;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<ArticuloInsumo> busquedaporalta() throws Exception {
        try {
            List<ArticuloInsumo> articuloInsumo = articuloInsumoRepository.busquedaporalta();
            return articuloInsumo;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
