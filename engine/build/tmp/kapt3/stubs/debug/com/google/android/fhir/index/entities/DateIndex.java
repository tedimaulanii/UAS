package com.google.android.fhir.index.entities;

import java.lang.System;

/**
 * An index record for a `Date` value in a FHIR resource.
 *
 * Note one fundamental difference between `Date` and `DateTime` data types in FHIR in that `Date`
 * does not contain timezone info where `DateTime` does.
 *
 * See https://hl7.org/FHIR/search.html#date.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/google/android/fhir/index/entities/DateIndex;", "", "name", "", "path", "from", "", "to", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getFrom", "()J", "getName", "()Ljava/lang/String;", "getPath", "getTo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_debug"})
public final class DateIndex {
    
    /**
     * The name of the date index, e.g. "birthdate".
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    /**
     * The path of the date index, e.g. "Patient.birthdate".
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = null;
    
    /**
     * The epoch day of the first date.
     */
    private final long from = 0L;
    
    /**
     * The epoch day of the last date.
     */
    private final long to = 0L;
    
    /**
     * The name of the date index, e.g. "birthdate".
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * The path of the date index, e.g. "Patient.birthdate".
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    /**
     * The epoch day of the first date.
     */
    public final long getFrom() {
        return 0L;
    }
    
    /**
     * The epoch day of the last date.
     */
    public final long getTo() {
        return 0L;
    }
    
    public DateIndex(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String path, long from, long to) {
        super();
    }
    
    /**
     * The name of the date index, e.g. "birthdate".
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * The path of the date index, e.g. "Patient.birthdate".
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * The epoch day of the first date.
     */
    public final long component3() {
        return 0L;
    }
    
    /**
     * The epoch day of the last date.
     */
    public final long component4() {
        return 0L;
    }
    
    /**
     * An index record for a `Date` value in a FHIR resource.
     *
     * Note one fundamental difference between `Date` and `DateTime` data types in FHIR in that `Date`
     * does not contain timezone info where `DateTime` does.
     *
     * See https://hl7.org/FHIR/search.html#date.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.index.entities.DateIndex copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String path, long from, long to) {
        return null;
    }
    
    /**
     * An index record for a `Date` value in a FHIR resource.
     *
     * Note one fundamental difference between `Date` and `DateTime` data types in FHIR in that `Date`
     * does not contain timezone info where `DateTime` does.
     *
     * See https://hl7.org/FHIR/search.html#date.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * An index record for a `Date` value in a FHIR resource.
     *
     * Note one fundamental difference between `Date` and `DateTime` data types in FHIR in that `Date`
     * does not contain timezone info where `DateTime` does.
     *
     * See https://hl7.org/FHIR/search.html#date.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * An index record for a `Date` value in a FHIR resource.
     *
     * Note one fundamental difference between `Date` and `DateTime` data types in FHIR in that `Date`
     * does not contain timezone info where `DateTime` does.
     *
     * See https://hl7.org/FHIR/search.html#date.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}