package com.example.aop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class History {

    @Id
    @GeneratedValue
    private long idx;

    @Column
    private long userIdx;

    @Column
    private Date updateDate;

    public History(long userIdx, Date updateDate){
        this.userIdx = userIdx;
        this.updateDate = updateDate;
    }
}
