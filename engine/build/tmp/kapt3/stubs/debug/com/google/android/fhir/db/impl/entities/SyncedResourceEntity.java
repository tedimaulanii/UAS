package com.google.android.fhir.db.impl.entities;

import java.lang.System;

/**
 * Class that models a table that holds all resource types that were synced and the highest
 * `_lastUpdate` value of each resource type.
 */
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/google/android/fhir/db/impl/entities/SyncedResourceEntity;", "", "resourceType", "Lorg/hl7/fhir/r4/model/ResourceType;", "lastUpdate", "", "(Lorg/hl7/fhir/r4/model/ResourceType;Ljava/lang/String;)V", "getLastUpdate", "()Ljava/lang/String;", "getResourceType", "()Lorg/hl7/fhir/r4/model/ResourceType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_debug"})
public final class SyncedResourceEntity {
    
    /**
     * Resource synced
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final org.hl7.fhir.r4.model.ResourceType resourceType = null;
    
    /**
     * The highest `_lastUpdate` value of the resources synced of a specific type
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lastUpdate = null;
    
    /**
     * Resource synced
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hl7.fhir.r4.model.ResourceType getResourceType() {
        return null;
    }
    
    /**
     * The highest `_lastUpdate` value of the resources synced of a specific type
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastUpdate() {
        return null;
    }
    
    public SyncedResourceEntity(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String lastUpdate) {
        super();
    }
    
    /**
     * Resource synced
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hl7.fhir.r4.model.ResourceType component1() {
        return null;
    }
    
    /**
     * The highest `_lastUpdate` value of the resources synced of a specific type
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * Class that models a table that holds all resource types that were synced and the highest
     * `_lastUpdate` value of each resource type.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.db.impl.entities.SyncedResourceEntity copy(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String lastUpdate) {
        return null;
    }
    
    /**
     * Class that models a table that holds all resource types that were synced and the highest
     * `_lastUpdate` value of each resource type.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Class that models a table that holds all resource types that were synced and the highest
     * `_lastUpdate` value of each resource type.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Class that models a table that holds all resource types that were synced and the highest
     * `_lastUpdate` value of each resource type.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}