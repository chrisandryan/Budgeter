Budgeting App

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
    * Balance
* Category Class
    * Name
    * Type (Income/Expenditure - Could use +1, -1 as the value, this might be useful for making calculations)
    * Budget
* Transaction Class
    * Name
    * Category
    * Amount
    * Date
    * Repeat
* Report Class   
    Possible split each report into a class/Reports abstract class and each type as a concrete implementation
* Settings Class


**UI Outline**
* Main display.
    * [Input] Account Filter (Options = All, list of user created accounts).
    * [Input] Category Filter (Options = All, list of user created accounts).
    * [Input] Date from (Options = None, list of user created accounts).
    * [Input] Date to (Options = None, list of user created accounts).
    * [Output] Balance (based on filters).
    * [Button] View transactions as a list.
    * [Button] View transactions as a graph?
* Create/Edit account.
    * Input field for each of the account class fields.
    * [Button] Submit
    * [Button] Cancel/Back (Might be built-in on Android).
* Create/Edit category.
    * Input field for each of the category class fields.
    * [Button] Submit
    * [Button] Cancel/Back (Might be built-in on Android).
* Create/Edit transaction.
    * Input field for each of the transaction class fields.
    * [Button] Submit
    * [Button] Cancel/Back (Might be built-in on Android).
* View transactions as a list.
    * List of transactions that display the transaction name, account name, category name, date and repeat.
    * [Button] Back (Might be built-in on Android).
