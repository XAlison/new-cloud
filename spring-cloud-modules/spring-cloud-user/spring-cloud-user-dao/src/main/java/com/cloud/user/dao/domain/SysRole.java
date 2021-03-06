package com.cloud.user.dao.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author summer
 * @since 2017-10-29
 */
@Table(name = "sys_role")
@Data
public class SysRole {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer roleId;

  @Column(name = "role_name")
  private String roleName;

  @Column(name = "role_code")
  private String roleCode;

  @Column(name = "role_desc")
  private String roleDesc;

  @Column(name = "create_time")
  private Date createTime;

  @Column(name = "update_time")
  private Date updateTime;
  /** 删除标识（0-正常,1-删除） */
  @Column(name = "del_flag")
  private String delFlag;

  @Override
  public String toString() {
    return "SysRole{"
        + ", roleId="
        + roleId
        + ", roleName="
        + roleName
        + ", roleCode="
        + roleCode
        + ", roleDesc="
        + roleDesc
        + ", createTime="
        + createTime
        + ", updateTime="
        + updateTime
        + ", delFlag="
        + delFlag
        + "}";
  }
}
