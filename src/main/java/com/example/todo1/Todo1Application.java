package com.example.todo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Todo1Application.class, args);
    }

    /*
     * 1. pom: h2-db, spring-data-jpa, spring-web : Done
     *    Q: h2-database là gì? Khi nào nên dùng
     *
     * 2. config domain/entity: Contains 3 parts, Author(firstname, lastname), Book(title, isbn), Publisher(name, postcode, state, zipcode)
     *      Author-Book(n-n), Book-Publisher(n-1)
     *      Tai sao can ID field
     *      Pojo object la gi, JPA entity la gi
     * 3. Repository: la gi, implement tu dau
     *    No dc dua vao nham muc dich gi
     *
     * 4. Lam the nao de khoi tao master data cho no? -> Boostrap class
     *
     * Q&A
     *   Tai sao no lai phai map n-1, 1-n. 2 chieu de lam gi. No cu tu lay ra het khoong?
     *   Tại sao bảng Author, để là set nhưng ko cần join table mà bảng Book lại cần?
     *   Nó boostrap data lên kiểu gì? -> Tại thời điểm này thì các dependency đã được khởi tạo chưa?
     *
     * */
}
