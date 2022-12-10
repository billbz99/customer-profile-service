package com.company.org.customerprofileservice.repository;

import com.company.org.customerprofileservice.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartyRepository extends JpaRepository<Party, Integer> {
    List<Party> findByPartyName(String partyName);

}