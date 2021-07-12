package com.google.android.fhir.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ0\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J \u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020@J \u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010A\u001a\u00020B2\b\b\u0002\u0010?\u001a\u00020@J\'\u00109\u001a\u00020:2\u0006\u0010C\u001a\u00020D2\u0017\u0010E\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020:0F\u00a2\u0006\u0002\bGJ\'\u00109\u001a\u00020:2\u0006\u0010H\u001a\u00020I2\u0017\u0010E\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020:0F\u00a2\u0006\u0002\bGJ\'\u00109\u001a\u00020:2\u0006\u0010J\u001a\u00020K2\u0017\u0010E\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020:0F\u00a2\u0006\u0002\bGJ\u0016\u00109\u001a\u0002072\u0006\u00109\u001a\u00020L2\u0006\u0010M\u001a\u000207J\u0016\u00109\u001a\u0002072\u0006\u00109\u001a\u00020L2\u0006\u0010N\u001a\u00020OJ\u0016\u00109\u001a\u0002072\u0006\u00109\u001a\u00020L2\u0006\u0010P\u001a\u00020QJ\u0016\u00109\u001a\u00020:2\u0006\u00109\u001a\u00020L2\u0006\u0010R\u001a\u00020SJ\u0016\u00109\u001a\u0002072\u0006\u00109\u001a\u00020L2\u0006\u0010T\u001a\u00020UJ\u0016\u00109\u001a\u0002072\u0006\u00109\u001a\u00020L2\u0006\u0010V\u001a\u00020WJ\u0016\u00109\u001a\u0002072\u0006\u00109\u001a\u00020L2\u0006\u0010X\u001a\u00020YJ\u0016\u00109\u001a\u0002072\u0006\u00109\u001a\u00020L2\u0006\u0010Z\u001a\u00020[J\t\u0010\\\u001a\u00020\u0005H\u00d6\u0001J\u0016\u0010#\u001a\u00020:2\u0006\u0010]\u001a\u00020D2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010#\u001a\u00020:2\u0006\u0010]\u001a\u00020K2\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010^\u001a\u00020OH\u00d6\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0011R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100\u00a8\u0006_"}, d2 = {"Lcom/google/android/fhir/search/Search;", "", "type", "Lorg/hl7/fhir/r4/model/ResourceType;", "count", "", "from", "(Lorg/hl7/fhir/r4/model/ResourceType;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCount", "()Ljava/lang/Integer;", "setCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "dateFilter", "", "Lcom/google/android/fhir/search/DateFilter;", "getDateFilter$engine_debug", "()Ljava/util/List;", "dateTimeFilter", "Lcom/google/android/fhir/search/DateTimeFilter;", "getDateTimeFilter$engine_debug", "getFrom", "setFrom", "numberFilter", "Lcom/google/android/fhir/search/NumberFilter;", "getNumberFilter$engine_debug", "order", "Lcom/google/android/fhir/search/Order;", "getOrder$engine_debug", "()Lcom/google/android/fhir/search/Order;", "setOrder$engine_debug", "(Lcom/google/android/fhir/search/Order;)V", "referenceFilters", "Lcom/google/android/fhir/search/ReferenceFilter;", "getReferenceFilters$engine_debug", "sort", "Lca/uhn/fhir/rest/gclient/IParam;", "getSort$engine_debug", "()Lca/uhn/fhir/rest/gclient/IParam;", "setSort$engine_debug", "(Lca/uhn/fhir/rest/gclient/IParam;)V", "stringFilters", "Lcom/google/android/fhir/search/StringFilter;", "getStringFilters$engine_debug", "tokenFilters", "Lcom/google/android/fhir/search/TokenFilter;", "getTokenFilters$engine_debug", "getType", "()Lorg/hl7/fhir/r4/model/ResourceType;", "component1", "component2", "component3", "copy", "(Lorg/hl7/fhir/r4/model/ResourceType;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/android/fhir/search/Search;", "equals", "", "other", "filter", "", "dateParameter", "Lca/uhn/fhir/rest/gclient/DateClientParam;", "dateTime", "Lorg/hl7/fhir/r4/model/DateTimeType;", "prefix", "Lca/uhn/fhir/rest/param/ParamPrefixEnum;", "date", "Lorg/hl7/fhir/r4/model/DateType;", "numberParameter", "Lca/uhn/fhir/rest/gclient/NumberClientParam;", "init", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "referenceParameter", "Lca/uhn/fhir/rest/gclient/ReferenceClientParam;", "stringParameter", "Lca/uhn/fhir/rest/gclient/StringClientParam;", "Lca/uhn/fhir/rest/gclient/TokenClientParam;", "boolean", "string", "", "codeType", "Lorg/hl7/fhir/r4/model/CodeType;", "codeableConcept", "Lorg/hl7/fhir/r4/model/CodeableConcept;", "coding", "Lorg/hl7/fhir/r4/model/Coding;", "contactPoint", "Lorg/hl7/fhir/r4/model/ContactPoint;", "identifier", "Lorg/hl7/fhir/r4/model/Identifier;", "uriType", "Lorg/hl7/fhir/r4/model/UriType;", "hashCode", "parameter", "toString", "engine_debug"})
@SearchDslMarker()
public final class Search {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.search.StringFilter> stringFilters = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.search.DateFilter> dateFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.search.DateTimeFilter> dateTimeFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.search.NumberFilter> numberFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.search.ReferenceFilter> referenceFilters = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.android.fhir.search.TokenFilter> tokenFilters = null;
    @org.jetbrains.annotations.Nullable()
    private ca.uhn.fhir.rest.gclient.IParam sort;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.fhir.search.Order order;
    @org.jetbrains.annotations.NotNull()
    private final org.hl7.fhir.r4.model.ResourceType type = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer count;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer from;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.search.StringFilter> getStringFilters$engine_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.search.DateFilter> getDateFilter$engine_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.search.DateTimeFilter> getDateTimeFilter$engine_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.search.NumberFilter> getNumberFilter$engine_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.search.ReferenceFilter> getReferenceFilters$engine_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.fhir.search.TokenFilter> getTokenFilters$engine_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ca.uhn.fhir.rest.gclient.IParam getSort$engine_debug() {
        return null;
    }
    
