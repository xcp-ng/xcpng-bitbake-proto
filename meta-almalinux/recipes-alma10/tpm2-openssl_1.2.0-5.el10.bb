
PN = "tpm2-openssl"
PE = "0"
PV = "1.2.0"
PR = "5.el10"
PACKAGES = "tpm2-openssl"


URI_tpm2-openssl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tpm2-openssl-1.2.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-openssl = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libtss2-tctildr.so.0()(64bit) ( ) libtss2-esys.so.0()(64bit) ( ) libtss2-rc.so.0()(64bit) ( ) tpm2-abrmd ( )"
RPROVIDES:tpm2-openssl = "tpm2-openssl ( =  1.2.0-5.el10) tpm2-openssl(x86-64) ( =  1.2.0-5.el10)"
