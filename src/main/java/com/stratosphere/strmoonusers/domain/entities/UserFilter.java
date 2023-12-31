package com.stratosphere.strmoonusers.domain.entities;

import lombok.Builder;

@Builder
public record UserFilter(String password){}
