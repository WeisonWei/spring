package com.weison.service;

import java.util.List;

public interface HelloService {

    List<String> findAll(String db);

    List<String> getAll(String db);

    List<String> get(String db);

    List<Object> getBeans();

    List<Object> getCacheBeans();

}
