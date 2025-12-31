package com.vbs.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.atn.SemanticContext;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDto
{
    int id;
    String key;
    String value;
}
