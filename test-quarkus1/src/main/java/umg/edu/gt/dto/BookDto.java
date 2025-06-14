package umg.edu.gt.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BookDto {
	private Long id;
	private String title;
	private int numPages;
	private LocalDate pubDate;
	private String description;

}
