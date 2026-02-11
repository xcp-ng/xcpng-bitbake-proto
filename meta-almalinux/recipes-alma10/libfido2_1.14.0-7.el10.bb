
PN = "libfido2"
PE = "0"
PV = "1.14.0"
PR = "7.el10"
PACKAGES = "libfido2 fido2-tools libfido2-devel"


URI_libfido2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libfido2-1.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfido2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libcbor.so.0.11()(64bit) ( )"
RPROVIDES:libfido2 = "libfido2.so.1()(64bit) ( ) libfido2 ( =  1.14.0-7.el10) libfido2(x86-64) ( =  1.14.0-7.el10)"

URI_fido2-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fido2-tools-1.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fido2-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libcbor.so.0.11()(64bit) ( ) libfido2.so.1()(64bit) ( ) libfido2(x86-64) ( =  1.14.0-7.el10)"
RPROVIDES:fido2-tools = "fido2-tools ( =  1.14.0-7.el10) fido2-tools(x86-64) ( =  1.14.0-7.el10)"

URI_libfido2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfido2-devel-1.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfido2-devel = "/usr/bin/pkg-config ( ) pkgconfig(libcrypto) ( ) libfido2.so.1()(64bit) ( ) libfido2(x86-64) ( =  1.14.0-7.el10)"
RPROVIDES:libfido2-devel = "libfido2-devel ( =  1.14.0-7.el10) libfido2-devel(x86-64) ( =  1.14.0-7.el10) pkgconfig(libfido2) ( =  1.14.0)"
