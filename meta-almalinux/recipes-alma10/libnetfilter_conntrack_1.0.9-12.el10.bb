
PN = "libnetfilter_conntrack"
PE = "0"
PV = "1.0.9"
PR = "12.el10"
PACKAGES = "libnetfilter_conntrack libnetfilter_conntrack-devel"


URI_libnetfilter_conntrack = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnetfilter_conntrack-1.0.9-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_conntrack = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( ) libmnl.so.0(LIBMNL_1.1)(64bit) ( ) libnfnetlink.so.0()(64bit) ( ) libnfnetlink.so.0(NFNETLINK_1.0.1)(64bit) ( )"
RPROVIDES:libnetfilter_conntrack = "libnetfilter_conntrack.so.3()(64bit) ( ) libnetfilter_conntrack ( =  1.0.9-12.el10) libnetfilter_conntrack(x86-64) ( =  1.0.9-12.el10)"

URI_libnetfilter_conntrack-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnetfilter_conntrack-devel-1.0.9-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_conntrack-devel = "/usr/bin/pkg-config ( ) kernel-headers ( ) pkgconfig(libnfnetlink) ( ) libnetfilter_conntrack.so.3()(64bit) ( ) libnfnetlink-devel ( >=  1.0.1) libnetfilter_conntrack ( =  1.0.9-12.el10)"
RPROVIDES:libnetfilter_conntrack-devel = "libnetfilter_conntrack-devel ( =  1.0.9-12.el10) libnetfilter_conntrack-devel(x86-64) ( =  1.0.9-12.el10) pkgconfig(libnetfilter_conntrack) ( =  1.0.9)"
