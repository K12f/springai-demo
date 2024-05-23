package io.github.k12f.aibookerserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String author;
    private String bookName;
    private String publishedDate;
    private String description;
}
