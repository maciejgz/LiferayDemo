package pl.mg.liferay.service.permission;

import pl.mg.liferay.model.Guestbook;
import pl.mg.liferay.service.GuestbookLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

public class GuestbookPermission {

	public static void check(PermissionChecker permissionChecker,
			long guestbookId, String actionId) throws PortalException,
			SystemException {
		if (!contains(permissionChecker, guestbookId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long guestbookId, String actionId) throws PortalException,
			SystemException {
		Guestbook guestbook = GuestbookLocalServiceUtil
				.getGuestbook(guestbookId);
				
		System.out.println("actionId=" + actionId);
		
		return permissionChecker
				.hasPermission(guestbook.getGroupId(),
						Guestbook.class.getName(), guestbook.getGuestbookId(),
						actionId);
	}

}
