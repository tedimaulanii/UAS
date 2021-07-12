package com.google.android.fhir.index;

import java.lang.System;

/**
 * Indices extracted from the resource of [resourceType] and [resourceId]. Used to create index
 * records in the database to support search.
 *
 * See https://www.hl7.org/fhir/search.html.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001:B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007\u00a2\u0006\u0002\u0010\u0019J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u00c6\u0003J\u00ad\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u00c6\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u000208H\u00d6\u0001J\t\u00109\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001b\u00a8\u0006;"}, d2 = {"Lcom/google/android/fhir/index/ResourceIndices;", "", "resourceType", "Lorg/hl7/fhir/r4/model/ResourceType;", "resourceId", "", "numberIndices", "", "Lcom/google/android/fhir/index/entities/NumberIndex;", "dateIndices", "Lcom/google/android/fhir/index/entities/DateIndex;", "dateTimeIndices", "Lcom/google/android/fhir/index/entities/DateTimeIndex;", "stringIndices", "Lcom/google/android/fhir/index/entities/StringIndex;", "uriIndices", "Lcom/google/android/fhir/index/entities/UriIndex;", "tokenIndices", "Lcom/google/android/fhir/index/entities/TokenIndex;", "quantityIndices", "Lcom/google/android/fhir/index/entities/QuantityIndex;", "referenceIndices", "Lcom/google/android/fhir/index/entities/ReferenceIndex;", "positionIndices", "Lcom/google/android/fhir/index/entities/PositionIndex;", "(Lorg/hl7/fhir/r4/model/ResourceType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDateIndices", "()Ljava/util/List;", "getDateTimeIndices", "getNumberIndices", "getPositionIndices", "getQuantityIndices", "getReferenceIndices", "getResourceId", "()Ljava/lang/String;", "getResourceType", "()Lorg/hl7/fhir/r4/model/ResourceType;", "getStringIndices", "getTokenIndices", "getUriIndices", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Builder", "engine_debug"})
public final class ResourceIndices {
    @org.jetbrains.annotations.NotNull()
    private final org.hl7.fhir.r4.model.ResourceType resourceType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String resourceId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.index.entities.NumberIndex> numberIndices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.index.entities.DateIndex> dateIndices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.index.entities.DateTimeIndex> dateTimeIndices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.index.entities.StringIndex> stringIndices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.index.entities.UriIndex> uriIndices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.index.entities.TokenIndex> tokenIndices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.index.entities.QuantityIndex> quantityIndices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.index.entities.ReferenceIndex> referenceIndices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.index.entities.PositionIndex> positionIndices = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.hl7.fhir.r4.model.ResourceType getResourceType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResourceId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.NumberIndex> getNumberIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.DateIndex> getDateIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.DateTimeIndex> getDateTimeIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.StringIndex> getStringIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.UriIndex> getUriIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.TokenIndex> getTokenIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.QuantityIndex> getQuantityIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.ReferenceIndex> getReferenceIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.PositionIndex> getPositionIndices() {
        return null;
    }
    
    public ResourceIndices(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.NumberIndex> numberIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.DateIndex> dateIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.DateTimeIndex> dateTimeIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.StringIndex> stringIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.UriIndex> uriIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.TokenIndex> tokenIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.QuantityIndex> quantityIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.ReferenceIndex> referenceIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.PositionIndex> positionIndices) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hl7.fhir.r4.model.ResourceType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.NumberIndex> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.DateIndex> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.DateTimeIndex> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.StringIndex> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.UriIndex> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.TokenIndex> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.QuantityIndex> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.ReferenceIndex> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.index.entities.PositionIndex> component11() {
        return null;
    }
    
    /**
     * Indices extracted from the resource of [resourceType] and [resourceId]. Used to create index
     * records in the database to support search.
     *
     * See https://www.hl7.org/fhir/search.html.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.index.ResourceIndices copy(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.NumberIndex> numberIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.DateIndex> dateIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.DateTimeIndex> dateTimeIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.StringIndex> stringIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.UriIndex> uriIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.TokenIndex> tokenIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.QuantityIndex> quantityIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.ReferenceIndex> referenceIndices, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.index.entities.PositionIndex> positionIndices) {
        return null;
    }
    
    /**
     * Indices extracted from the resource of [resourceType] and [resourceId]. Used to create index
     * records in the database to support search.
     *
     * See https://www.hl7.org/fhir/search.html.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Indices extracted from the resource of [resourceType] and [resourceId]. Used to create index
     * records in the database to support search.
     *
     * See https://www.hl7.org/fhir/search.html.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Indices extracted from the resource of [resourceType] and [resourceId]. Used to create index
     * records in the database to support search.
     *
     * See https://www.hl7.org/fhir/search.html.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\rJ\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000fJ\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0011J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0013J\u000e\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0015J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0017J\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u0019J\u0006\u0010-\u001a\u00020.R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/google/android/fhir/index/ResourceIndices$Builder;", "", "resourceType", "Lorg/hl7/fhir/r4/model/ResourceType;", "resourceId", "", "(Lorg/hl7/fhir/r4/model/ResourceType;Ljava/lang/String;)V", "dateIndices", "", "Lcom/google/android/fhir/index/entities/DateIndex;", "dateTimeIndices", "Lcom/google/android/fhir/index/entities/DateTimeIndex;", "numberIndices", "Lcom/google/android/fhir/index/entities/NumberIndex;", "positionIndices", "Lcom/google/android/fhir/index/entities/PositionIndex;", "quantityIndices", "Lcom/google/android/fhir/index/entities/QuantityIndex;", "referenceIndices", "Lcom/google/android/fhir/index/entities/ReferenceIndex;", "stringIndices", "Lcom/google/android/fhir/index/entities/StringIndex;", "tokenIndices", "Lcom/google/android/fhir/index/entities/TokenIndex;", "uriIndices", "Lcom/google/android/fhir/index/entities/UriIndex;", "addDateIndex", "", "dateIndex", "addDateTimeIndex", "dateTimeIndex", "addNumberIndex", "numberIndex", "addPositionIndex", "positionIndex", "addQuantityIndex", "quantityIndex", "addReferenceIndex", "referenceIndex", "addStringIndex", "stringIndex", "addTokenIndex", "tokenIndex", "addUriIndex", "uriIndex", "build", "Lcom/google/android/fhir/index/ResourceIndices;", "engine_debug"})
    public static final class Builder {
        private final java.util.List<com.google.android.fhir.index.entities.StringIndex> stringIndices = null;
        private final java.util.List<com.google.android.fhir.index.entities.ReferenceIndex> referenceIndices = null;
        private final java.util.List<com.google.android.fhir.index.entities.TokenIndex> tokenIndices = null;
        private final java.util.List<com.google.android.fhir.index.entities.QuantityIndex> quantityIndices = null;
        private final java.util.List<com.google.android.fhir.index.entities.UriIndex> uriIndices = null;
        private final java.util.List<com.google.android.fhir.index.entities.DateIndex> dateIndices = null;
        private final java.util.List<com.google.android.fhir.index.entities.DateTimeIndex> dateTimeIndices = null;
        private final java.util.List<com.google.android.fhir.index.entities.NumberIndex> numberIndices = null;
        private final java.util.List<com.google.android.fhir.index.entities.PositionIndex> positionIndices = null;
        private final org.hl7.fhir.r4.model.ResourceType resourceType = null;
        private final java.lang.String resourceId = null;
        
        public final void addNumberIndex(@org.jetbrains.annotations.NotNull()
        com.google.android.fhir.index.entities.NumberIndex numberIndex) {
        }
        
        public final void addDateIndex(@org.jetbrains.annotations.NotNull()
        com.google.android.fhir.index.entities.DateIndex dateIndex) {
        }
        
        public final void addDateTimeIndex(@org.jetbrains.annotations.NotNull()
        com.google.android.fhir.index.entities.DateTimeIndex dateTimeIndex) {
        }
        
        public final void addStringIndex(@org.jetbrains.annotations.NotNull()
        com.google.android.fhir.index.entities.StringIndex stringIndex) {
        }
        
        public final void addUriIndex(@org.jetbrains.annotations.NotNull()
        com.google.android.fhir.index.entities.UriIndex uriIndex) {
        }
        
        public final void addTokenIndex(@org.jetbrains.annotations.NotNull()
        com.google.android.fhir.index.entities.TokenIndex tokenIndex) {
        }
        
        public final void addQuantityIndex(@org.jetbrains.annotations.NotNull()
        com.google.android.fhir.index.entities.QuantityIndex quantityIndex) {
        }
        
        public final void addReferenceIndex(@org.jetbrains.annotations.NotNull()
        com.google.android.fhir.index.entities.ReferenceIndex referenceIndex) {
        }
        
        public final void addPositionIndex(@org.jetbrains.annotations.NotNull()
        com.google.android.fhir.index.entities.PositionIndex positionIndex) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.fhir.index.ResourceIndices build() {
            return null;
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
        java.lang.String resourceId) {
            super();
        }
    }
}