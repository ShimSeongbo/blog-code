package com.jojoldu.blogcode.springbootjpa.querydsl.store;

import com.jojoldu.blogcode.springbootjpa.domain.store.Store;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.jojoldu.blogcode.springbootjpa.domain.store.QStore.store;


@RequiredArgsConstructor
public class StoreQuerydslRepositoryImpl implements StoreQuerydslRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<Store> findAllByQuerydsl () {
        return queryFactory.selectFrom(store)
                .join(store.employees).fetchJoin()
                .join(store.products).fetchJoin()
                .fetch();
    }
}
