package org.sid.dshiba.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookDto {
    String title;
    String author ;
    String genre ;
    Double price ;
    String isbn ;
    String editor ;

}
