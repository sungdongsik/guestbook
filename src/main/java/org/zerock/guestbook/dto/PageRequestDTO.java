package org.zerock.guestbook.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Builder
@AllArgsConstructor
@Data
public class PageRequestDTO {
    private int page;
    private int size;

    public PageRequestDTO(){
        this.page = 1;
        this.size = 1;
    }

    public Pageable getPageable(Sort sort){
        return PageRequest.of(page -1, size, sort);
    } //PageRequest파라미터을 요청
}
