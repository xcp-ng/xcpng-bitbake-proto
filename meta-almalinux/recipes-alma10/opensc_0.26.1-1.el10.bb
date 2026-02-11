
PN = "opensc"
PE = "0"
PV = "0.26.1"
PR = "1.el10"
PACKAGES = "opensc opensc-libs"


URI_opensc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensc-0.26.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) libreadline.so.8()(64bit) ( ) libcrypto.so.3(OPENSSL_3.2.0)(64bit) ( ) pcsc-lite ( ) libopensc.so.12()(64bit) ( ) opensc-libs ( =  0.26.1-1.el10)"
RPROVIDES:opensc = "bundled(simclist) ( =  1.5) opensc ( =  0.26.1-1.el10) opensc(x86-64) ( =  0.26.1-1.el10)"

URI_opensc-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensc-libs-0.26.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensc-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) pcsc-lite-libs(x86-64) ( )"
RPROVIDES:opensc-libs = "libopensc.so.12()(64bit) ( ) libsmm-local.so.12()(64bit) ( ) opensc-libs ( =  0.26.1-1.el10) config(opensc-libs) ( =  0.26.1-1.el10) opensc-libs(x86-64) ( =  0.26.1-1.el10)"
