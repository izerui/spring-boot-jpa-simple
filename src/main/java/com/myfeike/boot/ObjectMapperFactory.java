package com.myfeike.boot;

import com.myfeike.boot.model.Dept;
import com.myfeike.boot.model.SysOrgElement;
import com.myfeike.boot.model.SysOrgPerson;
import com.myfeike.boot.model.User;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Created by izerui.com on 14-4-18.
 */
public class ObjectMapperFactory{

    public static MapperFactory mapperFactory;


    static {

        mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(SysOrgElement.class, Dept.class)
                .field("fdId", "id")
                .field("fdName", "name")
                .field("fdSpell", "spell")
                .field("fdShortSpell", "shortSpell")
                .field("fdThisLeaderid", "leader")
                .field("fdSuperLeaderid", "superLeader")
                .field("fdHierarchyId", "orgId")
                .field("fdParentid", "parent")
                .byDefault()
                .register();


        mapperFactory.classMap(SysOrgElement.class, User.class)
                .field("fdId", "id")
                .field("fdName", "realname")
                .field("fdSpell", "spell")
                .field("fdShortSpell", "shortSpell")
                .field("fdHierarchyId", "orgId")
                .field("fdParentid", "qq")
                .byDefault()
                .register();

        mapperFactory.classMap(SysOrgPerson.class, User.class)
                .field("fdMobileNo", "mobile")
                .field("fdEmail", "email")
                .field("fdLoginName", "id")
                .field("fdPassword", "password")
                .field("fdBirthDate", "birthDay")
                .field("fdGender", "genderStr")
                .byDefault()
                .register();

    }






}
