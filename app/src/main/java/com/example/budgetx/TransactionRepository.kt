package com.example.momo

import com.example.momo.Database.Transaction
import com.example.momo.Database.TransactionDao
import kotlinx.coroutines.flow.Flow

class TransactionRepository(private val transactionDao: TransactionDao) {

    // Fetch total income
    fun getTotalIncome(): Flow<Double> {
        return transactionDao.getTotalIncome()
    }

    // Fetch total expense
    fun getTotalExpense(): Flow<Double> {
        return transactionDao.getTotalExpense()
    }

    // Fetch all transactions
    fun getAllTransactions(): Flow<List<Transaction>> {
        return transactionDao.getAllTransactions()
    }

    // Fetch transactions by type
    fun getTransactionsByType(type: String): Flow<List<Transaction>> {
        return transactionDao.getAllTransactionsByType(type)
    }

    // Fetch transactions by category
    fun getTransactionsByCategory(category: String): Flow<List<Transaction>> {
        return transactionDao.getAllTransactionsByCategory(category)
    }

    // Fetch transactions by date range
    fun getTransactionsByDateRange(startDate: String, endDate: String): Flow<List<Transaction>> {
        return transactionDao.getTransactionsByDateRange(startDate, endDate)
    }

    // Fetch transactions by payment mode
    fun getTransactionsByPaymentMode(paymentMode: String): Flow<List<Transaction>> {
        return transactionDao.getAllTransactionsByPaymentMode(paymentMode)
    }

    // Insert a new transaction
    suspend fun insertTransaction(transaction: Transaction) {
        transactionDao.insertTransaction(transaction)
    }

    // Update an existing transaction
    suspend fun updateTransaction(transaction: Transaction) {
        transactionDao.updateTransaction(transaction)
    }

    // Delete a specific transaction
    suspend fun deleteTransaction(transaction: Transaction) {
        transactionDao.deleteTransaction(transaction)
    }

    // Clear all transactions
    suspend fun clearAllTransactions() {
        transactionDao.clearAllTransactions()
    }

}

