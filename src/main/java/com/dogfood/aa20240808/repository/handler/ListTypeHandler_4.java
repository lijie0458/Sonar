package com.dogfood.aa20240808.repository.handler;

import java.math.BigDecimal;
import java.util.UUID;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.dogfood.aa20240808.domain.structure.Contact_informationStructure;

import com.fasterxml.jackson.core.type.TypeReference;

public class ListTypeHandler_4 extends BaseListTypeHandler {
    @Override
    protected TypeReference getTypeReference() {
        return new TypeReference<List<Contact_informationStructure>>() {
        };
    }
}

