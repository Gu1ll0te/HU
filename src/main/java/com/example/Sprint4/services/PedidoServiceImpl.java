package com.example.Sprint4.services;

import com.example.Sprint4.controlers.BaseControllerImpl;
import com.example.Sprint4.entities.Pedido;
import com.example.Sprint4.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
}
