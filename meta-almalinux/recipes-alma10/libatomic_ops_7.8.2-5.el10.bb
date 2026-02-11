
PN = "libatomic_ops"
PE = "0"
PV = "7.8.2"
PR = "5.el10"
PACKAGES = "libatomic_ops libatomic_ops-devel libatomic_ops-static"


URI_libatomic_ops = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libatomic_ops-7.8.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic_ops = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:libatomic_ops = "libatomic_ops.so.1()(64bit) ( ) libatomic_ops_gpl.so.1()(64bit) ( ) libatomic_ops(x86-64) ( =  7.8.2-5.el10) libatomic1 ( =  7.8.2-5.el10) libatomic1(x86-64) ( =  7.8.2-5.el10) libatomic_ops ( =  7.8.2-5.el10)"

URI_libatomic_ops-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libatomic_ops-devel-7.8.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic_ops-devel = "/usr/bin/pkg-config ( ) libatomic_ops.so.1()(64bit) ( ) libatomic_ops_gpl.so.1()(64bit) ( ) libatomic_ops(x86-64) ( =  7.8.2-5.el10)"
RPROVIDES:libatomic_ops-devel = "libatomic_ops-devel ( =  7.8.2-5.el10) libatomic_ops-devel(x86-64) ( =  7.8.2-5.el10) pkgconfig(atomic_ops) ( =  7.8.2)"

URI_libatomic_ops-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libatomic_ops-static-7.8.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic_ops-static = "libatomic_ops-devel(x86-64) ( =  7.8.2-5.el10)"
RPROVIDES:libatomic_ops-static = "libatomic_ops-static ( =  7.8.2-5.el10) libatomic_ops-static(x86-64) ( =  7.8.2-5.el10)"
