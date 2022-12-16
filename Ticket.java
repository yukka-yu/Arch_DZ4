import java.util.Date;

public class Ticket {
        private int id;
        private int customerId;
        private Date date;
        private String qrcode;
        private boolean enable = true;


        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public void setEnable(boolean enable) {
            this.enable = enable;
        }

        public int getId() {
            return id;
        }

        public boolean getEnable() {return enable; }

        public int getCustomerId() {
            return customerId;
        }

        public Date getDate() {
            return date;
        }

        public String getQrcode() {
            return qrcode;
        }

        public boolean isEnable() {
            return enable;
        }

    public Ticket(int id, int customerId, Date date, String qrcode, boolean enable) {
        this.id = id;
        this.customerId = customerId;
        this.date = date;
        this.qrcode = qrcode;
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", date=" + date +
                ", qrcode='" + qrcode + '\'' +
                ", enable=" + enable +
                '}';
    }




}
