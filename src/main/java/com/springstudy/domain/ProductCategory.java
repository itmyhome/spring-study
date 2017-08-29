package com.springstudy.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * Created by 廖师兄
 * 2017-05-07 14:30
 */
@Entity
@DynamicUpdate
@DynamicInsert
@Data
public class ProductCategory {

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String TIMEZONE = "GMT+08:00";

    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

//    @JsonFormat(pattern = DATE_TIME_FORMAT, timezone = TIMEZONE)
    private Date createTime;

//    @JsonFormat(pattern = DATE_TIME_FORMAT, timezone = TIMEZONE)
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
