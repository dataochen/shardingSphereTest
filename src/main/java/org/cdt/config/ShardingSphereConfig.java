package org.cdt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author dataochen
 * @Description
 * @date: 2020/12/22 9:29
 */
@Configuration
public class ShardingSphereConfig {
    @Autowired
    private DataSource dataSource;

    public void rule() {
    }
}
