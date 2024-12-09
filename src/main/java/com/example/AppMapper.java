package com.example;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

/**
 * @author Catch
 * @since 2024-12-07
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AppMapper {

	default List<String> stringToListString(String str) {
		if (str == null) {
			return null;
		}
		return List.of(str.split(","));
	}

	default String listStringToString(List<String> strings) {
		if (strings == null) {
			return null;
		}
		return String.join(",", strings);
	}

}
