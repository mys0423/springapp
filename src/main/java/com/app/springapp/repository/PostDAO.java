package com.app.springapp.repository;

import com.app.springapp.domain.vo.PostVO;
import com.app.springapp.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PostDAO {

    private final PostMapper postMapper;

    public void save(PostVO postVO) {
        postMapper.insert(postVO);
    }

    public PostVO findById(Long id) {
        return postMapper.selectById(id);
    }
}
