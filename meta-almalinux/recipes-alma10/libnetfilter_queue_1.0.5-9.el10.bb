
PN = "libnetfilter_queue"
PE = "0"
PV = "1.0.5"
PR = "9.el10"
PACKAGES = "libnetfilter_queue libnetfilter_queue-devel"


URI_libnetfilter_queue = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnetfilter_queue-1.0.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_queue = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( ) libnfnetlink.so.0()(64bit) ( )"
RPROVIDES:libnetfilter_queue = "libnetfilter_queue.so.1()(64bit) ( ) libnetfilter_queue ( =  1.0.5-9.el10) libnetfilter_queue(x86-64) ( =  1.0.5-9.el10)"

URI_libnetfilter_queue-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnetfilter_queue-devel-1.0.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetfilter_queue-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) kernel-headers ( ) pkgconfig(libnfnetlink) ( ) libnetfilter_queue.so.1()(64bit) ( ) libnfnetlink-devel ( >=  1.0.1) libnetfilter_queue ( =  1.0.5-9.el10)"
RPROVIDES:libnetfilter_queue-devel = "libnetfilter_queue-devel ( =  1.0.5-9.el10) libnetfilter_queue-devel(x86-64) ( =  1.0.5-9.el10) pkgconfig(libnetfilter_queue) ( =  1.0.5)"
