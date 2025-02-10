public enum MemberTypeWithDiscount {
    NONE(0.0, 0.0),
    SILVER(0.05, 0.05),
    GOLD(0.1, 0.2),
    PREMIUM(0.3, 0.45);

    private final double productDiscountRate;
    private final double serviceDiscountRate;

    MemberTypeWithDiscount(double productDiscountRate, double serviceDiscountRate) {
        this.productDiscountRate = productDiscountRate;
        this.serviceDiscountRate = serviceDiscountRate;
    }

    public double getProductDiscount() {
        return productDiscountRate;
    }

    public double getServiceDiscount() {
        return serviceDiscountRate;
    }
}
