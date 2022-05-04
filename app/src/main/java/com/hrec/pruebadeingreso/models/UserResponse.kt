package com.hrec.pruebadeingreso.models

import com.google.gson.annotations.SerializedName

class UserResponse {
    @SerializedName("id")
    private var id: Int? = null
    @SerializedName("name")
    private var name: String? = null
    @SerializedName("username")
    private var userName: String? = null
    @SerializedName("email")
    private var email: String? = null
    @SerializedName("address")
    private var address: AddressResponse? = null
    @SerializedName("phone")
    private var phone: String? = null
    @SerializedName("website")
    private var website: String? = null
    @SerializedName("company")
    private var company: CompanyResponse? = null
}

class AddressResponse {
    @SerializedName("street")
    private var street: String? = null
    @SerializedName("suite")
    private var suite: String? = null
    @SerializedName("city")
    private var city: String? = null
    @SerializedName("zipcode")
    private var zipcode: String? = null
    @SerializedName("geo")
    private var geo: GeoResponse? = null
}

class GeoResponse {
    @SerializedName("lat")
    private var lat: String? = null
    @SerializedName("lng")
    private var lng: String? = null
}

class CompanyResponse {
    @SerializedName("name")
    private var name: String? = null
    @SerializedName("catchPhrase")
    private var catchPhrase: String? = null
    @SerializedName("bs")
    private var bs: String? = null
}