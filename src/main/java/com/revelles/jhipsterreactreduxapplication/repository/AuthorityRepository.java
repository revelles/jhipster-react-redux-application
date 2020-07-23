package com.revelles.jhipsterreactreduxapplication.repository;

import com.revelles.jhipsterreactreduxapplication.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
