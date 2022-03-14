package dicoding.roviery.mysimplecleanarchitecture.di

import dicoding.roviery.mysimplecleanarchitecture.data.IMessageDataSource
import dicoding.roviery.mysimplecleanarchitecture.data.MessageDataSource
import dicoding.roviery.mysimplecleanarchitecture.data.MessageRepository
import dicoding.roviery.mysimplecleanarchitecture.domain.IMessageRepository
import dicoding.roviery.mysimplecleanarchitecture.domain.MessageInteractor
import dicoding.roviery.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource{
        return MessageDataSource()
    }
}