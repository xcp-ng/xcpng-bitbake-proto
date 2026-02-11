
PN = "adcli"
PE = "0"
PV = "0.9.2"
PR = "9.el10"
PACKAGES = "adcli adcli-doc"


URI_adcli = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/adcli-0.9.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:adcli = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) liblber.so.2()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libk5crypto.so.3()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) libresolv.so.2()(64bit) ( ) libk5crypto.so.3(k5crypto_3_MIT)(64bit) ( ) libresolv.so.2(GLIBC_2.9)(64bit) ( ) cyrus-sasl-gssapi ( )"
RPROVIDES:adcli = "adcli ( =  0.9.2-9.el10) adcli(x86-64) ( =  0.9.2-9.el10)"

URI_adcli-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/adcli-doc-0.9.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:adcli-doc = ""
RPROVIDES:adcli-doc = "adcli-doc ( =  0.9.2-9.el10)"
