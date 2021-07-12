package com.google.android.fhir.db.impl.entities;

import java.lang.System;

/**
 * When a local change to a resource happens, the lastUpdated timestamp in [ResourceEntity] is
 * updated and the diff itself is inserted in this table. The value of the diff depends upon the
 * type of change and can be:
 * * DELETE: The empty string, "".
 * * INSERT: The full resource in JSON form, e.g. {
 * ```
 *     "resourceType": "Patient",
 *     "id": "animal",
 *     "name": [
 *             {
 *              "use": "usual",
 *              "given": [
 *              "Kenzi"
 *             ]
 *             }
 *       ],
 *     ...
 * ```
 * }
 * * UPDATE: A RFC 6902 JSON patch. e.g. a patch that changes the given name of a patient: [
 * ```
 *     {
 *     "op": "replace",
 *     "path": "/name/0/given/0",
 *     "value": "Binny"
 *     }
 * ```
 * ] For resource that is fully synced with server this table should not have any rows.
 */
@androidx.room.Entity(indices = {@androidx.room.Index(value = {"resourceType", "resourceId"})})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity;", "", "id", "", "resourceType", "", "resourceId", "timestamp", "type", "Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity$Type;", "payload", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity$Type;Ljava/lang/String;)V", "getId", "()J", "getPayload", "()Ljava/lang/String;", "getResourceId", "getResourceType", "getTimestamp", "getType", "()Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "engine_debug"})
public final class LocalChangeEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String resourceType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String resourceId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timestamp = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payload = null;
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResourceType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResourceId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayload() {
        return null;
    }
    
    public LocalChangeEntity(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String timestamp, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type type, @org.jetbrains.annotations.NotNull()
    java.lang.String payload) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * When a local change to a resource happens, the lastUpdated timestamp in [ResourceEntity] is
     * updated and the diff itself is inserted in this table. The value of the diff depends upon the
     * type of change and can be:
     * * DELETE: The empty string, "".
     * * INSERT: The full resource in JSON form, e.g. {
     * ```
     *     "resourceType": "Patient",
     *     "id": "animal",
     *     "name": [
     *             {
     *              "use": "usual",
     *              "given": [
     *              "Kenzi"
     *             ]
     *             }
     *       ],
     *     ...
     * ```
     * }
     * * UPDATE: A RFC 6902 JSON patch. e.g. a patch that changes the given name of a patient: [
     * ```
     *     {
     *     "op": "replace",
     *     "path": "/name/0/given/0",
     *     "value": "Binny"
     *     }
     * ```
     * ] For resource that is fully synced with server this table should not have any rows.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.fhir.db.impl.entities.LocalChangeEntity copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String timestamp, @org.jetbrains.annotations.NotNull()
    com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type type, @org.jetbrains.annotations.NotNull()
    java.lang.String payload) {
        return null;
    }
    
    /**
     * When a local change to a resource happens, the lastUpdated timestamp in [ResourceEntity] is
     * updated and the diff itself is inserted in this table. The value of the diff depends upon the
     * type of change and can be:
     * * DELETE: The empty string, "".
     * * INSERT: The full resource in JSON form, e.g. {
     * ```
     *     "resourceType": "Patient",
     *     "id": "animal",
     *     "name": [
     *             {
     *              "use": "usual",
     *              "given": [
     *              "Kenzi"
     *             ]
     *             }
     *       ],
     *     ...
     * ```
     * }
     * * UPDATE: A RFC 6902 JSON patch. e.g. a patch that changes the given name of a patient: [
     * ```
     *     {
     *     "op": "replace",
     *     "path": "/name/0/given/0",
     *     "value": "Binny"
     *     }
     * ```
     * ] For resource that is fully synced with server this table should not have any rows.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * When a local change to a resource happens, the lastUpdated timestamp in [ResourceEntity] is
     * updated and the diff itself is inserted in this table. The value of the diff depends upon the
     * type of change and can be:
     * * DELETE: The empty string, "".
     * * INSERT: The full resource in JSON form, e.g. {
     * ```
     *     "resourceType": "Patient",
     *     "id": "animal",
     *     "name": [
     *             {
     *              "use": "usual",
     *              "given": [
     *              "Kenzi"
     *             ]
     *             }
     *       ],
     *     ...
     * ```
     * }
     * * UPDATE: A RFC 6902 JSON patch. e.g. a patch that changes the given name of a patient: [
     * ```
     *     {
     *     "op": "replace",
     *     "path": "/name/0/given/0",
     *     "value": "Binny"
     *     }
     * ```
     * ] For resource that is fully synced with server this table should not have any rows.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * When a local change to a resource happens, the lastUpdated timestamp in [ResourceEntity] is
     * updated and the diff itself is inserted in this table. The value of the diff depends upon the
     * type of change and can be:
     * * DELETE: The empty string, "".
     * * INSERT: The full resource in JSON form, e.g. {
     * ```
     *     "resourceType": "Patient",
     *     "id": "animal",
     *     "name": [
     *             {
     *              "use": "usual",
     *              "given": [
     *              "Kenzi"
     *             ]
     *             }
     *       ],
     *     ...
     * ```
     * }
     * * UPDATE: A RFC 6902 JSON patch. e.g. a patch that changes the given name of a patient: [
     * ```
     *     {
     *     "op": "replace",
     *     "path": "/name/0/given/0",
     *     "value": "Binny"
     *     }
     * ```
     * ] For resource that is fully synced with server this table should not have any rows.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity$Type;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "INSERT", "UPDATE", "DELETE", "Companion", "engine_debug"})
    public static enum Type {
        /*public static final*/ INSERT /* = new INSERT(0) */,
        /*public static final*/ UPDATE /* = new UPDATE(0) */,
        /*public static final*/ DELETE /* = new DELETE(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        public static final com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type.Companion Companion = null;
        
        public final int getValue() {
            return 0;
        }
        
        Type(int value) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity$Type$Companion;", "", "()V", "from", "Lcom/google/android/fhir/db/impl/entities/LocalChangeEntity$Type;", "input", "", "engine_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.android.fhir.db.impl.entities.LocalChangeEntity.Type from(int input) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}