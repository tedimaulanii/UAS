package com.google.android.fhir.db.impl.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.android.fhir.db.impl.DbTypeConverters;
import com.google.android.fhir.db.impl.entities.LocalChangeEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.ResourceType;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LocalChangeDao_Impl extends LocalChangeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LocalChangeEntity> __insertionAdapterOfLocalChangeEntity;

  private final SharedSQLiteStatement __preparedStmtOfDiscardLocalChanges;

  public LocalChangeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLocalChangeEntity = new EntityInsertionAdapter<LocalChangeEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `LocalChangeEntity` (`id`,`resourceType`,`resourceId`,`timestamp`,`type`,`payload`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocalChangeEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getResourceType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getResourceType());
        }
        if (value.getResourceId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResourceId());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimestamp());
        }
        final int _tmp;
        _tmp = DbTypeConverters.INSTANCE.localChangeTypeToInt(value.getType());
        stmt.bindLong(5, _tmp);
        if (value.getPayload() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPayload());
        }
      }
    };
    this.__preparedStmtOfDiscardLocalChanges = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE FROM LocalChangeEntity\n"
                + "        WHERE LocalChangeEntity.id = (?)\n"
                + "    ";
        return _query;
      }
    };
  }

  @Override
  public Object addLocalChange(final LocalChangeEntity localChangeEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfLocalChangeEntity.insert(localChangeEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object addInsertAll(final List<? extends Resource> resources,
      final Continuation<? super Unit> p1) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Unit>, Object>() {
      @Override
      public Object invoke(Continuation<? super Unit> __cont) {
        return LocalChangeDao_Impl.super.addInsertAll(resources, __cont);
      }
    }, p1);
  }

  @Override
  public Object discardLocalChanges(final long id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDiscardLocalChanges.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDiscardLocalChanges.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object lastChangeType(final String resourceId, final ResourceType resourceType,
      final Continuation<? super LocalChangeEntity.Type> p2) {
    final String _sql = "\n"
            + "        SELECT type \n"
            + "        FROM LocalChangeEntity \n"
            + "        WHERE resourceId = ? \n"
            + "        AND resourceType = ? \n"
            + "        ORDER BY id ASC\n"
            + "        LIMIT 1\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (resourceId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, resourceId);
    }
    _argIndex = 2;
    final String _tmp;
    _tmp = DbTypeConverters.INSTANCE.typeToString(resourceType);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<LocalChangeEntity.Type>() {
      @Override
      public LocalChangeEntity.Type call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final LocalChangeEntity.Type _result;
          if(_cursor.moveToFirst()) {
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(0);
            _result = DbTypeConverters.INSTANCE.intToLocalChangeType(_tmp_1);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p2);
  }

  @Override
  public Object countLastChange(final String resourceId, final ResourceType resourceType,
      final Continuation<? super Integer> p2) {
    final String _sql = "\n"
            + "        SELECT COUNT(type) \n"
            + "        FROM LocalChangeEntity \n"
            + "        WHERE resourceId = ? \n"
            + "        AND resourceType = ?\n"
            + "        LIMIT 1\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (resourceId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, resourceId);
    }
    _argIndex = 2;
    final String _tmp;
    _tmp = DbTypeConverters.INSTANCE.typeToString(resourceType);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp_1;
            if (_cursor.isNull(0)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(0);
            }
            _result = _tmp_1;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p2);
  }

  @Override
  public Object getAllLocalChanges(final Continuation<? super List<LocalChangeEntity>> p0) {
    final String _sql = "\n"
            + "        SELECT *\n"
            + "        FROM LocalChangeEntity\n"
            + "        ORDER BY LocalChangeEntity.id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<LocalChangeEntity>>() {
      @Override
      public List<LocalChangeEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfResourceType = CursorUtil.getColumnIndexOrThrow(_cursor, "resourceType");
          final int _cursorIndexOfResourceId = CursorUtil.getColumnIndexOrThrow(_cursor, "resourceId");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfPayload = CursorUtil.getColumnIndexOrThrow(_cursor, "payload");
          final List<LocalChangeEntity> _result = new ArrayList<LocalChangeEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final LocalChangeEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpResourceType;
            if (_cursor.isNull(_cursorIndexOfResourceType)) {
              _tmpResourceType = null;
            } else {
              _tmpResourceType = _cursor.getString(_cursorIndexOfResourceType);
            }
            final String _tmpResourceId;
            if (_cursor.isNull(_cursorIndexOfResourceId)) {
              _tmpResourceId = null;
            } else {
              _tmpResourceId = _cursor.getString(_cursorIndexOfResourceId);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            final LocalChangeEntity.Type _tmpType;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfType);
            _tmpType = DbTypeConverters.INSTANCE.intToLocalChangeType(_tmp);
            final String _tmpPayload;
            if (_cursor.isNull(_cursorIndexOfPayload)) {
              _tmpPayload = null;
            } else {
              _tmpPayload = _cursor.getString(_cursorIndexOfPayload);
            }
            _item = new LocalChangeEntity(_tmpId,_tmpResourceType,_tmpResourceId,_tmpTimestamp,_tmpType,_tmpPayload);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
