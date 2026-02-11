
PN = "tpm2-tools"
PE = "0"
PV = "5.7"
PR = "4.el10"
PACKAGES = "tpm2-tools"


URI_tpm2-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tpm2-tools-5.7-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libtss2-esys.so.0()(64bit) ( ) libtss2-mu.so.0()(64bit) ( ) libtss2-rc.so.0()(64bit) ( ) libtss2-tctildr.so.0()(64bit) ( ) libtss2-sys.so.1()(64bit) ( ) libtss2-fapi.so.1()(64bit) ( ) tpm2-tss(x86-64) ( >=  3.1.0)"
RPROVIDES:tpm2-tools = "tpm2-tools ( =  5.7-4.el10) tpm2-tools(x86-64) ( =  5.7-4.el10)"
