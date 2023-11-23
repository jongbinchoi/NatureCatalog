package com.natureCatalogSite.natureCatalog.repository;

import com.natureCatalogSite.natureCatalog.entity.Nature;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface NatureRepository extends CrudRepository<Nature, Long> {
    @Override
    ArrayList<Nature> findAll();
}
