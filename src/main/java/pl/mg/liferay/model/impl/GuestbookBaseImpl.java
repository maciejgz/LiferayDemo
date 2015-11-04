package pl.mg.liferay.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import pl.mg.liferay.model.Guestbook;
import pl.mg.liferay.service.GuestbookLocalServiceUtil;

/**
 * The extended model base implementation for the Guestbook service. Represents a row in the &quot;GB_Guestbook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GuestbookImpl}.
 * </p>
 *
 * @author maciek
 * @see GuestbookImpl
 * @see pl.mg.liferay.model.Guestbook
 * @generated
 */
public abstract class GuestbookBaseImpl extends GuestbookModelImpl
    implements Guestbook {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a guestbook model instance should use the {@link Guestbook} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            GuestbookLocalServiceUtil.addGuestbook(this);
        } else {
            GuestbookLocalServiceUtil.updateGuestbook(this);
        }
    }
}