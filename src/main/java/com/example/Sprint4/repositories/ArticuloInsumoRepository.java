package com.example.Sprint4.repositories;

import com.example.Sprint4.entities.ArticuloInsumo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo, Long>{

    @Query(
            value = "SELECT * FROM Articulo_Insumo WHERE Articulo_Insumo.denominacion LIKE %:filtro%",
            nativeQuery = true
    )
    List<ArticuloInsumo> busquedadenominacion(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM Articulo_Insumo WHERE Articulo_Insumo.FECHA_BAJA IS NULL",
            nativeQuery = true
    )
    List<ArticuloInsumo> busquedaporalta();



}
