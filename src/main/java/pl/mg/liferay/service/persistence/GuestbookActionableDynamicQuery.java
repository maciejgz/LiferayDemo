package pl.mg.liferay.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import pl.mg.liferay.model.Guestbook;
import pl.mg.liferay.service.GuestbookLocalServiceUtil;

/**
 * @author maciek
 * @generated
 */
public abstract class GuestbookActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public GuestbookActionableDynamicQuery() throws SystemException {
        setBaseLocalService(GuestbookLocalServiceUtil.getService());
        setClass(Guestbook.class);

        setClassLoader(pl.mg.liferay.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("guestbookId");
    }
}
