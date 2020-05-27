package com.bezkoder.spring.data.jpa.pagingsorting.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.data.jpa.pagingsorting.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  Page<Tutorial> findByPublished(boolean published, Pageable pageable);

  Page<Tutorial> findByTitleContaining(String title, Pageable pageable);
  
  List<Tutorial> findByTitleContaining(String title, Sort sort);
}
