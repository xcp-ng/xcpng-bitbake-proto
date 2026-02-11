
PN = "userspace-rcu"
PE = "0"
PV = "0.14.0"
PR = "7.el10"
PACKAGES = "userspace-rcu userspace-rcu-devel"


URI_userspace-rcu = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/userspace-rcu-0.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:userspace-rcu = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:userspace-rcu = "liburcu.so.8()(64bit) ( ) liburcu-bp.so.8()(64bit) ( ) liburcu-cds.so.8()(64bit) ( ) liburcu-common.so.8()(64bit) ( ) liburcu-mb.so.8()(64bit) ( ) liburcu-memb.so.8()(64bit) ( ) liburcu-qsbr.so.8()(64bit) ( ) liburcu-signal.so.8()(64bit) ( ) userspace-rcu ( =  0.14.0-7.el10) userspace-rcu(x86-64) ( =  0.14.0-7.el10)"

URI_userspace-rcu-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/userspace-rcu-devel-0.14.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:userspace-rcu-devel = "/usr/bin/pkg-config ( ) liburcu-bp.so.8()(64bit) ( ) liburcu-cds.so.8()(64bit) ( ) liburcu-common.so.8()(64bit) ( ) liburcu-mb.so.8()(64bit) ( ) liburcu-memb.so.8()(64bit) ( ) liburcu-qsbr.so.8()(64bit) ( ) liburcu-signal.so.8()(64bit) ( ) liburcu.so.8()(64bit) ( ) userspace-rcu(x86-64) ( =  0.14.0-7.el10)"
RPROVIDES:userspace-rcu-devel = "pkgconfig(liburcu) ( =  0.14.0) pkgconfig(liburcu-bp) ( =  0.14.0) pkgconfig(liburcu-cds) ( =  0.14.0) pkgconfig(liburcu-mb) ( =  0.14.0) pkgconfig(liburcu-memb) ( =  0.14.0) pkgconfig(liburcu-qsbr) ( =  0.14.0) pkgconfig(liburcu-signal) ( =  0.14.0) userspace-rcu-devel ( =  0.14.0-7.el10) userspace-rcu-devel(x86-64) ( =  0.14.0-7.el10)"
