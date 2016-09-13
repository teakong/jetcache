package com.alicp.jetcache.cache;

import com.alicp.jetcache.CacheConsts;

/**
 * Created on 16/9/7.
 *
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class CacheBuilderConfig {
    private boolean cacheNullValue;
    private int defaultTtlInSeconds = CacheConsts.DEFAULT_EXPIRE;
    private String subArea;

    public boolean isCacheNullValue() {
        return cacheNullValue;
    }

    public void setCacheNullValue(boolean cacheNullValue) {
        this.cacheNullValue = cacheNullValue;
    }

    public int getDefaultTtlInSeconds() {
        return defaultTtlInSeconds;
    }

    public void setDefaultTtlInSeconds(int defaultTtlInSeconds) {
        this.defaultTtlInSeconds = defaultTtlInSeconds;
    }

    public String getSubArea() {
        return subArea;
    }

    public void setSubArea(String subArea) {
        this.subArea = subArea;
    }
}