    public final void setSort$engine_debug(@org.jetbrains.annotations.Nullable()
    ca.uhn.fhir.rest.gclient.IParam p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.fhir.search.Order getOrder$engine_debug() {
        return null;
    }
    
    public final void setOrder$engine_debug(@org.jetbrains.annotations.Nullable()
    com.google.android.fhir.search.Order p0) {
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.StringClientParam stringParameter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.fhir.search.StringFilter, kotlin.Unit> init) {
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.ReferenceClientParam referenceParameter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.fhir.search.ReferenceFilter, kotlin.Unit> init) {
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.DateClientParam dateParameter, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.DateType date, @org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.param.ParamPrefixEnum prefix) {
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.DateClientParam dateParameter, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.DateTimeType dateTime, @org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.param.ParamPrefixEnum prefix) {
    }
    
    public final boolean filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.TokenClientParam filter, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Coding coding) {
        return false;
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.TokenClientParam filter, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.CodeableConcept codeableConcept) {
    }
    
    public final boolean filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.TokenClientParam filter, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.Identifier identifier) {
        return false;
    }
    
    public final boolean filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.TokenClientParam filter, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ContactPoint contactPoint) {
        return false;
    }
    
    public final boolean filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.TokenClientParam filter, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.CodeType codeType) {
        return false;
    }
    
    public final boolean filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.TokenClientParam filter, boolean p1_32355860) {
        return false;
    }
    
    public final boolean filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.TokenClientParam filter, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.UriType uriType) {
        return false;
    }
    
    public final boolean filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.TokenClientParam filter, @org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return false;
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.NumberClientParam numberParameter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.fhir.search.NumberFilter, kotlin.Unit> init) {
    }
    
    public final void sort(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.StringClientParam parameter, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.Order order) {
    }
    
    public final void sort(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.NumberClientParam parameter, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.search.Order order) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hl7.fhir.r4.model.ResourceType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCount() {
        return null;
    }
    
    public final void setCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public Search(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType type, @org.jetbrains.annotations.Nullable()
    java.lang.Integer count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer from) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hl7.fhir.r4.model.ResourceType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.search.Search copy(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType type, @org.jetbrains.annotations.Nullable()
    java.lang.Integer count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer from) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}