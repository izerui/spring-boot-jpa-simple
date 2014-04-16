package com.myfeike.boot.repository;

import com.myfeike.boot.model.MyTable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by izerui.com on 14-4-16.
 */
public interface MytableRepository  extends JpaRepository<MyTable,String> {

}
