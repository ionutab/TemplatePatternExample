public abstract class BrandedEmail {

    final String makeEmail() {
        String emailBody = "";
        emailBody = emailBody + addLogo();
        if (hasCompanyLogo()) {
            emailBody = emailBody + addCompanyLogo();
        }
        emailBody = emailBody + addBody();
        if (hasCallToAction()) {
            emailBody = emailBody + addCallToAction();
        }
        emailBody = emailBody + addSocialAspects();
        if (hasManageNotifications()) {
            emailBody = emailBody + addManageNotifications();
        }
        return wrapTheEmail(emailBody);
    }

    public String wrapTheEmail(String emailBody) {
        return "[ " + emailBody + "] ";
    }

    String addLogo() {
        return "logo ";
    }

    abstract String addCompanyLogo();

    abstract String addBody();

    abstract String addCallToAction();

    String addSocialAspects() {
        return "social aspects ";
    }

    abstract String addManageNotifications();

    boolean hasCompanyLogo() {
        return true;
    }

    boolean hasCallToAction() {
        return true;
    }

    boolean hasManageNotifications() {
        return true;
    }
}
