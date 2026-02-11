
PN = "libfabric"
PE = "0"
PV = "1.22.0"
PR = "1.el10"
PACKAGES = "libfabric libfabric-devel"


URI_libfabric = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfabric-1.22.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfabric = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libibverbs.so.1()(64bit) ( ) libibverbs.so.1(IBVERBS_1.1)(64bit) ( ) librdmacm.so.1()(64bit) ( ) libibverbs.so.1(IBVERBS_1.0)(64bit) ( ) librdmacm.so.1(RDMACM_1.0)(64bit) ( ) libefa.so.1()(64bit) ( ) libnl-route-3.so.200()(64bit) ( ) libibverbs.so.1(IBVERBS_1.12)(64bit) ( ) libibverbs.so.1(IBVERBS_1.13)(64bit) ( ) librdmacm.so.1(RDMACM_1.2)(64bit) ( ) libefa.so.1(EFA_1.1)(64bit) ( ) libefa.so.1(EFA_1.2)(64bit) ( ) libefa.so.1(EFA_1.3)(64bit) ( ) libibverbs.so.1(IBVERBS_1.14)(64bit) ( ) libibverbs.so.1(IBVERBS_1.6)(64bit) ( )"
RPROVIDES:libfabric = "libfabric.so.1()(64bit) ( ) libfabric.so.1(FABRIC_1.0)(64bit) ( ) libfabric.so.1(FABRIC_1.1)(64bit) ( ) libfabric.so.1(FABRIC_1.7)(64bit) ( ) libfabric.so.1(FABRIC_1.5)(64bit) ( ) libfabric.so.1(FABRIC_1.2)(64bit) ( ) libfabric.so.1(FABRIC_1.3)(64bit) ( ) libfabric.so.1(FABRIC_1.4)(64bit) ( ) libfabric.so.1(FABRIC_1.6)(64bit) ( ) libfabric ( =  1.22.0-1.el10) libfabric(x86-64) ( =  1.22.0-1.el10)"

URI_libfabric-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfabric-devel-1.22.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfabric-devel = "/usr/bin/pkg-config ( ) libfabric.so.1()(64bit) ( ) libfabric(x86-64) ( =  1.22.0-1.el10)"
RPROVIDES:libfabric-devel = "libfabric-devel ( =  1.22.0-1.el10) libfabric-devel(x86-64) ( =  1.22.0-1.el10) pkgconfig(libfabric) ( =  1.22.0)"
