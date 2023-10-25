package com.example.Sprint4.controlers;

import com.example.Sprint4.entities.ArticuloManufacturado;
import com.example.Sprint4.services.ArticuloManufacturadoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ArticulosManufacturados")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl>{

    @GetMapping("/busquedaporDenominacion")
    public ResponseEntity<?> busquedaporDenominacion(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.busquedaporDenominacion(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));

        }
    }
    @GetMapping("/filtradoporPrecioDesc")
    public ResponseEntity<?> filtradoporPrecioDesc(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.filtradoporPrecioDesc());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));
        }
    }
    @GetMapping("/filtradoporPrecioAsc")
    public ResponseEntity<?> filtradoporPrecioAsc(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.filtradoporPrecioAsc());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));
        }
    }


}
