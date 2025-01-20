package com.example.data.db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.data.db.entities.CardInfoEntity;
import com.example.domain.model.BankInfo;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class BinDao_Impl implements BinDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CardInfoEntity> __insertionAdapterOfCardInfoEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCard;

  public BinDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCardInfoEntity = new EntityInsertionAdapter<CardInfoEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `CardInfoEntity` (`bin`,`country`,`latitude`,`longitude`,`scheme`,`brand`,`date`,`name`,`phone`,`url`,`city`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CardInfoEntity entity) {
        statement.bindLong(1, entity.getBin());
        if (entity.getCountry() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCountry());
        }
        if (entity.getLatitude() == null) {
          statement.bindNull(3);
        } else {
          statement.bindDouble(3, entity.getLatitude());
        }
        if (entity.getLongitude() == null) {
          statement.bindNull(4);
        } else {
          statement.bindDouble(4, entity.getLongitude());
        }
        if (entity.getScheme() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getScheme());
        }
        if (entity.getBrand() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getBrand());
        }
        statement.bindLong(7, entity.getDate());
        final BankInfo _tmpBankInfo = entity.getBankInfo();
        if (_tmpBankInfo != null) {
          if (_tmpBankInfo.getName() == null) {
            statement.bindNull(8);
          } else {
            statement.bindString(8, _tmpBankInfo.getName());
          }
          if (_tmpBankInfo.getPhone() == null) {
            statement.bindNull(9);
          } else {
            statement.bindString(9, _tmpBankInfo.getPhone());
          }
          if (_tmpBankInfo.getUrl() == null) {
            statement.bindNull(10);
          } else {
            statement.bindString(10, _tmpBankInfo.getUrl());
          }
          if (_tmpBankInfo.getCity() == null) {
            statement.bindNull(11);
          } else {
            statement.bindString(11, _tmpBankInfo.getCity());
          }
        } else {
          statement.bindNull(8);
          statement.bindNull(9);
          statement.bindNull(10);
          statement.bindNull(11);
        }
      }
    };
    this.__preparedStmtOfDeleteCard = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM cardinfoentity WHERE date = ?";
        return _query;
      }
    };
  }

  @Override
  public Object saveCard(final CardInfoEntity cardInfo,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCardInfoEntity.insert(cardInfo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteCard(final long date, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCard.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, date);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteCard.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllCards(final Continuation<? super List<CardInfoEntity>> $completion) {
    final String _sql = "SELECT * FROM cardinfoentity order by date desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<CardInfoEntity>>() {
      @Override
      @NonNull
      public List<CardInfoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfBin = CursorUtil.getColumnIndexOrThrow(_cursor, "bin");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfScheme = CursorUtil.getColumnIndexOrThrow(_cursor, "scheme");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final List<CardInfoEntity> _result = new ArrayList<CardInfoEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final CardInfoEntity _item;
            final long _tmpBin;
            _tmpBin = _cursor.getLong(_cursorIndexOfBin);
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final Float _tmpLatitude;
            if (_cursor.isNull(_cursorIndexOfLatitude)) {
              _tmpLatitude = null;
            } else {
              _tmpLatitude = _cursor.getFloat(_cursorIndexOfLatitude);
            }
            final Float _tmpLongitude;
            if (_cursor.isNull(_cursorIndexOfLongitude)) {
              _tmpLongitude = null;
            } else {
              _tmpLongitude = _cursor.getFloat(_cursorIndexOfLongitude);
            }
            final String _tmpScheme;
            if (_cursor.isNull(_cursorIndexOfScheme)) {
              _tmpScheme = null;
            } else {
              _tmpScheme = _cursor.getString(_cursorIndexOfScheme);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final BankInfo _tmpBankInfo;
            if (!(_cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPhone) && _cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfCity))) {
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              final String _tmpPhone;
              if (_cursor.isNull(_cursorIndexOfPhone)) {
                _tmpPhone = null;
              } else {
                _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
              }
              final String _tmpUrl;
              if (_cursor.isNull(_cursorIndexOfUrl)) {
                _tmpUrl = null;
              } else {
                _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              }
              final String _tmpCity;
              if (_cursor.isNull(_cursorIndexOfCity)) {
                _tmpCity = null;
              } else {
                _tmpCity = _cursor.getString(_cursorIndexOfCity);
              }
              _tmpBankInfo = new BankInfo(_tmpName,_tmpPhone,_tmpUrl,_tmpCity);
            } else {
              _tmpBankInfo = null;
            }
            _item = new CardInfoEntity(_tmpBin,_tmpCountry,_tmpLatitude,_tmpLongitude,_tmpScheme,_tmpBrand,_tmpBankInfo,_tmpDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
