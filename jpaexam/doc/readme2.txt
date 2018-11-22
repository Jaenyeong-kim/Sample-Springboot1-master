기존 프로젝트에 다음과 같은 package를 생성한다.

examples.boot.jpaexam 기본 package아래에 생성한다.

controller
service
security
dto

pom.xml 파일에 다음을 추가한다.

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>


controller에 TestApiController 클래스를 생성한다. (테스트용.)

package examples.boot.jpaexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {
    @GetMapping("/api/test")
    public String test(){
        return "test";
    }
}
---------------------------------------------------------

pom.xml 파일에 다음을 추가한다.

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>

----------------------------------------------------------

ManyToMany

Member                                    MemberRole


member          member_member_role        member_role
  1                     1(fk)                    5
                        5(fk)

회원              주문상품              상품
---------------------------------------------------------
1234 를 암호화 하면 다음과 같은 결과가 나온다.

{bcrypt}$2a$10$W2v2jCCwIURSgrEr0w6zPulwbW6oeFc3rCcvKrlyZyTnVoIA/mHsC
{bcrypt}$2a$10$dMdgl6.qwv4HSyG39j14r.UUSzK7hrmqFoaqXtnz/OeVzkbeKZf0O

data.sql에서 member에 insert하는 문장을 다음과 같이 수정한다.


insert into member (id, name, email, password, join_date)
  values( 1, 'kim', 'urstory@gmail.com', '{bcrypt}$2a$10$dMdgl6.qwv4HSyG39j14r.UUSzK7hrmqFoaqXtnz/OeVzkbeKZf0O', now());
insert into member (id, name, email, password, join_date)
  values( 2, 'kang', 'carami@gmail.com', '{bcrypt}$2a$10$dMdgl6.qwv4HSyG39j14r.UUSzK7hrmqFoaqXtnz/OeVzkbeKZf0O', now());

------------------------------------------------------------

service 패키지에 다음의 인터페이스와 클래스를 작성한다.

interface : MemberServcie
class : MemberServcieImpl  (MemberService를 구현한다.)

MemberService는 2개의 메소드를 가진다.
Member addMember(Member member);
Member getMemberByEmail(String email);

------------------------------------------------------------
 MemberDetailsService클래스를 구현한다.

 -----------------------------------------------------------

 config package를 작성한다.

WebSecurityConfig 라는 클래스를 작성한다.

@Configuration 애노테이션이 붙는다.

-------------------------
pom.xml파일 추가
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>

-----------------------

MemberController 를 작성

/members/login 구현
------------------------

pom.xml 에

webjar 라이브러리를 추가한다.

bootstrap , jquery

템플릿에서 해당 라이브러리를 사용한다.

-------------------------

게시물 목록보기

BoardRepository에 다음을 추가한다
    @Query("SELECT b FROM Board b order by b.id desc")
    public Page<Board> getBoards(Pageable page);

BoardService 인터페이스
BoardServiceImpl 클래스를 작성

    Page<Board> getBoards(int page) // 1이 시작 page

게시물 등록하기

회원 가입

-------------------------




























