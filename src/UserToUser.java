public class UserToUser extends BrandedEmail {

    @Override
    String addCompanyLogo() {
        return "Company Logo ";
    }

    @Override
    String addBody() {
        return "User to user body ";
    }

    @Override
    String addCallToAction() {
        return "Call to action ";
    }

    @Override
    String addManageNotifications() {
        return "Manage Notifications ";
    }
}
