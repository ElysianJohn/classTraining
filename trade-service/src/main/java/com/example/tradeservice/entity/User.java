package com.example.tradeservice.entity;



import lombok.Data;

import java.util.Date;

/**
 * 
 * @TableName user
 */
@Data
public class User  {
    /**
     * 
     */

    private Integer userId;

    /**
     * 
     */

    private String name;

    /**
     * 
     */

    private String email;

    /**
     * 
     */

    private String institute;

    /**
     * 
     */

    private String insert_id;

    /**
     * 
     */
    private Date insert_ts;

    /**
     * 
     */
    private String update_id;

    /**
     * 
     */
    private Date update_ts;

    private static final long serialVersionUID = 1L;


}