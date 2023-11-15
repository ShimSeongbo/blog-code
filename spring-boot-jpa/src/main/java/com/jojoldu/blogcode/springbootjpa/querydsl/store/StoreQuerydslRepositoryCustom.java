package com.jojoldu.blogcode.springbootjpa.querydsl.store;

import com.jojoldu.blogcode.springbootjpa.domain.store.Store;

import java.util.List;

public interface StoreQuerydslRepositoryCustom {
    List<Store> findAllByQuerydsl();
}
