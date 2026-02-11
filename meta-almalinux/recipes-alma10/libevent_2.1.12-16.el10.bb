
PN = "libevent"
PE = "0"
PV = "2.1.12"
PR = "16.el10"
PACKAGES = "libevent libevent-devel libevent-doc"


URI_libevent = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libevent-2.1.12-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevent = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( )"
RPROVIDES:libevent = "libevent-2.1.so.7()(64bit) ( ) libevent_core-2.1.so.7()(64bit) ( ) libevent_extra-2.1.so.7()(64bit) ( ) libevent_openssl-2.1.so.7()(64bit) ( ) libevent_pthreads-2.1.so.7()(64bit) ( ) libevent ( =  2.1.12-16.el10) libevent(x86-64) ( =  2.1.12-16.el10)"

URI_libevent-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libevent-devel-2.1.12-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevent-devel = "/usr/bin/python3 ( ) /usr/bin/pkg-config ( ) libevent-2.1.so.7()(64bit) ( ) libevent_core-2.1.so.7()(64bit) ( ) libevent_pthreads-2.1.so.7()(64bit) ( ) pkgconfig(libevent) ( ) libevent_extra-2.1.so.7()(64bit) ( ) libevent_openssl-2.1.so.7()(64bit) ( ) libevent(x86-64) ( =  2.1.12-16.el10)"
RPROVIDES:libevent-devel = "libevent-devel ( =  2.1.12-16.el10) libevent-devel(x86-64) ( =  2.1.12-16.el10) pkgconfig(libevent) ( =  2.1.12-stable) pkgconfig(libevent_core) ( =  2.1.12-stable) pkgconfig(libevent_extra) ( =  2.1.12-stable) pkgconfig(libevent_openssl) ( =  2.1.12-stable) pkgconfig(libevent_pthreads) ( =  2.1.12-stable)"

URI_libevent-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libevent-doc-2.1.12-16.el10.noarch.rpm;unpack=0"
RDEPENDS:libevent-doc = ""
RPROVIDES:libevent-doc = "libevent-doc ( =  2.1.12-16.el10)"
