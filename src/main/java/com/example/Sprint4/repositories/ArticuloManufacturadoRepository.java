package com.example.Sprint4.repositories;

import com.example.Sprint4.entities.ArticuloManufacturado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado, Long>{
    @Query(
            value = "SELECT * FROM Articulo_Manufacturado WHERE Articulo_Manufacturado.denominacion LIKE %:filtro%",
            nativeQuery = true
    )
    List<ArticuloManufacturado> busquedaporDenominacion(@Param("filtro")String filtro);

    @Query(
            value = "SELECT * FROM Articulo_Manufacturado ORDER BY Articulo_Manufacturado.precio_venta DESC",
            nativeQuery = true
    )
    List<ArticuloManufacturado> filtradoporPrecioDesc();

    @Query(
            value = "SELECT * FROM Articulo_Manufacturado ORDER BY Articulo_Manufacturado.precio_venta",
            nativeQuery = true
    )
    List<ArticuloManufacturado> filtradoporPrecioAsc();

}
