package com.bingai.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author bingai
 * @create 2020-01-02 22:35
 */
@Entity
@Table(name = "sys_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

    //配置多对多

    @ManyToMany(mappedBy = "roles")//配置多表关系
    private Set<User> users = new HashSet<User>();




    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}