package pl.mg.liferay.service.base;

import pl.mg.liferay.service.GuestbookLocalServiceUtil;

import java.util.Arrays;

/**
 * @author maciek
 * @generated
 */
public class GuestbookLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName54;
    private String[] _methodParameterTypes54;
    private String _methodName55;
    private String[] _methodParameterTypes55;
    private String _methodName60;
    private String[] _methodParameterTypes60;
    private String _methodName61;
    private String[] _methodParameterTypes61;
    private String _methodName62;
    private String[] _methodParameterTypes62;

    public GuestbookLocalServiceClpInvoker() {
        _methodName0 = "addGuestbook";

        _methodParameterTypes0 = new String[] { "pl.mg.liferay.model.Guestbook" };

        _methodName1 = "createGuestbook";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteGuestbook";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteGuestbook";

        _methodParameterTypes3 = new String[] { "pl.mg.liferay.model.Guestbook" };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchGuestbook";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "fetchGuestbookByUuidAndCompanyId";

        _methodParameterTypes11 = new String[] { "java.lang.String", "long" };

        _methodName12 = "fetchGuestbookByUuidAndGroupId";

        _methodParameterTypes12 = new String[] { "java.lang.String", "long" };

        _methodName13 = "getGuestbook";

        _methodParameterTypes13 = new String[] { "long" };

        _methodName14 = "getPersistedModel";

        _methodParameterTypes14 = new String[] { "java.io.Serializable" };

        _methodName15 = "getGuestbookByUuidAndCompanyId";

        _methodParameterTypes15 = new String[] { "java.lang.String", "long" };

        _methodName16 = "getGuestbookByUuidAndGroupId";

        _methodParameterTypes16 = new String[] { "java.lang.String", "long" };

        _methodName17 = "getGuestbooks";

        _methodParameterTypes17 = new String[] { "int", "int" };

        _methodName18 = "getGuestbooksCount";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "updateGuestbook";

        _methodParameterTypes19 = new String[] { "pl.mg.liferay.model.Guestbook" };

        _methodName54 = "getBeanIdentifier";

        _methodParameterTypes54 = new String[] {  };

        _methodName55 = "setBeanIdentifier";

        _methodParameterTypes55 = new String[] { "java.lang.String" };

        _methodName60 = "getGuestbooks";

        _methodParameterTypes60 = new String[] { "long" };

        _methodName61 = "getGuestbooks";

        _methodParameterTypes61 = new String[] { "long", "int", "int" };

        _methodName62 = "addGuestbook";

        _methodParameterTypes62 = new String[] {
                "long", "java.lang.String",
                "com.liferay.portal.service.ServiceContext"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return GuestbookLocalServiceUtil.addGuestbook((pl.mg.liferay.model.Guestbook) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return GuestbookLocalServiceUtil.createGuestbook(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return GuestbookLocalServiceUtil.deleteGuestbook(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return GuestbookLocalServiceUtil.deleteGuestbook((pl.mg.liferay.model.Guestbook) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return GuestbookLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return GuestbookLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return GuestbookLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return GuestbookLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return GuestbookLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return GuestbookLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return GuestbookLocalServiceUtil.fetchGuestbook(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return GuestbookLocalServiceUtil.fetchGuestbookByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return GuestbookLocalServiceUtil.fetchGuestbookByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return GuestbookLocalServiceUtil.getGuestbook(((Long) arguments[0]).longValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return GuestbookLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return GuestbookLocalServiceUtil.getGuestbookByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return GuestbookLocalServiceUtil.getGuestbookByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            return GuestbookLocalServiceUtil.getGuestbooks(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return GuestbookLocalServiceUtil.getGuestbooksCount();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            return GuestbookLocalServiceUtil.updateGuestbook((pl.mg.liferay.model.Guestbook) arguments[0]);
        }

        if (_methodName54.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
            return GuestbookLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName55.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
            GuestbookLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName60.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
            return GuestbookLocalServiceUtil.getGuestbooks(((Long) arguments[0]).longValue());
        }

        if (_methodName61.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
            return GuestbookLocalServiceUtil.getGuestbooks(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName62.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
            return GuestbookLocalServiceUtil.addGuestbook(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (com.liferay.portal.service.ServiceContext) arguments[2]);
        }

        throw new UnsupportedOperationException();
    }
}