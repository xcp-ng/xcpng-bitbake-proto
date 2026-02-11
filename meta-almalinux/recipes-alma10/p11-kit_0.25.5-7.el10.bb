
PN = "p11-kit"
PE = "0"
PV = "0.25.5"
PR = "7.el10"
PACKAGES = "p11-kit p11-kit-trust p11-kit-devel p11-kit-server"


URI_p11-kit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/p11-kit-0.25.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:p11-kit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) libtasn1.so.6()(64bit) ( ) libtasn1.so.6(LIBTASN1_0_3)(64bit) ( )"
RPROVIDES:p11-kit = "libp11-kit.so.0()(64bit) ( ) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) ( ) p11-kit(x86-64) ( =  0.25.5-7.el10) p11-kit ( =  0.25.5-7.el10)"

URI_p11-kit-trust = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/p11-kit-trust-0.25.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:p11-kit-trust = "/bin/sh ( ) /usr/sbin/alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) libtasn1.so.6()(64bit) ( ) libtasn1.so.6(LIBTASN1_0_3)(64bit) ( ) libp11-kit.so.0()(64bit) ( ) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) ( ) p11-kit(x86-64) ( =  0.25.5-7.el10)"
RPROVIDES:p11-kit-trust = "p11-kit-trust ( =  0.25.5-7.el10) p11-kit-trust(x86-64) ( =  0.25.5-7.el10)"

URI_p11-kit-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/p11-kit-devel-0.25.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:p11-kit-devel = "/usr/bin/pkg-config ( ) libp11-kit.so.0()(64bit) ( ) p11-kit(x86-64) ( =  0.25.5-7.el10)"
RPROVIDES:p11-kit-devel = "p11-kit-devel ( =  0.25.5-7.el10) p11-kit-devel(x86-64) ( =  0.25.5-7.el10) pkgconfig(p11-kit-1) ( =  0.25.5)"

URI_p11-kit-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/p11-kit-server-0.25.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:p11-kit-server = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) libp11-kit.so.0()(64bit) ( ) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) ( ) p11-kit(x86-64) ( =  0.25.5-7.el10)"
RPROVIDES:p11-kit-server = "p11-kit-server ( =  0.25.5-7.el10) p11-kit-server(x86-64) ( =  0.25.5-7.el10)"
