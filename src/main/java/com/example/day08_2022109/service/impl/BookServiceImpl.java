package com.example.day08_2022109.service.impl;

import com.example.day08_2022109.entity.Book;
import com.example.day08_2022109.mapper.BookMapper;
import com.example.day08_2022109.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 朱虹运20221005
 * @since 2022-10-09
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
