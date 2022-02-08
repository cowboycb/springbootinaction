package com.springbootinaction.readinglist.repo;

import com.springbootinaction.readinglist.entity.Reader;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
