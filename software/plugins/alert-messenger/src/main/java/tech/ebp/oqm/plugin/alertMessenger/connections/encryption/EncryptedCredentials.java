package tech.ebp.oqm.plugin.alertMessenger.connections.encryption;

public interface EncryptedCredentials {
    String getWebhookUrl();
    void setWebhookUrl(String webhookUrl);
    void encryptCredentials(EncryptionService encryptionService);
    void decryptCredentials(EncryptionService encryptionService);
}
