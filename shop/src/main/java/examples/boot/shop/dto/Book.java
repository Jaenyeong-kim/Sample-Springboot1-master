package examples.boot.shop.dto;

import lombok.*;

//
@Getter
@Setter
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 것을 받아들이는 생성자.
@ToString
public class Book {
    // 필드를 선언.
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private int price;
}
