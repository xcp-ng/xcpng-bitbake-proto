
PN = "opendnssec"
PE = "0"
PV = "2.1.14"
PR = "1.el10"
PACKAGES = "opendnssec"


URI_opendnssec = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/opendnssec-2.1.14-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opendnssec = "/bin/sh ( ) shadow-utils ( ) systemd-units ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /usr/bin/sh ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) liblzma.so.5()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.2)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.8)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( ) libxslt ( ) libxml2 ( ) libxml2.so.2(LIBXML2_2.5.7)(64bit) ( ) sqlite ( ) libldns.so.3()(64bit) ( ) opencryptoki ( ) softhsm ( >=  2.5.0)"
RPROVIDES:opendnssec = "group(ods) ( ) user(ods) ( =  dSBvZHMgLSAib3BlbmRuc3NlYyBkYWVtb24gYWNjb3VudCIA) config(opendnssec) ( =  2.1.14-1.el10) opendnssec ( =  2.1.14-1.el10) opendnssec(x86-64) ( =  2.1.14-1.el10)"
