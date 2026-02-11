
PN = "libsrtp"
PE = "0"
PV = "2.3.0"
PR = "16.el10"
PACKAGES = "libsrtp libsrtp-devel libsrtp-tools"


URI_libsrtp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsrtp-2.3.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsrtp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libnspr4.so()(64bit) ( ) libnss3.so()(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libnss3.so(NSS_3.3)(64bit) ( ) libnss3.so(NSS_3.12.5)(64bit) ( ) libnss3.so(NSS_3.15)(64bit) ( )"
RPROVIDES:libsrtp = "libsrtp2.so.1()(64bit) ( ) libsrtp ( =  2.3.0-16.el10) libsrtp(x86-64) ( =  2.3.0-16.el10)"

URI_libsrtp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsrtp-devel-2.3.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsrtp-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libsrtp2.so.1()(64bit) ( ) libsrtp(x86-64) ( =  2.3.0-16.el10)"
RPROVIDES:libsrtp-devel = "libsrtp-devel ( =  2.3.0-16.el10) libsrtp-devel(x86-64) ( =  2.3.0-16.el10) pkgconfig(libsrtp2) ( =  2.3.0)"

URI_libsrtp-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsrtp-tools-2.3.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsrtp-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpcap.so.1()(64bit) ( ) libsrtp2.so.1()(64bit) ( ) libsrtp(x86-64) ( =  2.3.0-16.el10)"
RPROVIDES:libsrtp-tools = "libsrtp-tools ( =  2.3.0-16.el10) libsrtp-tools(x86-64) ( =  2.3.0-16.el10)"
