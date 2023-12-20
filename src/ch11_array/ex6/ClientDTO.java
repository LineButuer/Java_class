package ch11_array.ex6;

public class ClientDTO {
    private Long id;
    private String clientName;
    private String accountNumber;
    private String clientPassword;
    private String bankingAt;
    private long balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }



    public String getBankingAt() {
        return bankingAt;
    }

    public void setBankingAt(String bankingAt) {
        this.bankingAt = bankingAt;
    }

    public ClientDTO(){
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }


    public static Long idValue=1L;


    public ClientDTO(String clientName, String accountNumber, String clientPassword) {
        this.id = idValue++;
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.clientPassword = clientPassword;
        this.balance = balance;
        this.bankingAt = bankingAt;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", bankingAt='" + bankingAt + '\'' +
                ", clientPassword"+ clientPassword +'\''+
                '}';
    }
}
