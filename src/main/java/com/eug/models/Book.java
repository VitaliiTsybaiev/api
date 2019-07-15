package com.eug.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ID",
        "Title",
        "Description",
        "PageCount",
        "Excerpt",
        "PublishDate"
})

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @JsonProperty("ID")
    @Builder.Default
    private Integer iD = null;

    @JsonProperty("Title")
    @Builder.Default
    private String title = RandomStringUtils.random(32);

    @JsonProperty("Description")
    @Builder.Default
    private String description = RandomStringUtils.random(32);

    @JsonProperty("PageCount")
    @Builder.Default
    private Integer pageCount = RandomUtils.nextInt(0, 10);

    @JsonProperty("Excerpt")
    @Builder.Default
    private String excerpt = RandomStringUtils.random(32);

    @JsonProperty("PublishDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSS[xxx]")
    @Builder.Default
    private LocalDateTime publishDate = LocalDateTime.now();

}
