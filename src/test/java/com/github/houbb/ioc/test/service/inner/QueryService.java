package com.github.houbb.ioc.test.service.inner;

import com.github.houbb.ioc.annotation.Service;

/**
 * <p> project: ioc-QueryService </p>
 * <p> create on 2019/12/1 14:25 </p>
 *
 * @author Administrator
 * @since 0.1.11
 */
@Service("myQueryService")
public class QueryService {

    /**
     * 查询名称
     * @param id 唯一标识
     * @return 结果
     * @since 0.1.11
     */
    public String queryName(final int id) {
        return id + "-name";
    }

}
