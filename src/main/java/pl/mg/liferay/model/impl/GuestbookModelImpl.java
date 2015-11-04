package pl.mg.liferay.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import pl.mg.liferay.model.Guestbook;
import pl.mg.liferay.model.GuestbookModel;
import pl.mg.liferay.model.GuestbookSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Guestbook service. Represents a row in the &quot;GB_Guestbook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link pl.mg.liferay.model.GuestbookModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GuestbookImpl}.
 * </p>
 *
 * @author maciek
 * @see GuestbookImpl
 * @see pl.mg.liferay.model.Guestbook
 * @see pl.mg.liferay.model.GuestbookModel
 * @generated
 */
@JSON(strict = true)
public class GuestbookModelImpl extends BaseModelImpl<Guestbook>
    implements GuestbookModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a guestbook model instance should use the {@link pl.mg.liferay.model.Guestbook} interface instead.
     */
    public static final String TABLE_NAME = "GB_Guestbook";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "guestbookId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "name", Types.VARCHAR },
            { "status", Types.INTEGER },
            { "statusByUserId", Types.BIGINT },
            { "statusByUserName", Types.VARCHAR },
            { "statusDate", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table GB_Guestbook (uuid_ VARCHAR(75) null,guestbookId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null)";
    public static final String TABLE_SQL_DROP = "drop table GB_Guestbook";
    public static final String ORDER_BY_JPQL = " ORDER BY guestbook.guestbookId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY GB_Guestbook.guestbookId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.pl.mg.liferay.model.Guestbook"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.pl.mg.liferay.model.Guestbook"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.pl.mg.liferay.model.Guestbook"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long GROUPID_COLUMN_BITMASK = 2L;
    public static long NAME_COLUMN_BITMASK = 4L;
    public static long STATUS_COLUMN_BITMASK = 8L;
    public static long UUID_COLUMN_BITMASK = 16L;
    public static long GUESTBOOKID_COLUMN_BITMASK = 32L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.pl.mg.liferay.model.Guestbook"));
    private static ClassLoader _classLoader = Guestbook.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Guestbook.class
        };
    private String _uuid;
    private String _originalUuid;
    private long _guestbookId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _companyId;
    private long _originalCompanyId;
    private boolean _setOriginalCompanyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _originalName;
    private int _status;
    private int _originalStatus;
    private boolean _setOriginalStatus;
    private long _statusByUserId;
    private String _statusByUserUuid;
    private String _statusByUserName;
    private Date _statusDate;
    private long _columnBitmask;
    private Guestbook _escapedModel;

    public GuestbookModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Guestbook toModel(GuestbookSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Guestbook model = new GuestbookImpl();

        model.setUuid(soapModel.getUuid());
        model.setGuestbookId(soapModel.getGuestbookId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setName(soapModel.getName());
        model.setStatus(soapModel.getStatus());
        model.setStatusByUserId(soapModel.getStatusByUserId());
        model.setStatusByUserName(soapModel.getStatusByUserName());
        model.setStatusDate(soapModel.getStatusDate());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Guestbook> toModels(GuestbookSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Guestbook> models = new ArrayList<Guestbook>(soapModels.length);

        for (GuestbookSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _guestbookId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setGuestbookId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _guestbookId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Guestbook.class;
    }

    @Override
    public String getModelClassName() {
        return Guestbook.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("guestbookId", getGuestbookId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusByUserName", getStatusByUserName());
        attributes.put("statusDate", getStatusDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long guestbookId = (Long) attributes.get("guestbookId");

        if (guestbookId != null) {
            setGuestbookId(guestbookId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusByUserId = (Long) attributes.get("statusByUserId");

        if (statusByUserId != null) {
            setStatusByUserId(statusByUserId);
        }

        String statusByUserName = (String) attributes.get("statusByUserName");

        if (statusByUserName != null) {
            setStatusByUserName(statusByUserName);
        }

        Date statusDate = (Date) attributes.get("statusDate");

        if (statusDate != null) {
            setStatusDate(statusDate);
        }
    }

    @JSON
    @Override
    public String getUuid() {
        if (_uuid == null) {
            return StringPool.BLANK;
        } else {
            return _uuid;
        }
    }

    @Override
    public void setUuid(String uuid) {
        if (_originalUuid == null) {
            _originalUuid = _uuid;
        }

        _uuid = uuid;
    }

    public String getOriginalUuid() {
        return GetterUtil.getString(_originalUuid);
    }

    @JSON
    @Override
    public long getGuestbookId() {
        return _guestbookId;
    }

    @Override
    public void setGuestbookId(long guestbookId) {
        _guestbookId = guestbookId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _columnBitmask |= COMPANYID_COLUMN_BITMASK;

        if (!_setOriginalCompanyId) {
            _setOriginalCompanyId = true;

            _originalCompanyId = _companyId;
        }

        _companyId = companyId;
    }

    public long getOriginalCompanyId() {
        return _originalCompanyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _columnBitmask |= NAME_COLUMN_BITMASK;

        if (_originalName == null) {
            _originalName = _name;
        }

        _name = name;
    }

    public String getOriginalName() {
        return GetterUtil.getString(_originalName);
    }

    @JSON
    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _columnBitmask |= STATUS_COLUMN_BITMASK;

        if (!_setOriginalStatus) {
            _setOriginalStatus = true;

            _originalStatus = _status;
        }

        _status = status;
    }

    public int getOriginalStatus() {
        return _originalStatus;
    }

    @JSON
    @Override
    public long getStatusByUserId() {
        return _statusByUserId;
    }

    @Override
    public void setStatusByUserId(long statusByUserId) {
        _statusByUserId = statusByUserId;
    }

    @Override
    public String getStatusByUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
            _statusByUserUuid);
    }

    @Override
    public void setStatusByUserUuid(String statusByUserUuid) {
        _statusByUserUuid = statusByUserUuid;
    }

    @JSON
    @Override
    public String getStatusByUserName() {
        if (_statusByUserName == null) {
            return StringPool.BLANK;
        } else {
            return _statusByUserName;
        }
    }

    @Override
    public void setStatusByUserName(String statusByUserName) {
        _statusByUserName = statusByUserName;
    }

    @JSON
    @Override
    public Date getStatusDate() {
        return _statusDate;
    }

    @Override
    public void setStatusDate(Date statusDate) {
        _statusDate = statusDate;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Guestbook.class.getName()));
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #isApproved}
     */
    @Override
    public boolean getApproved() {
        return isApproved();
    }

    @Override
    public boolean isApproved() {
        if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isDenied() {
        if (getStatus() == WorkflowConstants.STATUS_DENIED) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isDraft() {
        if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isExpired() {
        if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isInactive() {
        if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isIncomplete() {
        if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isPending() {
        if (getStatus() == WorkflowConstants.STATUS_PENDING) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isScheduled() {
        if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
            return true;
        } else {
            return false;
        }
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Guestbook.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Guestbook toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Guestbook) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        GuestbookImpl guestbookImpl = new GuestbookImpl();

        guestbookImpl.setUuid(getUuid());
        guestbookImpl.setGuestbookId(getGuestbookId());
        guestbookImpl.setGroupId(getGroupId());
        guestbookImpl.setCompanyId(getCompanyId());
        guestbookImpl.setUserId(getUserId());
        guestbookImpl.setUserName(getUserName());
        guestbookImpl.setCreateDate(getCreateDate());
        guestbookImpl.setModifiedDate(getModifiedDate());
        guestbookImpl.setName(getName());
        guestbookImpl.setStatus(getStatus());
        guestbookImpl.setStatusByUserId(getStatusByUserId());
        guestbookImpl.setStatusByUserName(getStatusByUserName());
        guestbookImpl.setStatusDate(getStatusDate());

        guestbookImpl.resetOriginalValues();

        return guestbookImpl;
    }

    @Override
    public int compareTo(Guestbook guestbook) {
        long primaryKey = guestbook.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Guestbook)) {
            return false;
        }

        Guestbook guestbook = (Guestbook) obj;

        long primaryKey = guestbook.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        GuestbookModelImpl guestbookModelImpl = this;

        guestbookModelImpl._originalUuid = guestbookModelImpl._uuid;

        guestbookModelImpl._originalGroupId = guestbookModelImpl._groupId;

        guestbookModelImpl._setOriginalGroupId = false;

        guestbookModelImpl._originalCompanyId = guestbookModelImpl._companyId;

        guestbookModelImpl._setOriginalCompanyId = false;

        guestbookModelImpl._originalName = guestbookModelImpl._name;

        guestbookModelImpl._originalStatus = guestbookModelImpl._status;

        guestbookModelImpl._setOriginalStatus = false;

        guestbookModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Guestbook> toCacheModel() {
        GuestbookCacheModel guestbookCacheModel = new GuestbookCacheModel();

        guestbookCacheModel.uuid = getUuid();

        String uuid = guestbookCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            guestbookCacheModel.uuid = null;
        }

        guestbookCacheModel.guestbookId = getGuestbookId();

        guestbookCacheModel.groupId = getGroupId();

        guestbookCacheModel.companyId = getCompanyId();

        guestbookCacheModel.userId = getUserId();

        guestbookCacheModel.userName = getUserName();

        String userName = guestbookCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            guestbookCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            guestbookCacheModel.createDate = createDate.getTime();
        } else {
            guestbookCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            guestbookCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            guestbookCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        guestbookCacheModel.name = getName();

        String name = guestbookCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            guestbookCacheModel.name = null;
        }

        guestbookCacheModel.status = getStatus();

        guestbookCacheModel.statusByUserId = getStatusByUserId();

        guestbookCacheModel.statusByUserName = getStatusByUserName();

        String statusByUserName = guestbookCacheModel.statusByUserName;

        if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
            guestbookCacheModel.statusByUserName = null;
        }

        Date statusDate = getStatusDate();

        if (statusDate != null) {
            guestbookCacheModel.statusDate = statusDate.getTime();
        } else {
            guestbookCacheModel.statusDate = Long.MIN_VALUE;
        }

        return guestbookCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", guestbookId=");
        sb.append(getGuestbookId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", statusByUserId=");
        sb.append(getStatusByUserId());
        sb.append(", statusByUserName=");
        sb.append(getStatusByUserName());
        sb.append(", statusDate=");
        sb.append(getStatusDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("pl.mg.liferay.model.Guestbook");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>guestbookId</column-name><column-value><![CDATA[");
        sb.append(getGuestbookId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
        sb.append(getStatusByUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
        sb.append(getStatusByUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusDate</column-name><column-value><![CDATA[");
        sb.append(getStatusDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
