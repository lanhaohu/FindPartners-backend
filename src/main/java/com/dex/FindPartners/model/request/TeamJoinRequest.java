package com.dex.FindPartners.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 *
 * @author lanhaohu
 */
@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 852273950928111142L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
