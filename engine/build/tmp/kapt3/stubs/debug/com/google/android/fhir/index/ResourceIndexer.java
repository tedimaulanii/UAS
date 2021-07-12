package com.google.android.fhir.index;

import java.lang.System;

/**
 * Indexes a FHIR resource according to the
 * [search parameters](https://www.hl7.org/fhir/searchparameter-registry.html).
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001f\u0010\u0012\u001a\u00020\u0013\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0014H\u0002\u00a2\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u0013\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0014\u00a2\u0006\u0002\u0010\u0017J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0016\u0010(\u001a\u00020\u0004*\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0002J\u0016\u0010(\u001a\u00020\u0004*\u00020,2\b\b\u0002\u0010*\u001a\u00020+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/google/android/fhir/index/ResourceIndexer;", "", "()V", "FHIR_CURRENCY_CODE_SYSTEM", "", "context", "Lca/uhn/fhir/context/FhirContext;", "kotlin.jvm.PlatformType", "fhirPathEngine", "Lorg/hl7/fhir/r4/utils/FHIRPathEngine;", "dateIndex", "Lcom/google/android/fhir/index/entities/DateIndex;", "searchParam", "Lca/uhn/fhir/model/api/annotation/SearchParamDefinition;", "value", "Lorg/hl7/fhir/r4/model/Base;", "dateTimeIndex", "Lcom/google/android/fhir/index/entities/DateTimeIndex;", "extractIndexValues", "Lcom/google/android/fhir/index/ResourceIndices;", "R", "Lorg/hl7/fhir/r4/model/Resource;", "resource", "(Lorg/hl7/fhir/r4/model/Resource;)Lcom/google/android/fhir/index/ResourceIndices;", "index", "numberIndex", "Lcom/google/android/fhir/index/entities/NumberIndex;", "quantityIndex", "Lcom/google/android/fhir/index/entities/QuantityIndex;", "referenceIndex", "Lcom/google/android/fhir/index/entities/ReferenceIndex;", "specialIndex", "Lcom/google/android/fhir/index/entities/PositionIndex;", "stringIndex", "Lcom/google/android/fhir/index/entities/StringIndex;", "tokenIndex", "", "Lcom/google/android/fhir/index/entities/TokenIndex;", "uriIndex", "Lcom/google/android/fhir/index/entities/UriIndex;", "asString", "Lorg/hl7/fhir/r4/model/Address;", "separator", "", "Lorg/hl7/fhir/r4/model/HumanName;", "engine_debug"})
public final class ResourceIndexer {
    private static final ca.uhn.fhir.context.FhirContext context = null;
    private static final org.hl7.fhir.r4.utils.FHIRPathEngine fhirPathEngine = null;
    
    /**
     * The FHIR currency code system. See: https://bit.ly/30YB3ML. See:
     * https://www.hl7.org/fhir/valueset-currencies.html.
     */
    private static final java.lang.String FHIR_CURRENCY_CODE_SYSTEM = "urn:iso:std:iso:4217";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.index.ResourceIndexer INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final <R extends org.hl7.fhir.r4.model.Resource>com.google.android.fhir.index.ResourceIndices index(@org.jetbrains.annotations.NotNull()
    R resource) {
        return null;
    }
    
    private final <R extends org.hl7.fhir.r4.model.Resource>com.google.android.fhir.index.ResourceIndices extractIndexValues(R resource) {
        return null;
    }
    
    private final com.google.android.fhir.index.entities.NumberIndex numberIndex(ca.uhn.fhir.model.api.annotation.SearchParamDefinition searchParam, org.hl7.fhir.r4.model.Base value) {
        return null;
    }
    
    private final com.google.android.fhir.index.entities.DateIndex dateIndex(ca.uhn.fhir.model.api.annotation.SearchParamDefinition searchParam, org.hl7.fhir.r4.model.Base value) {
        return null;
    }
    
    private final com.google.android.fhir.index.entities.DateTimeIndex dateTimeIndex(ca.uhn.fhir.model.api.annotation.SearchParamDefinition searchParam, org.hl7.fhir.r4.model.Base value) {
        return null;
    }
    
    /**
     * Extension to expresses [HumanName] as a separated string using [separator]. See
     * https://www.hl7.org/fhir/patient.html#search
     */
    private final java.lang.String asString(org.hl7.fhir.r4.model.HumanName $this$asString, java.lang.CharSequence separator) {
        return null;
    }
    
    /**
     * Extension to expresses [Address] as a string using [separator]. See
     * https://www.hl7.org/fhir/patient.html#search
     */
    private final java.lang.String asString(org.hl7.fhir.r4.model.Address $this$asString, java.lang.CharSequence separator) {
        return null;
    }
    
    private final com.google.android.fhir.index.entities.StringIndex stringIndex(ca.uhn.fhir.model.api.annotation.SearchParamDefinition searchParam, org.hl7.fhir.r4.model.Base value) {
        return null;
    }
    
    private final java.util.List<com.google.android.fhir.index.entities.TokenIndex> tokenIndex(ca.uhn.fhir.model.api.annotation.SearchParamDefinition searchParam, org.hl7.fhir.r4.model.Base value) {
        return null;
    }
    
    private final com.google.android.fhir.index.entities.ReferenceIndex referenceIndex(ca.uhn.fhir.model.api.annotation.SearchParamDefinition searchParam, org.hl7.fhir.r4.model.Base value) {
        return null;
    }
    
    private final com.google.android.fhir.index.entities.QuantityIndex quantityIndex(ca.uhn.fhir.model.api.annotation.SearchParamDefinition searchParam, org.hl7.fhir.r4.model.Base value) {
        return null;
    }
    
    private final com.google.android.fhir.index.entities.UriIndex uriIndex(ca.uhn.fhir.model.api.annotation.SearchParamDefinition searchParam, org.hl7.fhir.r4.model.Base value) {
        return null;
    }
    
    private final com.google.android.fhir.index.entities.PositionIndex specialIndex(org.hl7.fhir.r4.model.Base value) {
        return null;
    }
    
    private ResourceIndexer() {
        super();
    }
}