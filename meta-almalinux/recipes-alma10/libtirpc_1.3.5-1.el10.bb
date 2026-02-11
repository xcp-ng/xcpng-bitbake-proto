
PN = "libtirpc"
PE = "0"
PV = "1.3.5"
PR = "1.el10"
PACKAGES = "libtirpc libtirpc-devel"


URI_libtirpc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtirpc-1.3.5-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtirpc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libcom_err.so.2()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libk5crypto.so.3()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( )"
RPROVIDES:libtirpc = "libtirpc.so.3()(64bit) ( ) libtirpc.so.3(TIRPC_0.3.0)(64bit) ( ) libtirpc.so.3(TIRPC_PRIVATE)(64bit) ( ) libtirpc.so.3(TIRPC_0.3.3)(64bit) ( ) libtirpc.so.3(TIRPC_0.3.1)(64bit) ( ) libtirpc.so.3(TIRPC_0.3.2)(64bit) ( ) config(libtirpc) ( =  1.3.5-1.el10) libtirpc ( =  1.3.5-1.el10) libtirpc(x86-64) ( =  1.3.5-1.el10)"

URI_libtirpc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtirpc-devel-1.3.5-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtirpc-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libtirpc.so.3()(64bit) ( ) libtirpc(x86-64) ( =  1.3.5-1.el10)"
RPROVIDES:libtirpc-devel = "libtirpc-devel ( =  1.3.5-1.el10) libtirpc-devel(x86-64) ( =  1.3.5-1.el10) pkgconfig(libtirpc) ( =  1.3.5)"
