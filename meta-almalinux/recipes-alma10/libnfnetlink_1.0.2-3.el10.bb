
PN = "libnfnetlink"
PE = "0"
PV = "1.0.2"
PR = "3.el10"
PACKAGES = "libnfnetlink libnfnetlink-devel"


URI_libnfnetlink = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnfnetlink-1.0.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnfnetlink = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libnfnetlink = "libnfnetlink.so.0()(64bit) ( ) libnfnetlink.so.0(NFNETLINK_1.0.1)(64bit) ( ) libnfnetlink ( =  1.0.2-3.el10) libnfnetlink(x86-64) ( =  1.0.2-3.el10)"

URI_libnfnetlink-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnfnetlink-devel-1.0.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnfnetlink-devel = "/usr/bin/pkg-config ( ) kernel-headers ( ) libnfnetlink.so.0()(64bit) ( ) libnfnetlink ( =  1.0.2-3.el10)"
RPROVIDES:libnfnetlink-devel = "libnfnetlink-devel ( =  1.0.2-3.el10) libnfnetlink-devel(x86-64) ( =  1.0.2-3.el10) pkgconfig(libnfnetlink) ( =  1.0.2)"
