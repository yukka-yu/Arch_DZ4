public class PaymentProvider {


    /**
     * Формирование заявки на проведение платежа
     * @param orderId
     * @param cardNo
     * @param amount
     * @return
     */
    public boolean buy(int orderId, String cardNo, double amount){

        // Посылаем запрос в процессинговую компанию, проводим платеж (ProcessingCompany)
        return true;
    }
}
