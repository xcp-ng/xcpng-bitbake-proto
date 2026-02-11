
PN = "mptcpd"
PE = "0"
PV = "0.12"
PR = "6.el10"
PACKAGES = "mptcpd mptcpd-devel"


URI_mptcpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mptcpd-0.12-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mptcpd = "systemd ( ) /sbin/ldconfig ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libell.so.0()(64bit) ( ) libell.so.0(ELL_0.10)(64bit) ( )"
RPROVIDES:mptcpd = "libmptcpd.so.3()(64bit) ( ) libmptcpwrap.so.0()(64bit) ( ) config(mptcpd) ( =  0.12-6.el10) mptcpd ( =  0.12-6.el10) mptcpd(x86-64) ( =  0.12-6.el10)"

URI_mptcpd-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mptcpd-devel-0.12-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mptcpd-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libmptcpd.so.3()(64bit) ( ) mptcpd(x86-64) ( =  0.12-6.el10) pkgconfig(ell) ( >=  0.30)"
RPROVIDES:mptcpd-devel = "mptcpd-devel ( =  0.12-6.el10) mptcpd-devel(x86-64) ( =  0.12-6.el10) pkgconfig(mptcpd) ( =  0.12)"
