package examples.boot.jpaexam.repository;

import examples.boot.jpaexam.domain.BoardCategory;
import org.springframework.data.jpa.repository.JpaRepository;

// Entity클래스, Id Type클래스가 제네릭으로 온다.
public interface BoardCategoryRepository extends JpaRepository<BoardCategory, Long> {
}
