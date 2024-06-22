package com.dex.FindPartners.contant;

/**
 * 系统常量
 *王浩楠
 * @author lanhaohu
 * @date 2024/04/22
 */
public final class SystemConstant {
    private SystemConstant() {
    }

    /**
     * 分页大小
     */
    public static final long PAGE_SIZE = 8;
    /**
     * 默认缓存页数
     */
    public static final int DEFAULT_CACHE_PAGE = 5;
    /**
     * 协议长度
     */
    public static final int PROTOCOL_LENGTH = 8;
    /**
     * 默认缓冲区大小
     */
    public static final int DEFAULT_BUFFER_SIZE = 1024;
    /**
     * 文件结束
     */
    public static final int FILE_END = -1;
    /**
     * 最长登录空闲时间
     */
    public static final int MAXIMUM_LOGIN_IDLE_TIME = 900;

    /**
     * 跨域允许时间
     */
    public static final int CROSS_ORIGIN_ALLOWED_TIME = 3600;
    /**
     * 启用随机展示用户最低限度
     */
    public static final int MINIMUM_ENABLE_RANDOM_USER_NUM = 10;
}
