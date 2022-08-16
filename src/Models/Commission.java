package Models;

public class Commission {
    private int totalLocks, totalStocks, totalBarrales;
    private double lockSales, stockSales, barraleSale, commission;
    /* default value for testing range */
    private double lockPrice = ValueDefault.COMMISSION_LOCK_COST;
    private double stockPrice = ValueDefault.COMMISSION_STOCK_COST;
    private double barralePrice = ValueDefault.COMMISSION_BARRALE_COST;

    /* DEFAULT RANGE */
    private final double minLock = ValueDefault.COMMISSION_LOCK_MIN_SIZE;
    private final double maxLock = ValueDefault.COMMISSION_LOCK_MAX_SIZE;
    private final double minStock = ValueDefault.COMMISSION_STOCK_MIN_SIZE;
    private final double maxStock = ValueDefault.COMMISSION_STOCK_MAX_SIZE;
    private final double minBarrale = ValueDefault.COMMISSION_BARRALE_MIN_SIZE;
    private final double maxBarrale = ValueDefault.COMMISSION_BARRALE_MAX_SIZE;

    public Commission(int locks, int stocks, int barrales) {
        this.totalLocks = locks;
        this.totalStocks = stocks;
        this.totalBarrales = barrales;
    }

    public double calculateSale() {
        this.lockSales = lockPrice * totalLocks;
        this.stockSales = stockPrice * totalStocks;
        this.barraleSale = barralePrice * totalBarrales;

        return lockSales + stockSales + barraleSale;
    }

    public double calculateCommission(double sales) {
        boolean isOutOfRange = (minLock <= totalLocks) && (totalLocks <= maxLock) ||
                (minStock <= totalStocks) && (totalStocks <= maxStock) ||
                (minBarrale <= totalBarrales) && (totalBarrales <= maxBarrale);

        if (isOutOfRange) return 0.0;

        double totalSales = calculateSale();
        if (totalSales > 1800) {
            commission = 0.10 * 1000.0;
            commission = commission + 0.15 * 800;
            commission = commission + 0.20 * (totalSales - 1800.0);
        } else if (totalSales > 1000) {
            commission = 0.10 * 1000;
            commission = commission + 0.15 * (totalSales - 1000);
        } else
            commission = 0.10 * totalSales;
        return this.commission;
    }

    public int getTotalLocks() {
        return totalLocks;
    }

    public void setTotalLocks(int totalLocks) {
        this.totalLocks = totalLocks;
    }

    public int getTotalStocks() {
        return totalStocks;
    }

    public void setTotalStocks(int totalStocks) {
        this.totalStocks = totalStocks;
    }

    public int getTotalBarrales() {
        return totalBarrales;
    }

    public void setTotalBarrales(int totalBarrales) {
        this.totalBarrales = totalBarrales;
    }
}
