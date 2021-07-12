package com.google.android.fhir.db.impl.entities;

import java.lang.System;

@androidx.room.Entity(indices = {@androidx.room.Index(value = {"resourceType", "index_name", "index_from", "index_to"}), @androidx.room.Index(value = {"resourceId", "resourceType"})}, foreignKeys = {@androidx.room.ForeignKey(entity = com.google.android.fhir.db.impl.entities.ResourceEntity.class, childColumns = {"resourceId", "resourceType"}, deferred = true, onUpdate = 1, onDelete = 5, parentColumns = {"resourceId", "resourceType"})})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/google/android/fhir/db/impl/entities/DateIndexEntity;", "", "id", "", "resourceType", "Lorg/hl7/fhir/r4/model/ResourceType;", "index", "Lcom/google/android/fhir/index/entities/DateIndex;", "resourceId", "", "(JLorg/hl7/fhir/r4/model/ResourceType;Lcom/google/android/fhir/index/entities/DateIndex;Ljava/lang/String;)V", "getId", "()J", "getIndex", "()Lcom/google/android/fhir/index/entities/DateIndex;", "getResourceId", "()Ljava/lang/String;", "getResourceType", "()Lorg/hl7/fhir/r4/model/ResourceType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_debug"})
public final class DateIndexEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final org.hl7.fhir.r4.model.ResourceType resourceType = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "index_")
    private final com.google.android.fhir.index.entities.DateIndex index = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String resourceId = null;
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hl7.fhir.r4.model.ResourceType getResourceType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.index.entities.DateIndex getIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResourceId() {
        return null;
    }
    
    public DateIndexEntity(long id, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.index.entities.DateIndex index, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hl7.fhir.r4.model.ResourceType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.index.entities.DateIndex component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.db.impl.entities.DateIndexEntity copy(long id, @org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType resourceType, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.index.entities.DateIndex index, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId) {
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