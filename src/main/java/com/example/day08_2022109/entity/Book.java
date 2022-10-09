package com.example.day08_2022109.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 朱虹运20221005
 * @since 2022-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer isbn;

    private String bookName;

    private Integer price;


}
