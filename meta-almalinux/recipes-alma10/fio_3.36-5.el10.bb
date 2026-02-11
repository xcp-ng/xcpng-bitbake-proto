
PN = "fio"
PE = "0"
PV = "3.36"
PR = "5.el10"
PACKAGES = "fio fio-engine-http fio-engine-libaio fio-engine-nbd fio-engine-rados fio-engine-rbd fio-engine-rdma"


URI_fio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) /usr/bin/python3 ( ) libz.so.1()(64bit) ( ) /usr/bin/bash ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libnuma.so.1()(64bit) ( ) libnuma.so.1(libnuma_1.2)(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libnuma.so.1(libnuma_1.1)(64bit) ( )"
RPROVIDES:fio = "fio(x86-64) ( =  3.36-5.el10) fio ( =  3.36-5.el10)"

URI_fio-engine-http = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-http-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-http = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libcurl.so.4()(64bit) ( ) fio(x86-64) ( =  3.36-5.el10)"
RPROVIDES:fio-engine-http = "fio-engine-http ( =  3.36-5.el10) fio-engine-http(x86-64) ( =  3.36-5.el10)"

URI_fio-engine-libaio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-libaio-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-libaio = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libaio.so.1()(64bit) ( ) libaio.so.1(LIBAIO_0.1)(64bit) ( ) libaio.so.1(LIBAIO_0.4)(64bit) ( ) fio(x86-64) ( =  3.36-5.el10)"
RPROVIDES:fio-engine-libaio = "fio-engine-libaio ( =  3.36-5.el10) fio-engine-libaio(x86-64) ( =  3.36-5.el10)"

URI_fio-engine-nbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-nbd-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-nbd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libnbd.so.0()(64bit) ( ) libnbd.so.0(LIBNBD_1.0)(64bit) ( ) fio(x86-64) ( =  3.36-5.el10)"
RPROVIDES:fio-engine-nbd = "fio-engine-nbd ( =  3.36-5.el10) fio-engine-nbd(x86-64) ( =  3.36-5.el10)"

URI_fio-engine-rados = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-rados-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-rados = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) librados.so.2()(64bit) ( ) fio(x86-64) ( =  3.36-5.el10)"
RPROVIDES:fio-engine-rados = "fio-engine-rados ( =  3.36-5.el10) fio-engine-rados(x86-64) ( =  3.36-5.el10)"

URI_fio-engine-rbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-rbd-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-rbd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) librados.so.2()(64bit) ( ) librbd.so.1()(64bit) ( ) fio(x86-64) ( =  3.36-5.el10)"
RPROVIDES:fio-engine-rbd = "fio-engine-rbd ( =  3.36-5.el10) fio-engine-rbd(x86-64) ( =  3.36-5.el10)"

URI_fio-engine-rdma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-rdma-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-rdma = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libibverbs.so.1()(64bit) ( ) libibverbs.so.1(IBVERBS_1.1)(64bit) ( ) librdmacm.so.1()(64bit) ( ) libibverbs.so.1(IBVERBS_1.0)(64bit) ( ) librdmacm.so.1(RDMACM_1.0)(64bit) ( ) fio(x86-64) ( =  3.36-5.el10)"
RPROVIDES:fio-engine-rdma = "fio-engine-rdma ( =  3.36-5.el10) fio-engine-rdma(x86-64) ( =  3.36-5.el10)"
