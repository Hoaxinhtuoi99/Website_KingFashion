package com.example.demo.service;

import com.example.demo.entity.CoAo;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface CoAoService {
    Page<CoAo> phanTrang(Integer pageNum, Integer pageNo);

    void add(CoAo coAo);

    CoAo detail(UUID id);

    void delete(UUID id);
}
