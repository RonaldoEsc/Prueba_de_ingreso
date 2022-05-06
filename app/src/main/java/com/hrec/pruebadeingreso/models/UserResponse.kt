package com.hrec.pruebadeingreso.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class UserResponse() : Parcelable {
    @SerializedName("id")
    var id: Int? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("username")
    var userName: String? = null
    @SerializedName("email")
    var email: String? = null
    @SerializedName("address")
    var address: AddressResponse? = null
    @SerializedName("phone")
    var phone: String? = null
    @SerializedName("website")
    var website: String? = null
    @SerializedName("company")
    var company: CompanyResponse? = null

    constructor(parcel: Parcel) : this() {
        id = parcel.readValue(Int::class.java.classLoader) as? Int
        name = parcel.readString()
        userName = parcel.readString()
        email = parcel.readString()
        address = parcel.readParcelable(AddressResponse::class.java.classLoader)
        phone = parcel.readString()
        website = parcel.readString()
        company = parcel.readParcelable(CompanyResponse::class.java.classLoader)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(name)
        parcel.writeString(userName)
        parcel.writeString(email)
        parcel.writeParcelable(address, flags)
        parcel.writeString(phone)
        parcel.writeString(website)
        parcel.writeParcelable(company, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UserResponse> {
        override fun createFromParcel(parcel: Parcel): UserResponse {
            return UserResponse(parcel)
        }

        override fun newArray(size: Int): Array<UserResponse?> {
            return arrayOfNulls(size)
        }
    }

}

class AddressResponse() : Parcelable {
    @SerializedName("street")
    var street: String? = null
    @SerializedName("suite")
    var suite: String? = null
    @SerializedName("city")
    var city: String? = null
    @SerializedName("zipcode")
    var zipcode: String? = null
    @SerializedName("geo")
    var geo: GeoResponse? = null

    constructor(parcel: Parcel) : this() {
        street = parcel.readString()
        suite = parcel.readString()
        city = parcel.readString()
        zipcode = parcel.readString()
        geo = parcel.readParcelable(GeoResponse::class.java.classLoader)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(street)
        parcel.writeString(suite)
        parcel.writeString(city)
        parcel.writeString(zipcode)
        parcel.writeParcelable(geo, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AddressResponse> {
        override fun createFromParcel(parcel: Parcel): AddressResponse {
            return AddressResponse(parcel)
        }

        override fun newArray(size: Int): Array<AddressResponse?> {
            return arrayOfNulls(size)
        }
    }
}

class GeoResponse() : Parcelable {
    @SerializedName("lat")
    var lat: String? = null
    @SerializedName("lng")
    var lng: String? = null

    constructor(parcel: Parcel) : this() {
        lat = parcel.readString()
        lng = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(lat)
        parcel.writeString(lng)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<GeoResponse> {
        override fun createFromParcel(parcel: Parcel): GeoResponse {
            return GeoResponse(parcel)
        }

        override fun newArray(size: Int): Array<GeoResponse?> {
            return arrayOfNulls(size)
        }
    }
}

class CompanyResponse() : Parcelable {
    @SerializedName("name")
    var name: String? = null
    @SerializedName("catchPhrase")
    var catchPhrase: String? = null
    @SerializedName("bs")
    var bs: String? = null

    constructor(parcel: Parcel) : this() {
        name = parcel.readString()
        catchPhrase = parcel.readString()
        bs = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(catchPhrase)
        parcel.writeString(bs)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CompanyResponse> {
        override fun createFromParcel(parcel: Parcel): CompanyResponse {
            return CompanyResponse(parcel)
        }

        override fun newArray(size: Int): Array<CompanyResponse?> {
            return arrayOfNulls(size)
        }
    }
}