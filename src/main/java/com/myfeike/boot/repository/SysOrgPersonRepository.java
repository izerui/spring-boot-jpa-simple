package com.myfeike.boot.repository;

import com.myfeike.boot.model.SysOrgPerson;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by izerui.com on 14-4-17.
 */
public interface SysOrgPersonRepository extends JpaRepository<SysOrgPerson,String> {
}
