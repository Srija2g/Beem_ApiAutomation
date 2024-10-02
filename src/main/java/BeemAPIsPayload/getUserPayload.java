package BeemAPIsPayload;

public class getUserPayload {

    public static String getUserPayloadUsingIDToken(){
        return "{\r\n"
                + "  \"query\": \"query getUser { getUser { email firstName middleName lastName userSub phoneNumber address dob externalResources { source destinationSourceId } address1 city state zipCode address2 success aboutUs ssn lineHandle idDoc userSetting profileImage incomeDetails jobDetails identityDocuments pepDetails usagePref bbvaConsumer userLoanStatus waitListNumber userSignUpSession phoneVerified emailVerified hasActiveStripeLink requestedRatingReviews joiningRefCode signupDate userId gender maritalStatus personalInfo tncAccepted appOnboardedVersion withdrawalBlocked hasPendingPayments hasPendingSubscriptions beamStatus plaidStatus fundReturnStatus showPopup isWebSignup plaidAccountsLinked primaryBankCardStatus lotteryOnboarded lotterySettings lotteryLastDepositFailed lotteryRecurDepositFailed pendingLotteryTickets lastLogin lotteryRecurringSetup lineUnlockLevels qualifiedLoanAmount unlockedLoanAmount accessibleAmountTillDebitCardVerification lastContactChangedAt shown100Klottery userIncomeReviewed userBillsReviewed isOnSupportedAppVersion lotteryBalance repaymentDuration pinwheelLinked incomeAccountLinkedThroughPlaid userSubscriptionReviewed userTrackExpenses missingEmployerAdded socureStatus userAccountStatus lastInstantTransferAt microLineSubscribed subscriptionFees socureId meetingAvailedAt arrayAuthDoneAt arrayUserId subscriptionPlan skipArray notifyQualificationChange signupChannel emailHash latestiOSVersion latestAndroidVersion disableSkipUpdate preQualReceived preApprovalDoneAt skipBankReconnectCount lastInstantTransferFailed velocityCheckTriggered workType referralCode finicityStatus emailOtpResponse kycCheck kycFailurePlatform meetingForSubOff tokenizePhoneNumber lotteryEnabled updateDetailAfterBlock tokenizeEmail }}\"\r\n"
                + "}";
    }
}
