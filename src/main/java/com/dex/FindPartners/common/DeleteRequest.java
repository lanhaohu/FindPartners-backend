package com.dex.FindPartners.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用删除请求
 *
 * @author lanhaohu
 *
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = -455714261583907959L;

    private long id;
}
