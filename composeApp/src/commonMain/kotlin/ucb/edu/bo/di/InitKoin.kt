package ucb.edu.bo.di

import org.koin.core.module.Module
import ucb.edu.bo.di.dataModule
import ucb.edu.bo.di.domainModule
import ucb.edu.bo.di.presentationModule

expect val platformModule: Module

fun getModules() = listOf(
    domainModule,
    presentationModule,
    dataModule,
    platformModule
)
