package com.codewithGAS.livre.repository;
import com.codewithGAS.livre.entity.Emprunte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprunteRepository extends JpaRepository <Emprunte, Long> {
}
