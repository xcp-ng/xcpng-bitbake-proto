
PN = "supermin"
PE = "0"
PV = "5.3.5"
PR = "2.el10.alma.1"
PACKAGES = "supermin supermin-devel"


URI_supermin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/supermin-5.3.5-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:supermin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libcom_err.so.2()(64bit) ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) rpm ( ) tar ( ) cpio ( ) libext2fs.so.2()(64bit) ( ) /usr/sbin/mke2fs ( ) util-linux-ng ( ) e2fsprogs-libs ( >=  1.42)"
RPROVIDES:supermin = "supermin ( =  5.3.5-2.el10.alma.1) supermin(x86-64) ( =  5.3.5-2.el10.alma.1)"

URI_supermin-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/supermin-devel-5.3.5-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:supermin-devel = "/usr/bin/bash ( ) rpm-build ( ) findutils ( ) dnf ( ) dnf-plugins-core ( ) supermin ( =  5.3.5-2.el10.alma.1)"
RPROVIDES:supermin-devel = "supermin-devel ( =  5.3.5-2.el10.alma.1) supermin-devel(x86-64) ( =  5.3.5-2.el10.alma.1)"
