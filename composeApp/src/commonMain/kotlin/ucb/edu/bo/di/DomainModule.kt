package ucb.edu.bo.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import ucb.edu.bo.realtimedatabasecmp.domain.usecase.SaveTestDataUseCase
import ucb.edu.bo.kmp_room.dollar.domain.usecase.CreateDollarUseCase
import ucb.edu.bo.kmp_room.dollar.domain.usecase.GetDollarListUsecase
import ucb.edu.bo.remoteconfig.domain.usecase.FetchRemoteConfigUseCase
import ucb.edu.bo.remoteconfig.domain.usecase.GetRemoteStringUseCase

val domainModule = module {
    singleOf(::GetDollarListUsecase)
    singleOf(::CreateDollarUseCase)
    factory { SaveTestDataUseCase(get()) }
    factory { FetchRemoteConfigUseCase(get()) }
    factory { GetRemoteStringUseCase(get()) }
}
