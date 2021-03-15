package com.example.contacttenantmgmt.controller;

import com.example.contacttenantmgmt.service.TenantManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/")
public class TenantsController {
    @Autowired
    private TenantManagementService tenantManagementService;

//    @Autowired
//    public TenantsController(TenantManagementService tenantManagementService) {
//        this.tenantManagementService = tenantManagementService;
//    }

    @PostMapping("/tenants")
    public ResponseEntity<Void> createTenant(@RequestParam String id, @RequestParam String schema) {
        this.tenantManagementService.createTenant(id, schema);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
