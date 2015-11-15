<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@ page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ page import="pl.mg.liferay.model.Guestbook"%>
<%@ page import="pl.mg.liferay.service.EntryLocalServiceUtil"%>
<%@ page import="pl.mg.liferay.service.GuestbookLocalServiceUtil"%>

<%@ page
	import="pl.mg.liferay.service.permission.GuestbookModelPermission"%>
<%@ page import="pl.mg.liferay.service.permission.GuestbookPermission"%>
<%@ page import="pl.mg.liferay.service.permission.EntryPermission"%>

<portlet:defineObjects />
<theme:defineObjects />