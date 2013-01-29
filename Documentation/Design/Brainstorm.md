Budgeting App

[Functionality documentation](https://docs.google.com/document/d/1RIt_p-aMQdtPR8qCvrFNYWUT6CQIoybyYI8XnQ4uuQg/edit#)

**Features**
* Accounts
    * Users can create multiple accounts – ie Current Account, Savings account, Debts owed to people etc.
    * These can have an opening balance
        * Positive
        * Negative
    * Name
* Categories
    * For different types of expense/income
    * Petrol Rent Gas Electricity
    * Set a budget on a category – Maximum Spend per defined budget period ie Month, week etc
* Transaction
    * Simple to add a transaction
    * Name
    * Category
    * Amount
    * Date of transaction
    * Repeating transaction for DD
* Reports
    * Spending over time
    * Over category
    * Income over time
    * Income by category
    * Others
* Setting
    * Set month beginning and end dates
    * Currency?
    * Others

Note: Make sure all money types are stored in pence or multiplied by 100 before doing calculations to avoid overflow.


**Outline Class structure**
* Main Class
* Account Class
    * Name
    * Balance (can be negative)
* Category Class
    * Name
    * Budget
    * Type (In/Out) (Is this required? Could we just say that if the budget is 0 then it must be income because you would not set a budget on income...)
* Transaction Class
    * Name
    * Category
    * Amount
    * Date
    * Repeat/Direct Debit (How will this be made useful? Direct debits can go out at very random times, so we can't just repeat the transaction every pay day.)
* Report Class   
    Possible split each report into a class/Reports abstract class and each type as a concrete implementation
* Settings Class


**UI Outline**
* [Accounts](https://docs.google.com/drawings/d/1tuL8VGgVeqM04PrUxh6Po6BIvPMAYP7S-Y7Ed7Q5Fc8/edit).
* [Budgets/Categories](https://docs.google.com/drawings/d/1RM5IkOOLDjHiFRMeZ7rex5PEmfDqakSZkj_XsONUcpQ/edit).
* [BudgetsV2](https://docs.google.com/drawings/d/1Q-dyiVXUnaEccuY-9pT-EA3VtoAnp3Y4ey0yWvxfnHA/edit)
* [Transactions](https://docs.google.com/drawings/d/156GGZiG44f8jHVfh2B33xfX2A6DHN5jDbkkrabknmfg/edit).
* Settings
**Help text should be provided at the bottom to display errors, warnings, tips and general help**
