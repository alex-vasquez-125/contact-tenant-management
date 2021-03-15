package com.example.contacttenantmgmt.repository;

import com.example.contacttenantmgmt.domain.entity.Tenant;
import org.springframework.data.repository.CrudRepository;

public interface TenantRepository extends CrudRepository<Tenant, String> {
}
