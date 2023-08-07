package com.gorstreller.movies.utils

import com.gorstreller.movies.exception.EntityNotFoundException

fun entityNotfound(pair: Pair<String, Any>): Nothing = throw EntityNotFoundException("${pair.first} with [${pair.second}] not found")