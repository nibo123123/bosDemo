package com.chencj.bos.domain;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book implements Serializable {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
