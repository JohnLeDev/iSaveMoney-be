package com.lean.moneynote.appuser;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lean.moneynote.model.UseriSaveMoney;


@Repository
@Transactional(readOnly = true)
public interface AppUserRepository extends JpaRepository<UseriSaveMoney,UUID> {
    Optional<UseriSaveMoney> findByUsername(String username);
}
