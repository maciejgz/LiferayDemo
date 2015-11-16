package pl.mg.liferay.service.permission;

import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

public class GuestbookModelPermission {

	public static final String RESOURCE_NAME = "pl.mg.liferay.model";

	public static void check(PermissionChecker permissionChecker, long groupId,
			String actionId) throws PrincipalException {
		if (!contains(permissionChecker, groupId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, String actionId) {
		return permissionChecker.hasPermission(groupId, RESOURCE_NAME, groupId,
				actionId);
	}
}
