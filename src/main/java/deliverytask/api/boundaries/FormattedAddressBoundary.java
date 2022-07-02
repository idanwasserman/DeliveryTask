package deliverytask.api.boundaries;

public class FormattedAddressBoundary {

    String formattedAddress;

    public FormattedAddressBoundary() {}

    public FormattedAddressBoundary(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public FormattedAddressBoundary setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
        return this;
    }

    @Override
    public String toString() {
        return "FormattedAddressBoundary{" +
                "formattedAddress='" + formattedAddress + '\'' +
                '}';
    }
}
