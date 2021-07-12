package com.google.android.fhir.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0002\u001a\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\u001a \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0015H\u0002\u001a\u001d\u0010\u0016\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u001a-\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\b\b\u0000\u0010\u001d*\u00020\u001e*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u001a\u0014\u0010\u001f\u001a\u00020 *\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\"\u001a\f\u0010#\u001a\u00020\u0015*\u00020\u0015H\u0002\u001a\u0012\u0010$\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001c\u001a\u0012\u0010%\u001a\u00020 *\u00020&2\u0006\u0010\'\u001a\u00020(\u001a\u0012\u0010%\u001a\u00020 *\u00020)2\u0006\u0010\'\u001a\u00020(\u001a\u0012\u0010%\u001a\u00020 *\u00020*2\u0006\u0010\'\u001a\u00020(\u001a\u0012\u0010%\u001a\u00020 *\u00020+2\u0006\u0010\'\u001a\u00020(\u001a\u0012\u0010%\u001a\u00020 *\u00020,2\u0006\u0010\'\u001a\u00020(\u001a\u0012\u0010%\u001a\u00020 *\u00020-2\u0006\u0010\'\u001a\u00020(\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"rangeEpochDays", "Lkotlin/ranges/LongRange;", "Lorg/hl7/fhir/r4/model/DateType;", "getRangeEpochDays", "(Lorg/hl7/fhir/r4/model/DateType;)Lkotlin/ranges/LongRange;", "rangeEpochMillis", "Lorg/hl7/fhir/r4/model/DateTimeType;", "getRangeEpochMillis", "(Lorg/hl7/fhir/r4/model/DateTimeType;)Lkotlin/ranges/LongRange;", "sqlString", "", "Lcom/google/android/fhir/search/Order;", "getSqlString", "(Lcom/google/android/fhir/search/Order;)Ljava/lang/String;", "getConditionParamPair", "Lcom/google/android/fhir/search/ConditionParam;", "", "prefix", "Lca/uhn/fhir/rest/param/ParamPrefixEnum;", "value", "", "Ljava/math/BigDecimal;", "count", "Lcom/google/android/fhir/search/Search;", "database", "Lcom/google/android/fhir/db/Database;", "(Lcom/google/android/fhir/search/Search;Lcom/google/android/fhir/db/Database;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "", "R", "Lorg/hl7/fhir/r4/model/Resource;", "getQuery", "Lcom/google/android/fhir/search/SearchQuery;", "isCount", "", "getRange", "intersect", "query", "Lcom/google/android/fhir/search/DateFilter;", "type", "Lorg/hl7/fhir/r4/model/ResourceType;", "Lcom/google/android/fhir/search/DateTimeFilter;", "Lcom/google/android/fhir/search/NumberFilter;", "Lcom/google/android/fhir/search/ReferenceFilter;", "Lcom/google/android/fhir/search/StringFilter;", "Lcom/google/android/fhir/search/TokenFilter;", "engine_debug"})
public final class MoreSearchKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final <R extends org.hl7.fhir.r4.model.Resource>java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.Search $this$execute, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.Database database, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends R>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object count(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.Search $this$count, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.Database database, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.search.SearchQuery getQuery(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.Search $this$getQuery, boolean isCount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.search.SearchQuery query(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.StringFilter $this$query, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType type) {
        return null;
    }
    
    /**
     * Extension function that returns a SearchQuery based on the value and prefix of the NumberFilter
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.search.SearchQuery query(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.NumberFilter $this$query, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.search.SearchQuery query(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.ReferenceFilter $this$query, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.search.SearchQuery query(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.DateFilter $this$query, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.search.SearchQuery query(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.DateTimeFilter $this$query, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.search.SearchQuery query(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.TokenFilter $this$query, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType type) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.google.android.fhir.search.SearchQuery intersect(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.fhir.search.SearchQuery> $this$intersect) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getSqlString(@org.jetbrains.annotations.Nullable()
    com.google.android.fhir.search.Order $this$sqlString) {
        return null;
    }
    
    private static final com.google.android.fhir.search.ConditionParam<java.lang.Long> getConditionParamPair(ca.uhn.fhir.rest.param.ParamPrefixEnum prefix, org.hl7.fhir.r4.model.DateType value) {
        return null;
    }
    
    private static final com.google.android.fhir.search.ConditionParam<java.lang.Long> getConditionParamPair(ca.uhn.fhir.rest.param.ParamPrefixEnum prefix, org.hl7.fhir.r4.model.DateTimeType value) {
        return null;
    }
    
    /**
     * Returns the condition and list of params required in NumberFilter.query see
     * https://www.hl7.org/fhir/search.html#number.
     */
    private static final com.google.android.fhir.search.ConditionParam<java.lang.Double> getConditionParamPair(ca.uhn.fhir.rest.param.ParamPrefixEnum prefix, java.math.BigDecimal value) {
        return null;
    }
    
    /**
     * Returns the range in which the value should lie for it to be considered a match (@see
     * NumberFilter.query). The value is directly related to the scale of the BigDecimal.
     *
     * For example, a search with a value 100.00 (has a scale of 2) would match any value in [99.995,
     * 100.005) and the function returns 0.005.
     *
     * For Big integers which have a negative scale the function returns 5 For example A search with a
     * value 1000 would match any value in [995, 1005) and the function returns 5.
     */
    private static final java.math.BigDecimal getRange(java.math.BigDecimal $this$getRange) {
        return null;
    }
    
    private static final kotlin.ranges.LongRange getRangeEpochDays(org.hl7.fhir.r4.model.DateType $this$rangeEpochDays) {
        return null;
    }
    
    private static final kotlin.ranges.LongRange getRangeEpochMillis(org.hl7.fhir.r4.model.DateTimeType $this$rangeEpochMillis) {
        return null;
    }
}