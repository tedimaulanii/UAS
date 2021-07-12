package com.google.android.fhir.db.impl;

import java.lang.System;

/**
 * Type converters for Room to persist ResourceType as a string. see:
 * https://developer.android.com/training/data-storage/room/referencing-data
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\rH\u0007J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010H\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0006H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/google/android/fhir/db/impl/DbTypeConverters;", "", "()V", "resourceTypeLookup", "", "", "Lorg/hl7/fhir/r4/model/ResourceType;", "bigDecimalToDouble", "", "value", "Ljava/math/BigDecimal;", "doubleToBigDecimal", "intToLocalChangeType", "Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity$Type;", "", "intToTemporalPrecision", "Lca/uhn/fhir/model/api/TemporalPrecisionEnum;", "intTp", "localChangeTypeToInt", "updateType", "stringToResourceType", "data", "temporalPrecisionToInt", "temporalPrecision", "typeToString", "resourceType", "engine_debug"})
public final class DbTypeConverters {
    private static final java.util.Map<java.lang.String, org.hl7.fhir.r4.model.ResourceType> resourceTypeLookup = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.fhir.db.impl.DbTypeConverters INSTANCE = null;
    
    /**
     * Converts a [ResourceType] into a String to be persisted in the database. This allows us to save
     * [ResourceType] into the database while keeping it as the real type in entities.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final java.lang.String typeToString(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType) {
        return null;
    }
    
    /**
     * Converts a String into a [ResourceType]. Called when a query returns a [ResourceType].
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final org.hl7.fhir.r4.model.ResourceType stringToResourceType(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public static final double bigDecimalToDouble(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final java.math.BigDecimal doubleToBigDecimal(double value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public static final int temporalPrecisionToInt(@org.jetbrains.annotations.NotNull()
    ca.uhn.fhir.model.api.TemporalPrecisionEnum temporalPrecision) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final ca.uhn.fhir.model.api.TemporalPrecisionEnum intToTemporalPrecision(int intTp) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public static final int localChangeTypeToInt(@org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type updateType) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type intToLocalChangeType(int value) {
        return null;
    }
    
    private DbTypeConverters() {
        super();
    }
}