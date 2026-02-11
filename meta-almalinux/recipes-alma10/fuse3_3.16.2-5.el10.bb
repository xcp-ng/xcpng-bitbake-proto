
PN = "fuse3"
PE = "0"
PV = "3.16.2"
PR = "5.el10"
PACKAGES = "fuse-common fuse3 fuse3-libs fuse3-devel"


URI_fuse-common = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse-common-3.16.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fuse-common = ""
RPROVIDES:fuse-common = "config(fuse-common) ( =  3.16.2-5.el10) fuse-common ( =  3.16.2-5.el10) fuse-common(x86-64) ( =  3.16.2-5.el10)"

URI_fuse3 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse3-3.16.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fuse3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libfuse3.so.3()(64bit) ( ) /etc/fuse.conf ( ) libfuse3.so.3(FUSE_3.3)(64bit) ( ) fuse3-libs ( =  3.16.2-5.el10)"
RPROVIDES:fuse3 = "fuse3 ( =  3.16.2-5.el10) fuse3(x86-64) ( =  3.16.2-5.el10)"

URI_fuse3-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse3-libs-3.16.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fuse3-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:fuse3-libs = "libfuse3.so.3()(64bit) ( ) libfuse3.so.3(FUSE_3.0)(64bit) ( ) libfuse3.so.3(FUSE_3.12)(64bit) ( ) libfuse3.so.3(FUSE_3.2)(64bit) ( ) libfuse3.so.3(FUSE_3.3)(64bit) ( ) libfuse3.so.3(FUSE_3.1)(64bit) ( ) libfuse3.so.3(FUSE_3.4)(64bit) ( ) libfuse3.so.3(FUSE_3.7)(64bit) ( ) fuse3-libs ( =  3.16.2-5.el10) fuse3-libs(x86-64) ( =  3.16.2-5.el10)"

URI_fuse3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fuse3-devel-3.16.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fuse3-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libfuse3.so.3()(64bit) ( ) fuse3-libs ( =  3.16.2-5.el10)"
RPROVIDES:fuse3-devel = "fuse3-devel ( =  3.16.2-5.el10) fuse3-devel(x86-64) ( =  3.16.2-5.el10) pkgconfig(fuse3) ( =  3.16.2)"
