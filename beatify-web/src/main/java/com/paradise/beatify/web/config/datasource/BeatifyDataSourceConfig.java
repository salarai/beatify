package com.paradise.beatify.web.config.datasource;

import com.paradise.beatify.core.util.constants.BeatifyConstants;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@Configuration
public class BeatifyDataSourceConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setPersistenceUnitName(BeatifyConstants.WEB_PERSISTENT_UNIT);

        return entityManagerFactoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager() {

        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

        return jpaTransactionManager;
    }

    @Bean
    public DataSource dataSource() {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(BeatifyConstants.WEB_DRIVER_CLASS_NAME);
        dataSource.setUrl(BeatifyConstants.WEB_DATABASE_URL);
        dataSource.setUsername(BeatifyConstants.WEB_DATABASE_USERNAME);
        dataSource.setPassword(BeatifyConstants.WEB_DATABASE_PASSWORD);
        return dataSource;
    }
}
