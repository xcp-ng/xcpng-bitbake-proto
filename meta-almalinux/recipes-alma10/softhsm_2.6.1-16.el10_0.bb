
PN = "softhsm"
PE = "0"
PV = "2.6.1"
PR = "16.el10_0"
PACKAGES = "softhsm softhsm-devel"


URI_softhsm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/softhsm-2.6.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:softhsm = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) p11-kit ( ) openssl-libs ( >=  1.0.1k-6)"
RPROVIDES:softhsm = "group(ods) ( ) libsofthsm2.so()(64bit) ( ) user(ods) ( =  dSBvZHMgLSAib3BlbmRuc3NlYyBkYWVtb24gYWNjb3VudCIA) config(softhsm) ( =  2.6.1-16.el10_0) softhsm ( =  2.6.1-16.el10_0) softhsm(x86-64) ( =  2.6.1-16.el10_0)"

URI_softhsm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/softhsm-devel-2.6.1-16.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:softhsm-devel = "openssl-devel ( ) sqlite-devel ( ) softhsm ( =  2.6.1-16.el10_0)"
RPROVIDES:softhsm-devel = "softhsm-devel ( =  2.6.1-16.el10_0) softhsm-devel(x86-64) ( =  2.6.1-16.el10_0)"
