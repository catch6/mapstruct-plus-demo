package com.example;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;

import java.util.List;

/**
 * @author Catch
 * @since 2024-12-09
 */
@AutoMapper(target = VO1.class)
@Data
public class VO2 {

	private List<String> roles;

}
