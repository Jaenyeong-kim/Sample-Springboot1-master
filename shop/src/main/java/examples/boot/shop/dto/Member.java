package examples.boot.shop.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JacksonXmlRootElement(localName = "member")
public class Member {
    // field
    private Long id;
    private String name;
    private String email;

    // setter, getter 메소드를 프로퍼티라고 한다. setName 이면 set을 제거하고 첫번째 글자를 소문자로 바꾸면 프로퍼티 명이된다.
}
