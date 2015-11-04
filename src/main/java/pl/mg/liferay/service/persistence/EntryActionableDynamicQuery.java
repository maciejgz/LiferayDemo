package pl.mg.liferay.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import pl.mg.liferay.model.Entry;
import pl.mg.liferay.service.EntryLocalServiceUtil;

/**
 * @author maciek
 * @generated
 */
public abstract class EntryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EntryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EntryLocalServiceUtil.getService());
        setClass(Entry.class);

        setClassLoader(pl.mg.liferay.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("entryId");
    }
}
