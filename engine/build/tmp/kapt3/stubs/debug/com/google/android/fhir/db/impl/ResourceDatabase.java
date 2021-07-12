package com.google.android.fhir.db.impl;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.google.android.fhir.db.impl.DbTypeConverters.class})
@androidx.room.Database(entities = {com.google.android.fhir.db.impl.entities.ResourceEntity.class, com.google.android.fhir.db.impl.entities.StringIndexEntity.class, com.google.android.fhir.db.impl.entities.ReferenceIndexEntity.class, com.google.android.fhir.db.impl.entities.TokenIndexEntity.class, com.google.android.fhir.db.impl.entities.QuantityIndexEntity.class, com.google.android.fhir.db.impl.entities.UriIndexEntity.class, com.google.android.fhir.db.impl.entities.DateIndexEntity.class, com.google.android.fhir.db.impl.entities.DateTimeIndexEntity.class, com.google.android.fhir.db.impl.entities.NumberIndexEntity.class, com.google.android.fhir.db.impl.entities.SyncedResourceEntity.class, com.google.android.fhir.db.impl.entities.LocalChangeEntity.class, com.google.android.fhir.db.impl.entities.PositionIndexEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/google/android/fhir/db/impl/ResourceDatabase;", "Landroidx/room/RoomDatabase;", "()V", "localChangeDao", "Lcom/google/android/fhir/db/impl/dao/LocalChangeDao;", "resourceDao", "Lcom/google/android/fhir/db/impl/dao/ResourceDao;", "syncedResourceDao", "Lcom/google/android/fhir/db/impl/dao/SyncedResourceDao;", "engine_debug"})
public abstract class ResourceDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.fhir.db.impl.dao.ResourceDao resourceDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.fhir.db.impl.dao.SyncedResourceDao syncedResourceDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.fhir.db.impl.dao.LocalChangeDao localChangeDao();
    
    public ResourceDatabase() {
        super();
    }
}