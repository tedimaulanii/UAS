package com.google.android.fhir.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/google/android/fhir/search/DateFilter;", "", "parameter", "Lca/uhn/fhir/rest/gclient/DateClientParam;", "prefix", "Lca/uhn/fhir/rest/param/ParamPrefixEnum;", "value", "Lorg/hl7/fhir/r4/model/DateType;", "(Lca/uhn/fhir/rest/gclient/DateClientParam;Lca/uhn/fhir/rest/param/ParamPrefixEnum;Lorg/hl7/fhir/r4/model/DateType;)V", "getParameter", "()Lca/uhn/fhir/rest/gclient/DateClientParam;", "getPrefix", "()Lca/uhn/fhir/rest/param/ParamPrefixEnum;", "setPrefix", "(Lca/uhn/fhir/rest/param/ParamPrefixEnum;)V", "getValue", "()Lorg/hl7/fhir/r4/model/DateType;", "setValue", "(Lorg/hl7/fhir/r4/model/DateType;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "engine_debug"})
@SearchDslMarker()
public final class DateFilter {
    @org.jetbrains.annotations.NotNull()
    private final ca.uhn.fhir.rest.gclient.DateClientParam parameter = null;
    @org.jetbrains.annotations.NotNull()
    private ca.uhn.fhir.rest.param.ParamPrefixEnum prefix;
    @org.jetbrains.annotations.Nullable()
    private org.hl7.fhir.r4.model.DateType value;
    
    @org.jetbrains.annotations.NotNull()
    public final ca.uhn.fhir.rest.gclient.DateClientParam getParameter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ca.uhn.fhir.rest.param.ParamPrefixEnum getPrefix() {
        return null;
    }
    
    public final void setPrefix(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.param.ParamPrefixEnum p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.hl7.fhir.r4.model.DateType getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable()
    org.hl7.fhir.r4.model.DateType p0) {
    }
    
    public DateFilter(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.DateClientParam parameter, @org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.param.ParamPrefixEnum prefix, @org.jetbrains.annotations.Nullable()
    org.hl7.fhir.r4.model.DateType value) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ca.uhn.fhir.rest.gclient.DateClientParam component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ca.uhn.fhir.rest.param.ParamPrefixEnum component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.hl7.fhir.r4.model.DateType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.search.DateFilter copy(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.gclient.DateClientParam parameter, @org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.rest.param.ParamPrefixEnum prefix, @org.jetbrains.annotations.Nullable()
    org.hl7.fhir.r4.model.DateType value) {
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