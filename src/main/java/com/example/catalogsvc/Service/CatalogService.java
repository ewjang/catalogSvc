package com.example.catalogsvc.Service;

import com.example.catalogsvc.jpa.CatalogEntity;

import java.util.Iterator;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
