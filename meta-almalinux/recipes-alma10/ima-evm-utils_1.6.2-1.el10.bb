
PN = "ima-evm-utils"
PE = "0"
PV = "1.6.2"
PR = "1.el10"
PACKAGES = "ima-evm-utils ima-evm-utils-devel"


URI_ima-evm-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ima-evm-utils-1.6.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ima-evm-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libkeyutils.so.1()(64bit) ( ) libkeyutils.so.1(KEYUTILS_0.3)(64bit) ( ) keyutils ( ) libtss2-esys.so.0()(64bit) ( ) attr ( ) libtss2-rc.so.0()(64bit) ( )"
RPROVIDES:ima-evm-utils = "libimaevm.so.5()(64bit) ( ) ima-evm-utils ( =  1.6.2-1.el10) ima-evm-utils(x86-64) ( =  1.6.2-1.el10)"

URI_ima-evm-utils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ima-evm-utils-devel-1.6.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ima-evm-utils-devel = "libimaevm.so.5()(64bit) ( ) ima-evm-utils ( =  1.6.2-1.el10)"
RPROVIDES:ima-evm-utils-devel = "ima-evm-utils-devel ( =  1.6.2-1.el10) ima-evm-utils-devel(x86-64) ( =  1.6.2-1.el10)"
