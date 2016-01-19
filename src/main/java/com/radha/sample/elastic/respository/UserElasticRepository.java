package com.radha.sample.elastic.respository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.radha.sample.elastic.bean.User;

@Repository
public interface UserElasticRepository extends ElasticsearchRepository<User, String> {

}
