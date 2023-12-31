package com.example.Sprint4.controlers;

import com.example.Sprint4.entities.Cliente;
import com.example.Sprint4.services.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl> {
}
