package com.google.android.fhir.sync;

import java.lang.System;

/**
 * Interface for an abstraction of retrieving static data from a network source. The data can be
 * retrieved in pages and each data retrieval is an expensive operation.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ)\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/google/android/fhir/sync/DataSource;", "", "delete", "Lorg/hl7/fhir/r4/model/OperationOutcome;", "resourceType", "", "resourceId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "Lorg/hl7/fhir/r4/model/Resource;", "payload", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "Lorg/hl7/fhir/r4/model/Bundle;", "path", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "engine_debug"})
public abstract interface DataSource {
    
    /**
     * Implement this method to load remote data based on a url [path]. A service base url is of the
     * form: `http{s}://server/{path}`
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadData(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.hl7.fhir.r4.model.Bundle> p1);
    
    /**
     * Implement this method to create a new instance level resource in the remote server. See
     * http://hl7.org/implement/standards/fhir/http.html#update for details.
     *
     * @param payload is the Resource in JSON form.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String payload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.hl7.fhir.r4.model.Resource> p3);
    
    /**
     * Implement this method to update an existing resource on the remote server. See
     * http://hl7.org/implement/standards/fhir/http.html#patch for details.
     *
     * @param payload is a [JSON patch](https://tools.ietf.org/html/rfc6902)
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String payload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.hl7.fhir.r4.model.OperationOutcome> p3);
    
    /**
     * Implement this method to delete a resource from the remote server. See
     * http://hl7.org/implement/standards/fhir/http.html#delete for details.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String resourceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.hl7.fhir.r4.model.OperationOutcome> p2);
}