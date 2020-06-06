package com.gobeyond.hazelcastcache.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.gobeyond.hazelcastcache.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	@Transactional
	@Modifying
	@Query("update Book u set u.name=?2 where u.id=?1")
	int updateAddress(long id, String name);
}
