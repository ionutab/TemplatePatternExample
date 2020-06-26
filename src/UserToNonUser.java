public class UserToNonUser extends BrandedEmail {

    @Override
    String addCompanyLogo() {
        return "";
    }

    @Override
    String addBody() {
        return "User to NON USER body ";
    }

    @Override
    String addCallToAction() {
        return "Call to Action ";
    }

    @Override
    String addManageNotifications() {
        return "";
    }

    @Override
    boolean hasCompanyLogo() {
        return false;
    }

    @Override
    boolean hasManageNotifications() {
        return false;
    }
}
