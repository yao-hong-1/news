package com.heima.utils.common;

import com.heima.model.wemedia.pojos.WmUser;

/**
 * TODO
 *
 * @author yaoh
 */
public class WmThreadLocalUtil {

    private static final ThreadLocal<WmUser> WM_USER_THREAD_LOCAL = new ThreadLocal<>();

    /**
     * 添加用户
     *
     * @param wmUser
     */
    public static void setUser(WmUser wmUser) {
        WM_USER_THREAD_LOCAL.set(wmUser);
    }

    /**
     * 获取用户
     *
     * @return WmUser
     */
    public static WmUser getUser() {
        return WM_USER_THREAD_LOCAL.get();
    }

    /**
     * 清理用户
     */
    public static void clear() {
        WM_USER_THREAD_LOCAL.remove();
    }
}
