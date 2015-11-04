package pl.mg.liferay.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import pl.mg.liferay.model.Entry;
import pl.mg.liferay.model.Guestbook;
import pl.mg.liferay.service.EntryLocalServiceUtil;
import pl.mg.liferay.service.GuestbookLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class GuestbookPortlet
 */
public class GuestbookPortlet extends MVCPortlet {

	private static final String GUESTBOOK_ENTRIES = "guestbook-entries";

	public void addGuestbook(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Guestbook.class.getName(), request);
		String name = ParamUtil.getString(request, "name");
		try {
			GuestbookLocalServiceUtil.addGuestbook(serviceContext.getUserId(),
					name, serviceContext);
			SessionMessages.add(request, "guesbookAdded");
		} catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());

			response.setRenderParameter("mvcPath",
					"/html/guestbook/edit_guestbook.jsp");
		}
	}

	// old version for non service approach
	/*
	 * @Override public void render(RenderRequest renderRequest, RenderResponse
	 * renderResponse) throws PortletException, IOException { PortletPreferences
	 * prefs = renderRequest.getPreferences(); String[] guestbookEntries =
	 * prefs.getValues("guestbook-entries", new String[1]); if (guestbookEntries
	 * != null) { List<Entry> entries = parseEntries(guestbookEntries);
	 * renderRequest.setAttribute("entries", entries); }
	 * super.render(renderRequest, renderResponse); }
	 */

	// old version for non service approach
	/*
	 * private List<Entry> parseEntries(String[] guestbookEntries) {
	 * ArrayList<Entry> entries = new ArrayList();
	 * 
	 * for (String entry : guestbookEntries) { String[] parts =
	 * entry.split("\\^", 2); Entry gbEntry = new EntryImpl(parts[0], parts[1]);
	 * entries.add(gbEntry); }
	 * 
	 * return entries; }
	 */

	@Override
	public void render(RenderRequest renderRequest,
			RenderResponse renderResponse) throws PortletException, IOException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					Guestbook.class.getName(), renderRequest);

			long groupId = serviceContext.getScopeGroupId();
			long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");
			List<Guestbook> guestbooks = GuestbookLocalServiceUtil
					.getGuestbooks(groupId);

			if (guestbooks.size() == 0) {
				Guestbook guestbook = GuestbookLocalServiceUtil.addGuestbook(
						serviceContext.getUserId(), "Main", serviceContext);
				guestbookId = guestbook.getGuestbookId();
			}

			if (!(guestbookId > 0)) {
				guestbookId = guestbooks.get(0).getGuestbookId();
			}

			renderRequest.setAttribute("guestbookId", guestbookId);

		} catch (Exception e) {
			throw new PortletException(e);
		}
		super.render(renderRequest, renderResponse);
	}

	public void addEntry(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Entry.class.getName(), request);

		// pobieranie wartosci z formularza w jsp
		String userName = ParamUtil.getString(request, "name");
		String email = ParamUtil.getString(request, "email");
		String message = ParamUtil.getString(request, "message");
		long guestbookId = ParamUtil.getLong(request, "guestbookId");

		try {
			EntryLocalServiceUtil.addEntry(serviceContext.getUserId(),
					guestbookId, userName, email, message, serviceContext);
			SessionMessages.add(request, "entryAdded");
			response.setRenderParameter("guestbookId",
					Long.toString(guestbookId));
		} catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath",
					"/html/guestbook/edit_entry.jsp");
		}
	}

	// non service-method
	/*
	 * public void addEntry(ActionRequest request, ActionResponse response) {
	 * 
	 * try {
	 * 
	 * PortletPreferences prefs = request.getPreferences();
	 * 
	 * String[] guestbookEntries = prefs.getValues(GUESTBOOK_ENTRIES, new
	 * String[1]);
	 * 
	 * ArrayList<String> entries = new ArrayList<String>();
	 * 
	 * if (guestbookEntries != null) {
	 * 
	 * entries = new ArrayList<String>(Arrays.asList(prefs.getValues(
	 * GUESTBOOK_ENTRIES, new String[1])));
	 * 
	 * }
	 * 
	 * String userName = ParamUtil.getString(request, "name"); String message =
	 * ParamUtil.getString(request, "message"); String entry = userName + "^" +
	 * message;
	 * 
	 * entries.add(entry);
	 * 
	 * String[] array = entries.toArray(new String[entries.size()]);
	 * 
	 * prefs.setValues(GUESTBOOK_ENTRIES, array);
	 * 
	 * try {
	 * 
	 * prefs.store();
	 * 
	 * } catch (IOException ex) {
	 * 
	 * Logger.getLogger(GuestbookPortlet.class.getName()).log( Level.SEVERE,
	 * null, ex);
	 * 
	 * } catch (ValidatorException ex) {
	 * 
	 * Logger.getLogger(GuestbookPortlet.class.getName()).log( Level.SEVERE,
	 * null, ex);
	 * 
	 * }
	 * 
	 * } catch (ReadOnlyException ex) {
	 * 
	 * Logger.getLogger(GuestbookPortlet.class.getName()).log( Level.SEVERE,
	 * null, ex);
	 * 
	 * }
	 */

}
