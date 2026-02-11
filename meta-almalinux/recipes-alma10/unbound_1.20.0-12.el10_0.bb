
PN = "unbound"
PE = "0"
PV = "1.20.0"
PR = "12.el10_0"
PACKAGES = "python3-unbound unbound unbound-anchor unbound-dracut unbound-libs unbound-devel unbound-utils"


URI_python3-unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-unbound-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-unbound = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libssl.so.3()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libnghttp2.so.14()(64bit) ( ) libprotobuf-c.so.1()(64bit) ( ) libc.so.6(GLIBC_2.28)(64bit) ( ) libevent-2.1.so.7()(64bit) ( ) libunbound.so.8()(64bit) ( ) python(abi) ( =  3.12) unbound-libs(x86-64) ( =  1.20.0-12.el10_0)"
RPROVIDES:python3-unbound = "python-unbound ( =  1.20.0-12.el10_0) python3-unbound ( =  1.20.0-12.el10_0) python3-unbound(x86-64) ( =  1.20.0-12.el10_0) python3.12-unbound ( =  1.20.0-12.el10_0)"

URI_unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unbound-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) openssl ( ) libnghttp2.so.14()(64bit) ( ) libprotobuf-c.so.1()(64bit) ( ) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) ( ) libevent-2.1.so.7()(64bit) ( ) unbound-libs(x86-64) ( =  1.20.0-12.el10_0) unbound-anchor(x86-64) ( =  1.20.0-12.el10_0)"
RPROVIDES:unbound = "unbound(x86-64) ( =  1.20.0-12.el10_0) config(unbound) ( =  1.20.0-12.el10_0) unbound ( =  1.20.0-12.el10_0)"

URI_unbound-anchor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unbound-anchor-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-anchor = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libexpat.so.1()(64bit) ( ) libunbound.so.8()(64bit) ( ) unbound-libs(x86-64) ( =  1.20.0-12.el10_0)"
RPROVIDES:unbound-anchor = "unbound-anchor(x86-64) ( =  1.20.0-12.el10_0) config(unbound-anchor) ( =  1.20.0-12.el10_0) unbound-anchor ( =  1.20.0-12.el10_0)"

URI_unbound-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unbound-dracut-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-dracut = "/usr/bin/bash ( ) dracut(x86-64) ( ) unbound(x86-64) ( =  1.20.0-12.el10_0)"
RPROVIDES:unbound-dracut = "unbound-dracut ( =  1.20.0-12.el10_0) unbound-dracut(x86-64) ( =  1.20.0-12.el10_0)"

URI_unbound-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unbound-libs-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-libs = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libnghttp2.so.14()(64bit) ( ) libprotobuf-c.so.1()(64bit) ( ) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) ( ) libevent-2.1.so.7()(64bit) ( )"
RPROVIDES:unbound-libs = "libunbound.so.8()(64bit) ( ) group(unbound) ( ) unbound-libs(x86-64) ( =  1.20.0-12.el10_0) user(unbound) ( =  dSB1bmJvdW5kIC0gIlVuYm91bmQgRE5TIHJlc29sdmVyIiAvdmFyL2xpYi91bmJvdW5kIC9zYmluL25vbG9naW4A) config(unbound-libs) ( =  1.20.0-12.el10_0) unbound-libs ( =  1.20.0-12.el10_0)"

URI_unbound-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/unbound-devel-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) openssl-devel ( ) libunbound.so.8()(64bit) ( ) pkgconfig(libevent) ( ) pkgconfig(python3) ( ) unbound-libs(x86-64) ( =  1.20.0-12.el10_0)"
RPROVIDES:unbound-devel = "pkgconfig(libunbound) ( =  1.20.0) unbound-devel ( =  1.20.0-12.el10_0) unbound-devel(x86-64) ( =  1.20.0-12.el10_0)"

URI_unbound-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/unbound-utils-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libevent-2.1.so.7()(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libnghttp2.so.14()(64bit) ( ) libunbound.so.8()(64bit) ( ) unbound-libs(x86-64) ( =  1.20.0-12.el10_0)"
RPROVIDES:unbound-utils = "unbound-utils(x86-64) ( =  1.20.0-12.el10_0) unbound-utils ( =  1.20.0-12.el10_0)"
