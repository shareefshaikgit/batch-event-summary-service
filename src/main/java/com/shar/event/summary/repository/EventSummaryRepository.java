package com.shar.event.summary.repository;

import com.shar.event.summary.entity.EventSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventSummaryRepository extends JpaRepository<EventSummary, Integer> {}
