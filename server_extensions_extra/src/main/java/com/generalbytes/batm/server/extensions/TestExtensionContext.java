/*************************************************************************************
 * Copyright (C) 2014-2024 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/
package com.generalbytes.batm.server.extensions;

import com.generalbytes.batm.server.extensions.aml.verification.ApplicantCheckResult;
import com.generalbytes.batm.server.extensions.aml.verification.IIdentityVerificationProvider;
import com.generalbytes.batm.server.extensions.aml.verification.IdentityApplicant;
import com.generalbytes.batm.server.extensions.customfields.CustomField;
import com.generalbytes.batm.server.extensions.customfields.CustomFieldDefinition;
import com.generalbytes.batm.server.extensions.customfields.CustomFieldDefinitionAvailability;
import com.generalbytes.batm.server.extensions.customfields.value.CustomFieldValue;
import com.generalbytes.batm.server.extensions.exceptions.BuyException;
import com.generalbytes.batm.server.extensions.exceptions.CashbackException;
import com.generalbytes.batm.server.extensions.exceptions.SellException;
import com.generalbytes.batm.server.extensions.exceptions.UpdateException;
import com.generalbytes.batm.server.extensions.watchlist.WatchListQuery;
import com.generalbytes.batm.server.extensions.watchlist.WatchListResult;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestExtensionContext implements IExtensionContext {
    @Override
    public void addApplicationListener(IApplicationListener listener) {

    }

    @Override
    public boolean removeApplicationListener(IApplicationListener listener) {
        return false;
    }

    @Override
    public void addTransactionListener(ITransactionListener listener) {

    }

    @Override
    public boolean removeTransactionListener(ITransactionListener listener) {
        return false;
    }

    @Override
    public void addTerminalListener(ITerminalListener listener) {
    }

    @Override
    public void removeTerminalListener(ITerminalListener listener) {
    }

    @Override
    public void addIdentityListener(IIdentityListener listener) {
    }

    @Override
    public void removeIdentityListener(IIdentityListener listener) {
    }

    @Override
    public void addNotificationListener(INotificationListener listener) {
    }

    @Override
    public void removeNotificationListener(INotificationListener listener) {
    }

    @Override
    public ITransactionDetails findTransactionByTransactionId(String remoteOrLocalTransactionId) {
        return null;
    }

    @Override
    public ITransactionDetails findTransactionByTransactionUUIDAndType(String uuid, int type) {
        return null;
    }

    @Override
    public List<ITransactionDetails> findAllTransactionsByIdentityId(String publicIdentityId) {
        return null;
    }

    @Override
    public List<ITransactionDetails> findTransactions(String terminalSerialNumber, Date serverTimeFrom, Date serverTimeTo, String previousRID, boolean includeBanknotes) {
        return null;
    }
    @Override
    public ITransactionDetails updateTransaction(String rid, Integer status, String detail) throws UpdateException {
        return null;
    }

    @Override
    public ITransactionDetails updateTransaction(String rid, Integer status, String detail, Set<String> tags) throws UpdateException {
        return null;
    }

    @Override
    public ITransactionDetails updateTransaction(String rid, Integer status, String detail, Map<String, String> customData) throws UpdateException {
        return null;
    }

    @Override
    public Set<String> getTransactionTags(String organizationId) {
        return null;
    }

    @Override
    public IPerson findPersonByChatId(String chatUserId) {
        return null;
    }

    @Override
    public boolean hasPersonPermissionToObject(int permissionLevel, IPerson person, Object obj) {
        return false;
    }

    @Override
    public boolean isTerminalFromSameOrganizationAsPerson(String terminalSerialNumber, IPerson person) {
        return false;
    }

    @Override
    public IIdentity findIdentityByIdentityId(String publicIdentityId) {
        return null;
    }

    @Override
    public IIdentityBase findIdentityBaseByIdentityId(String publicIdentityId) {
        return null;
    }

    @Override
    public List<IIdentity> findIdentitiesByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public List<IIdentityBase> findIdentitiesBaseByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public List<IIdentity> findAllIdentitiesByState(int state) {
        return null;
    }

    @Override
    public List<IIdentityBase> findAllIdentitiesBaseByState(int state) {
        return null;
    }

    @Override
    public List<IIdentity> findIdentityByPhoneNumber(String phoneNumber, String countryName) {
        return null;
    }

    @Override
    public List<IIdentity> findIdentitiesByPhoneNumber(String phoneNumber, String countryCode) {
        return null;
    }

    @Override
    public List<IIdentityBase> findIdentitiesBaseByPhoneNumber(String phoneNumber, String countryCode) {
        return null;
    }

    @Override
    public List<IIdentity> findIdentitiesByDocumentNumber(String documentNumber) {
        return null;
    }

    @Override
    public List<IIdentityBase> findIdentitiesBaseByDocumentNumber(String documentNumber) {
        return null;
    }

    @Override
    public IIdentity addIdentity(String configurationCashCurrency, String terminalSerialNumber, String externalId, List<ILimit> limitCashPerTransaction, List<ILimit> limitCashPerHour, List<ILimit> limitCashPerDay, List<ILimit> limitCashPerWeek, List<ILimit> limitCashPerMonth, String note, int state, BigDecimal vipBuyDiscount, BigDecimal vipSellDiscount, Date created, Date registered) {
        return null;
    }

    @Override
    public IIdentity addIdentity(String configurationCashCurrency, String terminalSerialNumber, String externalId, List<ILimit> limitCashPerTransaction, List<ILimit> limitCashPerHour, List<ILimit> limitCashPerDay, List<ILimit> limitCashPerWeek, List<ILimit> limitCashPerMonth, String note, int state, BigDecimal vipBuyDiscount, BigDecimal vipSellDiscount, Date created, Date registered, String language) {
        return null;
    }

    @Override
    public boolean addIdentityPiece(String identityPublicId, IIdentityPiece iidentityPiece) {
        return false;
    }

    @Override
    public boolean updateIdentityPiecePersonalInfo(String identityPublicId, IIdentityPiece identityPiece) {
        return false;
    }

    @Override
    public IIdentity updateIdentity(String identityId, String externalId, int state, int type, Date created, Date registered, BigDecimal vipBuyDiscount, BigDecimal vipSellDiscount, String note, List<ILimit> limitCashPerTransaction, List<ILimit> limitCashPerHour, List<ILimit> limitCashPerDay, List<ILimit> limitCashPerWeek, List<ILimit> limitCashPerMonth, List<ILimit> limitCashPer3Months, List<ILimit> limitCashPer12Months, List<ILimit> limitCashPerCalendarQuarter, List<ILimit> limitCashPerCalendarYear, List<ILimit> limitCashTotalIdentity, String configurationCashCurrency) {
        return null;
    }

    @Override
    public void updateIdentityMarketingOptIn(String identityId, boolean agreeWithMarketingOptIn) {
    }

    @Override
    public void setIdentityCustomField(String identityPublicId,
                                       long customFieldDefinitionId,
                                       CustomFieldValue customFieldValue) {
    }

    @Override
    public void setLocationCustomField(String locationPublicId,
                                       long customFieldDefinitionId,
                                       CustomFieldValue customFieldValue) {
    }

    @Override
    public Collection<CustomField> getIdentityCustomFields(String identityPublicId) {
        return Collections.emptyList();
    }

    @Override
    public Collection<CustomField> getLocationCustomFields(String locationPublicId) {
        return Collections.emptyList();
    }

    @Override
    public Collection<CustomFieldDefinition> getCustomFieldDefinitions(String organizationId, CustomFieldDefinitionAvailability availability) {
        return Collections.emptyList();
    }

    @Override
    public ITunnelManager getTunnelManager() {
        return (walletLogin, tunnelPassword, originalWalletAddress) -> originalWalletAddress;
    }

    @Override
    public void sendMailAsync(String from, String addressListTo, String subject, String messageText, String replyTo) {

    }

    @Override
    public void sendMailAsyncWithAttachment(String from, String addresslistTo, String subject, String messageText, String attachmentFileName, byte[] attachmentContent, String attachmentMimeType, String replyTo) {

    }

    @Override
    public void sendHTMLMailAsync(String from, String addresslistTo, String subject, String messageText, String replyTo, EmbeddedEmailImage... embeddedEmailImages) {

    }

    @Override
    public void sendHTMLMailAsyncWithAttachment(String from, String addresslistTo, String subject, String messageText, String attachmentFileName, byte[] attachmentContent, String attachmentMimeType, String replyTo) {

    }

    @Override
    public void sendSMSAsync(String terminalSN, String phonenumber, String messageText) {

    }

    @Override
    public void addTask(String name, ITask tt, Runnable onFinish) {

    }

    @Override
    public String getServerVersion() {
        return null;
    }

    @Override
    public BigDecimal calculateCashAvailableForSell(String terminalSerialNumber, String fiatCurrency) {
        return null;
    }

    @Override
    public Map<BigDecimal, Integer> getAvailableBanknotesConsideringFutureWithdrawals(String terminalSerialNumber, String fiatCurrency) {
        return null;
    }

    @Override
    public ITransactionSellInfo sellCrypto(String terminalSerialNumber, BigDecimal fiatAmount, String fiatCurrency, BigDecimal cryptoAmount, String cryptoCurrency, String identityPublicId, String discountCode) throws SellException {
        return null;
    }

    @Override
    public ITransactionSellInfo sellCrypto(String terminalSerialNumber, BigDecimal fiatAmount, String fiatCurrency, BigDecimal cryptoAmount, String cryptoCurrency, String identityPublicId, String discountCode, String phoneNumber) throws SellException {
        return null;
    }

    @Override
    public ITransactionBuyInfo buyCrypto(String terminalSerialNumber, BigDecimal fiatAmount, String fiatCurrency, BigDecimal cryptoAmount, String cryptoCurrency, String destinationAddress, String identityPublicId, String discountCode) throws BuyException {
        return null;
    }

    @Override
    public ITransactionCashbackInfo cashback(String terminalSerialNumber, BigDecimal fiatAmount, String fiatCurrency, String identityPublicId) throws CashbackException {
        return null;
    }

    @Override
    public Map<Integer, List<IExchangeRateInfo>> getExchangeRateInfo(String terminalSerialNumber, int directions) {
        return null;
    }

    @Override
    public Map<String, IAmountWithDiscount> calculateCryptoAmounts(String terminalSerialNumber, List<String> cryptoCurrencies, BigDecimal cashAmount, String cashCurrency, int direction, String discountCode, String identityPublicId) {
        return null;
    }

    @Override
    public List<IBanknoteCounts> getCashBoxes(String terminalSerialNumber) {
        return null;
    }

    @Override
    public List<ITerminal> findAllTerminals() {
        return null;
    }

    @Override
    public ITerminal findTerminalBySerialNumber(String serialNumber) {
        return null;
    }

    @Override
    public List<String> findTerminalsWithAvailableCashForSell(BigDecimal fiatAmount, String fiatCurrency, List<String> listOfTerminalSerialNumbers) {
        return null;
    }

    @Override
    public byte[] createPaperWallet7ZIP(String privateKey, String address, String password, String cryptoCurrency) {
        return new byte[0];
    }

    @Override
    public SimpleDateFormat getTimeFormatByPerson(IPerson person) {
        return null;
    }

    @Override
    public IWallet findBuyWallet(String terminalSerialNumber, String cryptoCurrency) {
        return null;
    }

    @Override
    public IIdentityVerificationProvider findIdentityVerificationProviderByApplicantId(String applicantId) {
        return null;
    }

    @Override
    public IIdentityVerificationProvider findIdentityVerificationProviderByOrganizationId(long organizationId) {
        return null;
    }

    @Override
    public IdentityApplicant findIdentityVerificationApplicant(String applicantId) {
        return null;
    }

    @Override
    public void processIdentityVerificationResult(String rawPayload, ApplicantCheckResult result) {
    }

    @Override
    public List<ICryptoConfiguration> findCryptoConfigurationsByTerminalSerialNumbers(List<String> serialNumbers) {
        return null;
    }

    @Override
    public WatchListResult searchWatchList(WatchListQuery query) {
        return null;
    }

    @Override
    public boolean watchListScan(String identityPublicId) {
        return false;
    }

    @Override
    public PhoneNumberQueryResult queryPhoneNumber(String phoneNumber, String terminalSerialNumber) {
        return null;
    }

    @Override
    public List<ITerminalCashCollectionRecord> getCashCollections(String terminalSerialNumber, Date terminalTimeFrom, Date terminalTimeTo) {
        return null;
    }

    @Override
    public List<ITerminalCashCollectionRecord> getCashCollections(String terminalSerialNumber, Date serverTimeFrom, Date serverTimeTo, String publicIdFrom) {
        return null;
    }

    @Override
    public List<IEventRecord> getEvents(String terminalSerialNumber, Date dateFrom, Date dateTo) {
        return null;
    }

    @Override
    public List<ILimitExtended> getIdentityRemainingLimits(String fiatCurrency, String terminalSerialNumber, String identityPublicId) {
        return null;
    }

    @Override
    public List<ILimitExtended> getIdentityInitialLimits(String fiatCurrency, String terminalSerialNumber, String identityPublicId){
        return null;
    }

    @Override
    public IApiAccess getAPIAccessByKey(String apiKey, ApiAccessType apiAccessType) {
        return null;
    }

    @Override
    public IDiscount createDiscount(IOrganization organization, DiscountSpec discountSpec) {
        return null;
    }

    @Override
    public List<IOrganization> getOrganizations() {
        return Collections.emptyList();
    }

    @Override
    public IOrganization getOrganization(String gbApiKey) {
        return null;
    }

    @Override
    public boolean triggerCollectPhoto(List<String> terminalSerialNumbers) {
        return false;
    }

    @Override
    public ILocationDetail getLocationByPublicId(String locationPublicId) {
        return null;
    }

    @Override
    public ILocationDetail getLocationByExternalId(String locationExternalId, IOrganization organization) {
        return null;
    }

    @Override
    public ILocation updateLocationById(String publicId, ILocationDetail location) {
        return null;
    }

    @Override
    public ILocation addLocation(ILocationDetail location) {
        return null;
    }

    @Override
    public IVerificationInfo startVerificationByIdentityId(String publicIdentityId, String messageToCustomer) {
        return null;
    }

    @Override
    public String getConfigProperty(String fileNameInConfigDirectory, String key, String defaultValue) {
        return defaultValue;
    }

    @Override
    public boolean configFileExists(String fileNameInConfigDirectory) {
        return false;
    }

    @Override
    public String getConfigFileContent(String fileNameInConfigDirectory) {
        return "";
    }

    @Override
    public boolean isGlobalServer() {
        return false;
    }

    @Override
    public void markTransactionAsWithdrawn(String remoteOrLocalTransactionId) {

    }

    @Override
    public void unlockTransaction(String rid, Date serverTimeToUnlock) {
    }

    @Override
    public ReceiptData getReceiptData(ReceiptTransferMethod receiptTransferMethod, ITransactionDetails transactionDetails, String template) {
        return null;
    }

    @Override
    public ITransactionDetails addTransactionHash(String transactionRemoteId, String transactionHash) {
        return null;
    }
}
