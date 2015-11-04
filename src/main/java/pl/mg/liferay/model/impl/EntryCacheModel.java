package pl.mg.liferay.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import pl.mg.liferay.model.Entry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Entry in entity cache.
 *
 * @author maciek
 * @see Entry
 * @generated
 */
public class EntryCacheModel implements CacheModel<Entry>, Externalizable {
    public String uuid;
    public long entryId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String email;
    public String message;
    public long guestbookId;
    public int status;
    public long statusByUserId;
    public String statusByUserName;
    public long statusDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", entryId=");
        sb.append(entryId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", name=");
        sb.append(name);
        sb.append(", email=");
        sb.append(email);
        sb.append(", message=");
        sb.append(message);
        sb.append(", guestbookId=");
        sb.append(guestbookId);
        sb.append(", status=");
        sb.append(status);
        sb.append(", statusByUserId=");
        sb.append(statusByUserId);
        sb.append(", statusByUserName=");
        sb.append(statusByUserName);
        sb.append(", statusDate=");
        sb.append(statusDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Entry toEntityModel() {
        EntryImpl entryImpl = new EntryImpl();

        if (uuid == null) {
            entryImpl.setUuid(StringPool.BLANK);
        } else {
            entryImpl.setUuid(uuid);
        }

        entryImpl.setEntryId(entryId);
        entryImpl.setGroupId(groupId);
        entryImpl.setCompanyId(companyId);
        entryImpl.setUserId(userId);

        if (userName == null) {
            entryImpl.setUserName(StringPool.BLANK);
        } else {
            entryImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            entryImpl.setCreateDate(null);
        } else {
            entryImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            entryImpl.setModifiedDate(null);
        } else {
            entryImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            entryImpl.setName(StringPool.BLANK);
        } else {
            entryImpl.setName(name);
        }

        if (email == null) {
            entryImpl.setEmail(StringPool.BLANK);
        } else {
            entryImpl.setEmail(email);
        }

        if (message == null) {
            entryImpl.setMessage(StringPool.BLANK);
        } else {
            entryImpl.setMessage(message);
        }

        entryImpl.setGuestbookId(guestbookId);
        entryImpl.setStatus(status);
        entryImpl.setStatusByUserId(statusByUserId);

        if (statusByUserName == null) {
            entryImpl.setStatusByUserName(StringPool.BLANK);
        } else {
            entryImpl.setStatusByUserName(statusByUserName);
        }

        if (statusDate == Long.MIN_VALUE) {
            entryImpl.setStatusDate(null);
        } else {
            entryImpl.setStatusDate(new Date(statusDate));
        }

        entryImpl.resetOriginalValues();

        return entryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        entryId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        email = objectInput.readUTF();
        message = objectInput.readUTF();
        guestbookId = objectInput.readLong();
        status = objectInput.readInt();
        statusByUserId = objectInput.readLong();
        statusByUserName = objectInput.readUTF();
        statusDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(entryId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (message == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(message);
        }

        objectOutput.writeLong(guestbookId);
        objectOutput.writeInt(status);
        objectOutput.writeLong(statusByUserId);

        if (statusByUserName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(statusByUserName);
        }

        objectOutput.writeLong(statusDate);
    }
}
