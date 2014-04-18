package com.myfeike.boot.repository;

import com.myfeike.boot.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by izerui.com on 14-4-18.
 */
public interface DeptRepository extends JpaRepository<Dept,String> {

    @Modifying
    @Query("update Dept set isParent = false")
    public void updateIsParentFalse();

    @Query("select parent from Dept where deleteStatus = false and parent is not null group by parent")
    public List<String> findDepts();


    @Modifying
    @Query("update Dept set isParent = true where id in :ids")
    public void updateParent(@Param("ids") List<String> ids);

}
