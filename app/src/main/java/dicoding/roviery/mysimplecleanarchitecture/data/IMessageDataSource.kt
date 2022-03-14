package dicoding.roviery.mysimplecleanarchitecture.data

import dicoding.roviery.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name:String): MessageEntity
}