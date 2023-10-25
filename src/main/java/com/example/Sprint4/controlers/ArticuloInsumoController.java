package com.example.Sprint4.controlers;

import com.example.Sprint4.entities.ArticuloInsumo;
import com.example.Sprint4.services.ArticuloInsumoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ArticulosInsumo")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoServiceImpl> {

    @GetMapping("/busquedadenominacion")
    public ResponseEntity<?> busquedadenominacion(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.busquedadenominacion(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));
        }
    }

    @GetMapping("/busquedaporalta")
    public ResponseEntity<?> busquedaporalta(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.busquedaporalta());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));
        }
    }

}
