package com.google.android.fhir;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/google/android/fhir/SyncDownloadContext;", "", "getLatestTimestampFor", "", "type", "Lorg/hl7/fhir/r4/model/ResourceType;", "(Lorg/hl7/fhir/r4/model/ResourceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "engine_debug"})
public abstract interface SyncDownloadContext {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLatestTimestampFor(@org.jetbrains.annotations.NotNull()
    org.hl7.fhir.r4.model.ResourceType type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1);
}